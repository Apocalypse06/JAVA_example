package ch10._n07;

// �ǰe���10000��Client��
import java.net.*;
import java.io.*;

public class SimpleServer1 {
	public static void main(String args[]) {
		ServerSocket s = null;
		OutputStream s1out = null;
		InputStream s1in = null;
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
			System.out.println("Server: �_�l�ƥ���");
			e.printStackTrace();
		}

		try {
			System.out.println("Server: Server�ݩR��");
			Socket s1 = s.accept();
			System.out.println("Server: �PClient�s�W�u");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			DataOutputStream dos = new DataOutputStream(s1out);
			dos.writeInt(10000);
			System.out.println("Server: �g�X�Ʀr10000��Client��");
		} catch (IOException e) {
			System.out.println("Server: �o��IO�ҥ~");
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