package ch10.lab07.solution;
/*
 * �s�gProgramCh10Lab07.java�A�bmain()�����A��ѿ�J��
 * Source.txt�H�r�����ɦVŪ�J��ơA�M��A�N�o�Ǹ�Ƽg�X��
 * ��X��D:\MyData.txt�C
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import ch10.IOUtility;

public class ProgramCh10Lab07 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("Source.txt");
			fw = new FileWriter("D:\\MyData.txt");
			char[] ca = new char[512];
			int len = 0;
			while ((len = fr.read(ca)) != -1) {
				fw.write(ca, 0, len);
			}
			System.out.println("��ƳB�z����(Ch10Lab07).");
		} catch (IOException e) {
			System.out.println("IO���~:" + e.getMessage());
		} finally {
			IOUtility.closeStream(fr);
			IOUtility.closeStream(fw);
		}
	}
}