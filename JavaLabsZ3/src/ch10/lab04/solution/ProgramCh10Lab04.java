package ch10.lab04.solution;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import ch10.IOUtility;
/*
 * �s�gProgramCh10Lab04.java�A�bmain()����Ū���ѫe�@��Lab�Ҽg�J
 * ��Numbers.dat��100��Long���A����ƻP�@��Float���A���B�I�ơA
 * �M����ܦb�ù��W�C
 */
public class ProgramCh10Lab04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("D:\\Numbers.dat");
            dis = new DataInputStream(fis);
			for(long n=0; n <100; n++){
				long x = dis.readLong();
				System.out.println("long ���A����ơG" + x);
			}
			float f = dis.readFloat();
			System.out.println("float���A����ơG" + f);
			System.out.println("��ƳB�z����(Ch10Lab04).");
		} catch (IOException e) {
			System.out.println("�i��IO�ɡA�o�Ϳ��~, �����T����:" + e.getMessage());
		} finally {
			IOUtility.closeStream(dis);
			IOUtility.closeStream(fis);
		}
	}
}
