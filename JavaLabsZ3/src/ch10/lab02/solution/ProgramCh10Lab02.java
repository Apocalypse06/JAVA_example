package ch10.lab02.solution;
/*
	�s�gProgramCh10Lab02.java�A�bmain()��k��Ū���M��
	�U��Source.gif�ɮפ�����ơA�M��A�N�o�Ǹ�Ƽg�X���X��
	C:\data��Ƨ����U�A�s�ɦW��MyData.gif�C

 	�o�ӽm�߻Plab01�p�P�A���L�n�[�WBufferedInputStream
 	�PBufferedOutputStream������O�C

*/
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ch10.IOUtility;

public class ProgramCh10Lab02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		File dir = new File("C:\\data");
		if (!dir.exists()){
			dir.mkdirs();
		}
		File target = new File(dir, "MyData.gif");
		try {
			fis = new FileInputStream("Source.gif");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(target);
			bos = new BufferedOutputStream(fos);
			int len;
			byte[] b = new byte[512];
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
			System.out.println("��ƳB�z����(Ch10Lab02).");
		} catch (IOException e) {
			System.out.println("�i��IO�ɡA�o�Ϳ��~, �����T����:" + e.getMessage());
		} finally {
			IOUtility.closeStream(bis);
			IOUtility.closeStream(fis);
			IOUtility.closeStream(bos);
			IOUtility.closeStream(fos);
		}
	}
}
