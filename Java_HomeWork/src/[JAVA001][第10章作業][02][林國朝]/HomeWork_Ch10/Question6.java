package HomeWork_Ch10;

/*
 * 讀出cat與dog物件
 * 並執行smile方法
 * (必須共同繼承mammal，而mammal得記得實作序列話介面)
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question6 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Mammal[] animal = new Mammal[4]; 
		//讀檔
		File ObjF = new File("D:\\data", "Object.dat");
		try(FileInputStream fis = new FileInputStream(ObjF);
			ObjectInputStream ois = new ObjectInputStream(fis)
		){
			for(int i = 0; i < 4; i++){
				animal[i] = (Mammal)ois.readObject();
				animal[i]._smile();
			}
		}
	}
}
