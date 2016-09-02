package ch10._14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class P2PServer {
	InputStream is = null;
	OutputStream os = null;
	ServerSocket ss = null;
	DataOutputStream dos = null;
	ObjectOutputStream oos = null;
	File sourceDir;

	public P2PServer(int portNo, File sourceDir) throws IOException {
		//�غc�@��ServerSocket����AportNo���n��ť����
		ss = new ServerSocket(portNo);
		this.sourceDir = sourceDir;
		if (!sourceDir.exists()) {
			throw new FileNotFoundException("�ӷ���Ƨ����s�b...");
		}
		startServer();
	}

	private void startServer() throws IOException {
		System.out.println("Server: ����Client���s�u...");
		Socket s = ss.accept();
		System.out.println("Server: �w�PClient�s�u...");
		is = s.getInputStream();
		os = s.getOutputStream();
		//�إߵ{���ݭn��OutputStream����
		dos = new DataOutputStream(os);
		oos = new ObjectOutputStream(os);
	}

	public void sendByte(int n) throws IOException {
		os.write(n);      // �g�@�Ӧ줸�ը�Client��
		System.out.println("Server: �w�ǰe�@�Ӧ줸��:" + (byte) n);
	}

	public void sendMultiBytes(byte... b) throws IOException {
		//�n�g�h�Ӹ�ƨ챵���ݮɡA�@�w�n���i�D�����ݭn�ǰe����ƭӼƩΦ줸�խӼ�
		dos.writeLong(b.length);
		for (byte by : b) {
			dos.write(by);
		}
		System.out.println("Server: �w�ǰe" + b.length + "�Ӧ줸��:  "
				+ Arrays.toString(b));
	}

	public void sendInteger(int n) throws IOException {
		dos.writeInt(n);
		System.out.println("Server: �w�ǰe�@�Ӿ��:" + n);
	}

	public void sendMultiIntegers(int... b) throws IOException {
		dos.writeLong(b.length);
		for (int x : b) {
			dos.writeInt(x);
		}
		System.out.println("Server: �w�ǰe" + b.length + "�Ӿ��:  "
				+ Arrays.toString(b));
	}

	public void sendUTF(String msg) throws IOException {
		dos.writeUTF(msg);
	}

	public void sendMultiUTFs(String... strs) throws IOException {
		dos.writeLong(strs.length);
		for (String str : strs) {
			dos.writeUTF(str);
		}
		System.out.println("Server: �w�ǰe" + strs.length + "�Ӧr��:  "
				+ Arrays.toString(strs));
	}

	public void sendMultiObjects(Object... objs) throws IOException {
		oos.writeLong(objs.length);
		for (Object obj : objs) {
			oos.writeObject(obj);
		}
		System.out.println("Server: �w�ǰe" + objs.length + "�Ӫ���:  "
				+ Arrays.toString(objs));
	}

	public void sendFile(String filename) throws IOException {
		sendFileBeforeSkip(filename, 0);
		System.out.println("Server: �w�ǰe�@���ɮ�:  " + filename);
	}

	public void sendFileBeforeSkip(String filename, long bytesSkip)
			throws IOException {
		FileInputStream fis = null;
		try {
			File realPath = new File(sourceDir, filename);
			fis = new FileInputStream(realPath);
			fis.skip(bytesSkip);
			//available�G�n�e�L�h���줸�ռ�
			long available = fis.available();
			//���i�DClient�ݡG�n�e�L�h���줸�ռ�
			dos.writeLong(available);			
			dos.flush();
			byte[] b = new byte[8192];
			int len = 0;
			// �}�l�ǰe���
			long total = 0 ;
			while ((len=fis.read(b)) != -1) {
				total += len;
				if (total > 11000000)
					break;
				os.write(b, 0, len);
			}
			System.out.println("Server:�ǰe���줸�ռ�:" + total);
			os.flush();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}

	public void sendFileResume() throws IOException {
		DataInputStream dis = null;
		String filename = null;
		long bytesSkip = 0;
		dis = new DataInputStream(is);
		filename = dis.readUTF();
		System.out.println("Server: filename=" + filename);
		bytesSkip = dis.readLong();
		System.out.println("Server: bytesSkip=" + bytesSkip);
		sendFileBeforeSkip(filename, bytesSkip);
		System.out.println("Server: �w�ǰe�@���ɮ�(���):  " + filename);
	}

	public void stop() {
		System.out.println("Server Stopped");
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
		if (ss != null) {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
