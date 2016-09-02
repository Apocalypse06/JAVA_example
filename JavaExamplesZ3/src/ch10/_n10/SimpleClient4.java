package ch10._n10;
// ���� Server �e�Ӫ��ɮסA�s��� C:\���U
import java.net.*;
import java.io.*;
public class SimpleClient4 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: �PServer�s�u���\");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			oos = new ObjectOutputStream(s1out);
			long fileSize = 0;
			String filename = "rt.jar";
			File f = new File("c:\\", filename);
			if (f.exists()) {
				fileSize = f.length();
			} else {
				fileSize = 0;
			}
			System.out.println("Client: ���ǰe�nŪ�����ɮת�������T��Server");
			FileData fd = new FileData(filename, fileSize);
			oos.writeObject(fd);
			oos.flush();
			fos = new FileOutputStream(f, true);
			int count = 0;
			int n = 0;
			byte[] ba = new byte[10240];
			System.out.println("Client: �ǳ�Ū��Server�e�Ӫ��ɮ�");
			while ((n = s1in.read(ba)) != -1) {
				fos.write(ba, 0, n);
				count += n;
				if (count % 102400 == 0) {
					System.out.println("Client: Ū�����줸�ռ�=" + count);
				}
			}
			System.out.println("Client: Ū�������AServer�e�Ӫ��`�줸��:" + count);
		} catch (ConnectException e) {
			System.out.println("Client: �L�k�PServer�s�u");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Client: �o��IO�ҥ~");
			e.printStackTrace();
		} finally {
			if (s1out != null) {
				try {
					s1out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (s1in != null) {
				try {
					s1in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}