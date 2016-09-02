package ch10.lab04.solution;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import ch10.IOUtility;
/*
 * 編寫ProgramCh10Lab04.java，在main()之內讀取由前一個Lab所寫入
 * 到Numbers.dat的100個Long型態的整數與一個Float型態的浮點數，
 * 然後顯示在螢幕上。
 */
public class ProgramCh10Lab04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("D:\\Numbers.dat");
            dis = new DataInputStream(fis);
			for(long n=0; n <100; n++){
				long x = dis.readLong();
				System.out.println("long 型態的資料：" + x);
			}
			float f = dis.readFloat();
			System.out.println("float型態的資料：" + f);
			System.out.println("資料處理完畢(Ch10Lab04).");
		} catch (IOException e) {
			System.out.println("進行IO時，發生錯誤, 相關訊息為:" + e.getMessage());
		} finally {
			IOUtility.closeStream(dis);
			IOUtility.closeStream(fis);
		}
	}
}
