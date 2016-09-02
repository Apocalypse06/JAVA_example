package ch10.lab08.solution;
/* 
 * �s�gProgramCh10Lab08Server.java(Server�{��)�P
 * ProgramCh10Lab08Client.java(Client�{��)��ӵ{���C
 * Server�{������Client�{�����s�u�A��s�W�u�ɡAServer�{��
 * �|�ǰert.jar��Client�{���C
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
	// ���{���� Server, �ϥΪ� Port Number �� 54321
	public static void main(String[] args) {
		String fileName = "C:\\Program Files\\Java\\jre7\\lib\\rt.jar";
		OutputStream sockout = null;
		InputStream sockin = null;
		FileInputStream fis = null;
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(54321);
			while (true) {
				System.out.println("Server �ݩR��...");
				Socket sock = ss.accept();
				System.out.println("Server ����s�u�ШD...");
				sockout = sock.getOutputStream();
				sockin = sock.getInputStream();
				fis = new FileInputStream(fileName);
				byte[] ba = new byte[1024];
				int len = 0;
				int count = 0;
				System.out.println("Server �}�l�ǰe���...");
				while ((len = fis.read(ba)) != -1) {
					sockout.write(ba, 0, len);
					count += len;
				}
				System.out.println("Server �ǰe��Ƨ���. �줸�ռ�=" + count);
			}
		} catch (IOException e) {
			System.err.println("IO �o�Ͱ��D, �T����=" + e.getMessage());
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
