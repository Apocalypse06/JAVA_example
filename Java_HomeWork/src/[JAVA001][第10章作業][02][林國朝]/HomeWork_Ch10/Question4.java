package HomeWork_Ch10;

/*
 * �H���[�Ҧ��g�J1~1000�üƤQ��
 * �AŪ�X��
 */

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Question4 {

	public static void main(String[] args) {
		//���ɮ׼g�J
		try(FileOutputStream fos = new FileOutputStream("D:\\DataR.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			FileWriter fw = new FileWriter("D://DataR.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			){
				for(int i = 0; i < 10; i++){
					int r = (int) (Math.random() * 1001);
					System.out.println(r);
					bw.write(r);
				}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
		} 		
		//Ū��
		//while(true){
			try(FileInputStream fis = new FileInputStream("D:\\Data.txt");
				DataInputStream dis = new DataInputStream(fis);
			){
				int i = dis.readInt();
				System.out.println(i);
			}
			//�ҥ~���}
			catch (EOFException e) {
				System.out.println("EOF");
				//break;
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFound");
			} catch (IOException e) {
				System.out.println("IOException");
			} 	
		//}

	}

}
