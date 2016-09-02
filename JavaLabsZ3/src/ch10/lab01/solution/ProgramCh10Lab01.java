package ch10.lab01.solution;
/*
	編寫ProgramCh10Lab01.java，在main()方法內讀取專案下的
	Source.gif檔案內的資料，然後再將這些資料寫出到輸出檔
	C:\data資料夾之下，新檔名為MyData.gif。
   
	程式必須判斷C:\data資料夾是否存在，如果不存在，請新建此資料夾。

*/
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ch10.IOUtility;

public class ProgramCh10Lab01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File dir = new File("C:\\data");
		if (!dir.exists()){
			dir.mkdirs();
		}
		File target = new File(dir, "MyData.gif");
		try {
			fis = new FileInputStream("Source.gif");
			fos = new FileOutputStream(target);

			int len;
			byte[] b = new byte[512];
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			System.out.println("資料處理完畢(Ch10Lab01).");
		} catch (IOException e) {
			System.out.println("進行IO時，發生錯誤, 相關訊息為:" + e.getMessage());
		} finally {
			IOUtility.closeStream(fis);
			IOUtility.closeStream(fos);
		}
	}
}
