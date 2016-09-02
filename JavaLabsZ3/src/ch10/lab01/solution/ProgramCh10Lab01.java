package ch10.lab01.solution;
/*
	�s�gProgramCh10Lab01.java�A�bmain()��k��Ū���M�פU��
	Source.gif�ɮפ�����ơA�M��A�N�o�Ǹ�Ƽg�X���X��
	C:\data��Ƨ����U�A�s�ɦW��MyData.gif�C
   
	�{�������P�_C:\data��Ƨ��O�_�s�b�A�p�G���s�b�A�зs�ئ���Ƨ��C

*/
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ch10.IOUtility;

public class ProgramCh10Lab01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File dir = new File("C:\\data");
		if (!dir.exists()){
			dir.mkdirs();
		}
		File target = new File(dir, "MyData.gif");
		try {
			fis = new FileInputStream("Source.gif");
			fos = new FileOutputStream(target);

			int len;
			byte[] b = new byte[512];
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			System.out.println("��ƳB�z����(Ch10Lab01).");
		} catch (IOException e) {
			System.out.println("�i��IO�ɡA�o�Ϳ��~, �����T����:" + e.getMessage());
		} finally {
			IOUtility.closeStream(fis);
			IOUtility.closeStream(fos);
		}
	}
}
