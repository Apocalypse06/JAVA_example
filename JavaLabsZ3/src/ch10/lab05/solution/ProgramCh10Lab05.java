package ch10.lab05.solution;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ch10.IOUtility;
/*
 * �s�gProgramCh10Lab05.java�A�bmain()�����A�N�r��  
 * "Hello, World, �j�a�n"�B��ƪ��� new Integer(54321)
 * �P�B�I�ƪ��� new Double(17.625)�g�J��X�� D:\Object.dat�C
 */
public class ProgramCh10Lab05 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream  oos = null;
		try {
		   fos = new FileOutputStream("D:\\Object.dat");
		   oos = new ObjectOutputStream(fos);
		   oos.writeObject("Hello, World, �j�a�n");
		   oos.writeObject(null);
		   oos.writeObject(new Integer(54321));
		   oos.writeObject( new Double(17.625));
		   System.out.println("��ƳB�z����(Ch10Lab05).");		   
		} catch(IOException e) {
			System.err.println("IO �o�Ͱ��D, �T����=" + e.getMessage());
		} finally {
			IOUtility.closeStream(oos);
			IOUtility.closeStream(fos);
		}
	}
}