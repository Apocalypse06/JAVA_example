package ch08.lab02.solution;

// �sĶ�{��ProgramCh08Lab02��, �|���Ϳ��~�T��, �Х[�J�A�� try-catch �϶��Ϩ��������sĶ, �åB�������
// ��sĶ���{���ɡA�|���� MalformedURLException, FileNotFoundException, IOException��Checked
// Exception
import java.net.*;
import java.io.*;

public class ProgramCh08Lab02 {
	public static void main(String[] args) {
		try {
			URL seednet = new URL("http://www.seed.net.tw");
			InputStream is = seednet.openStream();
			FileOutputStream fos = new FileOutputStream("seednet.html");
			byte[] buf = new byte[512];
			int i = 0;
			while ((i = is.read(buf)) != -1) {
				fos.write(buf, 0, i);
			}
			System.out.println("�{������");
		} catch (IOException e) {
			System.out.println("IO���~:" + e.getMessage());
		}
	}
}