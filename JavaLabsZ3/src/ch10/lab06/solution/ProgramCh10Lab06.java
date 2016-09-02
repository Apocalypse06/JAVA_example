package ch10.lab06.solution;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ch10.IOUtility;

/* 
 * �s�gProgramCh10Lab06.java�A�bmain()����Ū���ѫe�@��Lab�Ҽg�J
 * ��Object.dat���T�Ӫ���A�M����ܦb�ù��W�C
 */
public class ProgramCh10Lab06 {
	public static void main(String[] args) {
		FileInputStream fos = null;
		ObjectInputStream oos = null;
		try {
			fos = new FileInputStream("D:\\Object.dat");
			oos = new ObjectInputStream(fos);
			while (true) {
				try {
					Object o = oos.readObject();
					if (o instanceof String) {
						String s = (String) o;
						System.out.println("String=" + s);
					} else if (o instanceof Integer) {
						Integer i = (Integer) o;
						System.out.println("Integer=" + i);
					} else if (o instanceof Double) {
						Double d = (Double) o;
						System.out.println("Double =" + d);
					} else {
						System.out.println("Object=" + o);
					}
				} catch (EOFException e) {
					System.out.println("�ɮ�Ū������...");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("���O�ഫ�ɵo�Ͱ��D, �T����=" + e.getMessage());
				}
			}

		} catch (IOException e) {
			System.err.println("IO �o�Ͱ��D, �T����=" + e.getMessage());
		} finally {
			IOUtility.closeStream(oos);
			IOUtility.closeStream(fos);
		}
	}
}