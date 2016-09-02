package ch10._n06;

//接收Server端程式送來的數字(100)

import java.net.*;
import java.io.*;

public class SimpleClient0 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: 與Server連線成功");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			int n = s1in.read();
			System.out.println("Client: 讀取Server送來的數字 =" + n);
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
