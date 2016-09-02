package ch10.lab08.solution;
/* 
 * 編寫ProgramCh10Lab08Server.java(Server程式)與
 * ProgramCh10Lab08Client.java(Client程式)兩個程式。
 * Server程式等待Client程式的連線，當連上線時，Server程式
 * 會傳送rt.jar給Client程式。
 * 
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import ch10.IOUtility;
public class ProgramCh10Lab08Server {
	// 本程式為 Server, 使用的 Port Number 為 54321
	public static void main(String[] args) {
		String fileName = "C:\\Program Files\\Java\\jre7\\lib\\rt.jar";
		OutputStream sockout = null;
		InputStream sockin = null;
		FileInputStream fis = null;
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(54321);
			while (true) {
				System.out.println("Server 待命中...");
				Socket sock = ss.accept();
				System.out.println("Server 收到連線請求...");
				sockout = sock.getOutputStream();
				sockin = sock.getInputStream();
				fis = new FileInputStream(fileName);
				byte[] ba = new byte[1024];
				int len = 0;
				int count = 0;
				System.out.println("Server 開始傳送資料...");
				while ((len = fis.read(ba)) != -1) {
					sockout.write(ba, 0, len);
					count += len;
				}
				System.out.println("Server 傳送資料完畢. 位元組數=" + count);
			}
		} catch (IOException e) {
			System.err.println("IO 發生問題, 訊息為=" + e.getMessage());
		} finally {
			IOUtility.closeStream(fis);
			IOUtility.closeStream(sockout);
			IOUtility.closeStream(sockin);
			try {
				ss.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
