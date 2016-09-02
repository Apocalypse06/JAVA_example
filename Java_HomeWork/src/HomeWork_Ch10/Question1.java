package HomeWork_Ch10;

/*
 * 讀入檔案並顯示位元組大小
 */

import java.io.File;

public class Question1 {

	public static void main(String[] args) {
		File f1 = new File("D:\\hello.txt");
		try{
			System.out.println("檔案大小" + f1.length() + "位元組");
		}finally{
			System.out.println("End");
		}
		
	}

}
