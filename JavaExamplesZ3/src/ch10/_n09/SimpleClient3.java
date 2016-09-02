package ch10._n09;

// ���� Server �e�Ӫ��ɮסA�s��� C:\���U
import java.net.*;
import java.io.*;

public class SimpleClient3 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		FileOutputStream fos = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: �PServer�s�u���\");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			fos = new FileOutputStream("c:\\rt.jar");
			int count = 0;
			int n = 0;
			byte[] ba = new byte[10000];
			System.out.println("Client: �ǳ�Ū��Server�e�Ӫ��ɮ�");
			while ((n = s1in.read(ba)) != -1) {
				fos.write(ba, 0, n);
				count += n;
				if (count % 100000 == 0)
					System.out.println("Client: �w�gŪ��Server�e�Ӫ��줸��:" + count);
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
		}
	}
}
