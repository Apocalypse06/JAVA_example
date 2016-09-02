package HomeWork_Ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 讀取simple.tet
 * 印出檔名，大小，行數
 */

public class Question2 {
	public static void main(String[] args) {
		
		File sample = new File("D:\\Sample.txt");
		int count=0;
		StringBuilder sb = new StringBuilder();
		
		try(FileReader fr = new FileReader(sample);
			BufferedReader br = new BufferedReader(fr);
		){
			//檔名、位元組
			System.out.print(sample.getName());
			System.out.println("含有" + sample.length() + "位元組");
			//幾個字元，幾列資料
			String stemp = null;
			while( (stemp = br.readLine())!= null) {
				sb.append(stemp);
				count++;
			}
			System.out.print(sb.length()+ "個字元");
			System.out.println(count + "列資料");	
		} 
		//例外
		catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
