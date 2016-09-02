package ch10._n08;
// 傳送字串到 Client 端
import java.net.*;
import java.io.*;
public class SimpleServer2 {
	public static void main(String args[]) {
		ServerSocket s = null;
		OutputStream s1out = null;
		InputStream s1in = null;
		PrintWriter pw = null;
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
			System.out.println("Server: 起始化失敗");
			e.printStackTrace();
		}
		try {
			System.out.println("Server: Server待命中");
			Socket s1 = s.accept();
			System.out.println("Server: 與Client連上線");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			pw = new PrintWriter(new OutputStreamWriter(s1out));
			pw.println("Hello World, 大家好!!!");
			pw.flush();   // 此敘述很重要
			System.out.println("Server: 寫出字串『Hello World, 大家好!!!』到Client端");
		} catch (IOException e) {
			System.out.println("Server: 發生IO例外");
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
			if (pw != null) {
				pw.close();
			}
		}
	}
}