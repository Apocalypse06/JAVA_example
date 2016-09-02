package ch10._n10;

// �ǰe�ɮ׵� Client�A����ǥ\��
import java.net.*;
import java.io.*;

public class SimpleServer4 {
	public static void main(String args[]) {
		ServerSocket s = null;
		OutputStream s1out = null;
		InputStream s1in = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Server:�ݩR��");
			Socket s1 = s.accept();
			System.out.println("Server: �PClient�s�W�u");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			ois = new ObjectInputStream(s1in);
			FileData fd = (FileData) ois.readObject();
			System.out.println("Server:Ū���Ȥ�ݰe�Ӫ��ɮ׸�T");
			String fileName = fd.fileName;
			long fileSize = fd.fileSize;
			System.out.println("Server:�Ȥ�ݭn�D���ɮצW��=" + fileName);
			System.out.println("Server:�Ȥ�ݤw�����줸�ռ�=" + fileSize);
			fis = new FileInputStream(fileName);
			fis.skip(fileSize);
			int count = 0, n = 0;
			byte[] ba = new byte[10000];
			System.out.println("Server:�}�l�ǰe���");
			while ((n = fis.read(ba)) != -1) {
				s1out.write(ba, 0, n);
				count += n;
				if (count > 20900000) // �o���O���F�{��������ǦӼg��
					break;
			}
			System.out.println("Server:��ƶǰe����. �ǰe���줸�ռ�=" + count);
		} catch (IOException e) {
			System.out.println("Server: �o��IO�ҥ~");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Server: �o�����O�૬�ҥ~");
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