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
 * �s�gProgramCh10Lab08Server.java(Server�{��)�P
 * ProgramCh10Lab08Client.java(Client�{��)��ӵ{���C
 * Server�{������Client�{�����s�u�A��s�W�u�ɡAServer�{��
 * �|�ǰert.jar��Client�{���C
 * 
 */
public class ProgramCh10Lab08Client {
	// ���{���� Client
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
			System.out.println("Client �}�l�������...");
			while ((len = sockin.read(ba)) != -1) {
				fos.write(ba, 0, len);
				count += len;
			}
			System.out.println("Client ��Ʊ�������.  �줸�ռ�=" + count);
		} catch (ConnectException connExc) {
			System.err.println("�L�k�s�W  server, �T����=" + connExc.getMessage());
		} catch (IOException e) {
			System.err.println("IO �o�Ͱ��D, �T����=" + e.getMessage());
		} finally {
			IOUtility.closeStream(fos);
			IOUtility.closeStream(sockout);
			IOUtility.closeStream(sockin);
		}
	}
}