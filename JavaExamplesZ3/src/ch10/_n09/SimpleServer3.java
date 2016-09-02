package ch10._n09;

// 傳送檔案給 Client
// 必須先將 %JAVA_HOME%\jre\lib\rt.jar 複製到此專案的目錄下
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
			System.out.println("Server: 起始化失敗");
			e.printStackTrace();
		}
		while (true) {
			try {
				System.out.println("Server: Server待命中");
				Socket s1 = s.accept();
				System.out.println("Server: 與Client連上線");
				s1out = s1.getOutputStream();
				s1in = s1.getInputStream();
				fis = new FileInputStream("rt.jar");
				int count = 0;
				int n = 0;
				System.out.println("Server: 準備寫出檔案資料到Client端");
				byte[] ba = new byte[10000];
				while ((n = fis.read(ba)) != -1) {
					s1out.write(ba, 0, n);
					count += n;
				}
				System.out.println("Server: 完成寫出檔案資料到Client端, 總共寫出位元組數為"
						+ count);
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