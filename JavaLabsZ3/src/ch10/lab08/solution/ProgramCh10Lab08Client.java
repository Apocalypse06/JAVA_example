package ch10.lab08.solution;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import ch10.IOUtility;
/* 
 * 編寫ProgramCh10Lab08Server.java(Server程式)與
 * ProgramCh10Lab08Client.java(Client程式)兩個程式。
 * Server程式等待Client程式的連線，當連上線時，Server程式
 * 會傳送rt.jar給Client程式。
 * 
 */
public class ProgramCh10Lab08Client {
	// 本程式為 Client
	public static void main(String[] args) {
		OutputStream sockout = null;
		InputStream sockin = null;
		FileOutputStream fos = null;
		try {
			Socket sock = new Socket("127.0.0.1", 54321);
			sockout = sock.getOutputStream();
			sockin = sock.getInputStream();
			File dataDir = new File("c:\\java\\Ch10\\data");
			if (!dataDir.exists()) {
				dataDir.mkdirs();
			}
			File rtFile = new File(dataDir, "rt.jar");
			fos = new FileOutputStream(rtFile);
			int count = 0;
			int len = 0;
			byte[] ba = new byte[1024];
			System.out.println("Client 開始接收資料...");
			while ((len = sockin.read(ba)) != -1) {
				fos.write(ba, 0, len);
				count += len;
			}
			System.out.println("Client 資料接收完畢.  位元組數=" + count);
		} catch (ConnectException connExc) {
			System.err.println("無法連上  server, 訊息為=" + connExc.getMessage());
		} catch (IOException e) {
			System.err.println("IO 發生問題, 訊息為=" + e.getMessage());
		} finally {
			IOUtility.closeStream(fos);
			IOUtility.closeStream(sockout);
			IOUtility.closeStream(sockin);
		}
	}
}