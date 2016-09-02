package ch10._n07;

//����Server�ݵ{���e�Ӫ��Ʀr(10000)
import java.net.*;
import java.io.*;

public class SimpleClient1 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		DataInputStream dis = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: �PServer�s�u���\");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			dis = new DataInputStream(s1in);
			int n = dis.readInt();
			System.out.println("Client: Ū��Server�e�Ӫ��Ʀr =" + n);
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
		}
	}
}
