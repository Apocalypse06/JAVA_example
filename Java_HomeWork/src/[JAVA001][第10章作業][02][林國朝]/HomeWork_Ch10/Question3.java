package HomeWork_Ch10;

/*
 * 使用DataIn、OutputStream
 * 把浮點數寫入再讀出
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question3 {
	
	public static void main(String[] args) {
		//把檔案寫入
		try(FileOutputStream fos = new FileOutputStream("D:\\Data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
		){
			dos.writeDouble(17.625);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
		} 
		//把檔案讀出
		try(FileInputStream fis = new FileInputStream("D:\\Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			){
				Double d = dis.readDouble();
				System.out.println(d);
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFound");
			} catch (IOException e) {
				System.out.println("IOException");
			} 
	}

}
