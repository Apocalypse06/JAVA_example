package ch10._14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;

public class P2PClient {
	InputStream is;
	OutputStream os;
	DataInputStream dis = null;
	ObjectInputStream ois = null;
	Socket s = null;
	File targetDir;

	public P2PClient(String serverIp, int portNo, File targetDir)
			throws IOException {
		this.targetDir = targetDir;
		if (!targetDir.exists()) {
			targetDir.mkdirs();
		}
		s = new Socket(serverIp, portNo);
		is = s.getInputStream();
		os = s.getOutputStream();
		dis = new DataInputStream(is);
		ois = new ObjectInputStream(is);
	}

	public int receiveByte() throws IOException {
		int n = 0;
		n = is.read();
		if (n == -1) {
			throw new EOFException();
		}
		return n;
	}

	public Collection<Byte> receiveMultiBytes() throws IOException {

		Collection<Byte> c = new ArrayList<>();
		long size = dis.readLong();
		for (int n = 0; n < size; n++) {
			byte b = (byte) dis.read();
			c.add(b);
		}

		System.out.println("Client: �w����" + c.size() + "�Ӧ줸��:");

		return c;
	}

	public int receiveInteger() throws IOException {
		int n = 0;
		n = dis.readInt();
		System.out.println("Client: �w����1�Ӿ��.");
		return n;
	}

	public Collection<Integer> receiveMultiIntegers() throws IOException {
		Collection<Integer> c = new ArrayList<>();
		long size = dis.readLong();
		for (int x = 0; x < size; x++) {
			int n = dis.readInt();
			c.add(n);
		}
		System.out.println("Client: �w����" + c.size() + "�Ӿ��.");
		return c;
	}

	public String receiveUTF() throws IOException {
		String msg = null;
		msg = dis.readUTF();
		System.out.println("Client: �w����1�Ӧr��.");
		return msg;
	}

	public Collection<String> receiveMultiUTFs() throws IOException {
		Collection<String> c = new ArrayList<>();

		long size = dis.readLong();
		for (int x = 0; x < size; x++) {
			String str = dis.readUTF();
			c.add(str);
		}

		System.out.println("Client: �w����" + c.size() + "�Ӧr��");
		return c;
	}

	public Object receiveObject() throws IOException, ClassNotFoundException {
		Object obj = null;
		obj = ois.readObject();
		return obj;
	}

	public Collection<Object> receiveMultiObjects() throws IOException,
			ClassNotFoundException {
		Collection<Object> c = new ArrayList<>();
		long size = ois.readLong();
		for (int x = 0; x < size; x++) {
			Object obj = ois.readObject();
			c.add(obj);
		}
		System.out.println("Client: �w����" + c.size() + "�Ӫ���");
		return c;
	}

	public void receiveFile(String filename) throws IOException {
		receiveFile(filename, false);
		System.out.println("Client: �w�����@���ɮ�:  " + filename);
	}

	public void receiveFile(String filename, boolean append) throws IOException {
		FileOutputStream fos = null;
		File realPath = new File(targetDir, filename);
		fos = new FileOutputStream(realPath, append);
		//����Server��Ū�����n�e�Ӫ��줸�ռ�
		long size = dis.readLong();  // �`�@�nŪ�����줸�ռ�  
		
		byte[] b = new byte[8192];
		int len = 0;
		int total = 0 ; 
		while (true) {
			len=is.read(b);   		// �Ѻ���ŪServer�e�Ӫ����
			fos.write(b, 0, len);   	// �g���ɮפ�
			//System.out.println("Client: len=" + len);
			size -= len;   				// ��������Ū�����줸�ռ�
			total += len;				// ���ԭz�[���
			if (size <= 0)            // �p�G�|��Ū�����줸�ռƵ���0
				break;
		}
		System.out.println("Client: �������줸�ռ�:" + total);
		fos.close();
	}

	public void receiveFileResume(String filename) throws IOException {
		DataOutputStream dos = null;
		long bytesSkip = 0;
		dos = new DataOutputStream(os);
		dos.writeUTF(filename);
		System.out.println("Client �w�g�X: filename=" + filename);
		File file = new File(targetDir, filename);
		long fileSize = file.length();
		dos.writeLong(fileSize);
		System.out.println("Client �w�g�X: fileSize=" + fileSize);
		
		dos.flush();
		receiveFile(filename, true);
	}

	public void stop() {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (s != null) {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
