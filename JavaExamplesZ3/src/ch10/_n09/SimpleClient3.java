package ch10._n09;

// 接收 Server 送來的檔案，存放到 C:\之下
import java.net.*;
import java.io.*;

public class SimpleClient3 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		FileOutputStream fos = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: 與Server連線成功");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			fos = new FileOutputStream("c:\\rt.jar");
			int count = 0;
			int n = 0;
			byte[] ba = new byte[10000];
			System.out.println("Client: 準備讀取Server送來的檔案");
			while ((n = s1in.read(ba)) != -1) {
				fos.write(ba, 0, n);
				count += n;
				if (count % 100000 == 0)
					System.out.println("Client: 已經讀取Server送來的位元組:" + count);
			}
			System.out.println("Client: 讀取完畢，Server送來的總位元組:" + count);
		} catch (ConnectException e) {
			System.out.println("Client: 無法與Server連線");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Client: 發生IO例外");
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
