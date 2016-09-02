package ch10.lab03.solution;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ch10.IOUtility;

/*
 * �s�gProgramCh10Lab03.java�A�bmain()�����N1��100��100��Long
 * ���A����ƻP�@��Float���A���B�I��17.625�g�J��X��D:\Numbers.dat�C
 * ������A�}���ɮ��`�ޡA���Numbers.dat�A���������j�p����O 804 ��
 * �줸��
 */
public class ProgramCh10Lab03 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("D:\\Numbers.dat");
            dos = new DataOutputStream(fos);
			for(long n=0; n <100; n++){
				dos.writeLong(n);
			}
			dos.writeFloat(17.625F);
			System.out.println("��ƳB�z����(Ch10Lab03).");
		} catch (IOException e) {
			System.out.println("�i��IO�ɡA�o�Ϳ��~, �����T����:" + e.getMessage());
		} finally {
			IOUtility.closeStream(dos);
			IOUtility.closeStream(fos);
		}
	}
}
