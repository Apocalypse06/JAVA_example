package HomeWork_Ch10;

/*
 * 把dog與cat物件寫入檔案內
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Question5 {
	public static void main(String[] args) {
		Cat cat1 = new Cat("CAT1");
		Cat cat2 = new Cat("CAT2");
		Dog dog1 = new Dog("Dog1");
		Dog dog2 = new Dog("Dog2");
		//建目錄寫檔
		File dir = new File("D:\\data");
		if(!dir.exists())dir.mkdir();
		File ObjF = new File("D:\\data\\Object.dat");
		//寫檔
		try(
			FileOutputStream fos = new FileOutputStream(ObjF);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(cat1);
			oos.writeObject(cat2);
			oos.writeObject(dog1);
			oos.writeObject(dog2);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
			
	}
	
	
}
