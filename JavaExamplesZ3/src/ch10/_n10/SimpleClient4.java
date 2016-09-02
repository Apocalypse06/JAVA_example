package ch10._n10;
// 接收 Server 送來的檔案，存放到 C:\之下
import java.net.*;
import java.io.*;
public class SimpleClient4 {
	public static void main(String args[]) {
		OutputStream s1out = null;
		InputStream s1in = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			Socket s1 = new Socket("127.0.0.1", 5432);
			System.out.println("Client: 與Server連線成功");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			oos = new ObjectOutputStream(s1out);
			long fileSize = 0;
			String filename = "rt.jar";
			File f = new File("c:\\", filename);
			if (f.exists()) {
				fileSize = f.length();
			} else {
				fileSize = 0;
			}
			System.out.println("Client: 先傳送要讀取之檔案的相關資訊給Server");
			FileData fd = new FileData(filename, fileSize);
			oos.writeObject(fd);
			oos.flush();
			fos = new FileOutputStream(f, true);
			int count = 0;
			int n = 0;
			byte[] ba = new byte[10240];
			System.out.println("Client: 準備讀取Server送來的檔案");
			while ((n = s1in.read(ba)) != -1) {
				fos.write(ba, 0, n);
				count += n;
				if (count % 102400 == 0) {
					System.out.println("Client: 讀取的位元組數=" + count);
				}
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
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}