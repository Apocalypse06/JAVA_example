package ch10._n10;

// 傳送檔案給 Client，有續傳功能
import java.net.*;
import java.io.*;

public class SimpleServer4 {
	public static void main(String args[]) {
		ServerSocket s = null;
		OutputStream s1out = null;
		InputStream s1in = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Server:待命中");
			Socket s1 = s.accept();
			System.out.println("Server: 與Client連上線");
			s1out = s1.getOutputStream();
			s1in = s1.getInputStream();
			ois = new ObjectInputStream(s1in);
			FileData fd = (FileData) ois.readObject();
			System.out.println("Server:讀取客戶端送來的檔案資訊");
			String fileName = fd.fileName;
			long fileSize = fd.fileSize;
			System.out.println("Server:客戶端要求的檔案名稱=" + fileName);
			System.out.println("Server:客戶端已有的位元組數=" + fileSize);
			fis = new FileInputStream(fileName);
			fis.skip(fileSize);
			int count = 0, n = 0;
			byte[] ba = new byte[10000];
			System.out.println("Server:開始傳送資料");
			while ((n = fis.read(ba)) != -1) {
				s1out.write(ba, 0, n);
				count += n;
				if (count > 20900000) // 這兩行是為了程式說明續傳而寫的
					break;
			}
			System.out.println("Server:資料傳送完畢. 傳送的位元組數=" + count);
		} catch (IOException e) {
			System.out.println("Server: 發生IO例外");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Server: 發生類別轉型例外");
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