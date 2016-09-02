package ch10.lab03.solution;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ch10.IOUtility;

/*
 * 編寫ProgramCh10Lab03.java，在main()之內將1到100的100個Long
 * 型態的整數與一個Float型態的浮點數17.625寫入輸出檔D:\Numbers.dat。
 * 完成後，開啟檔案總管，找到Numbers.dat，解釋它的大小為何是 804 個
 * 位元組
 */
public class ProgramCh10Lab03 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("D:\\Numbers.dat");
            dos = new DataOutputStream(fos);
			for(long n=0; n <100; n++){
				dos.writeLong(n);
			}
			dos.writeFloat(17.625F);
			System.out.println("資料處理完畢(Ch10Lab03).");
		} catch (IOException e) {
			System.out.println("進行IO時，發生錯誤, 相關訊息為:" + e.getMessage());
		} finally {
			IOUtility.closeStream(dos);
			IOUtility.closeStream(fos);
		}
	}
}
