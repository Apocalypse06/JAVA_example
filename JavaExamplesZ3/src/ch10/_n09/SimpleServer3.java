package ch10._n09;

// �ǰe�ɮ׵� Client
// �������N %JAVA_HOME%\jre\lib\rt.jar �ƻs�즹�M�ת��ؿ��U
import java.net.*;
import java.io.*;

public class SimpleServer3 {
	public static void main(String args[]) {
		ServerSocket s = null;
		OutputStream s1out = null;
		InputStream s1in = null;
		FileInputStream fis = null;
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
			System.out.println("Server: �_�l�ƥ���");
			e.printStackTrace();
		}
		while (true) {
			try {
				System.out.println("Server: Server�ݩR��");
				Socket s1 = s.accept();
				System.out.println("Server: �PClient�s�W�u");
				s1out = s1.getOutputStream();
				s1in = s1.getInputStream();
				fis = new FileInputStream("rt.jar");
				int count = 0;
				int n = 0;
				System.out.println("Server: �ǳƼg�X�ɮ׸�ƨ�Client��");
				byte[] ba = new byte[10000];
				while ((n = fis.read(ba)) != -1) {
					s1out.write(ba, 0, n);
					count += n;
				}
				System.out.println("Server: �����g�X�ɮ׸�ƨ�Client��, �`�@�g�X�줸�ռƬ�"
						+ count);
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
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}