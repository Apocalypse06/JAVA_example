package ch10._n08;

// 接收 Server 送來的字串
import java.net.*;
import java.io.*;

public class SimpleClient2 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		BufferedReader br = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: 與Server連線成功");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			br = new BufferedReader(new InputStreamReader(s1in));
			String s = br.readLine();
			System.out.println("Client: 讀取Server送來的字串 =" + s);
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
		}
	}
}