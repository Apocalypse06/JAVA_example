package ch10._04;

// ���{���ۿ�J��Source.txt�v�r��Ū�J, �M��A�N�o�Ǥ�r��Ƽg�X���X��Target.txt 
// �������Ū�J/�g�X�覡�G
// �@�B�C��Ū�B�g�@�Ӧr��
// �G�B�C��Ū�B�g�@�Ӧr���}�C
// �i�Q�� long s = System.currentTimeMillis() ; 
//          long e = System.currentTimeMillis() ; 
// ��ԭz���[���ذ���覡Ū�g��ƩҪ�O�����ɶ� 
// �ϥ����O�GFileReader/FileWriter
import java.io.*;

import ch10.util.IOUtility;

public class ReadWriteCharactersDemoTWR {
	public static void main(String args[]) throws IOException {
		long s = 0, e = 0;
		// �C��Ū/�g�@�Ӧr��
		try(
			FileReader fr = new FileReader("Source.txt");
			FileWriter fw = new FileWriter("Target.txt");				
		) {
			int ch;
			s = System.currentTimeMillis();
			System.out.println("�}�l�ɶ�=" + s);
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			e = System.currentTimeMillis();
			System.out.println("�����ɶ�=" + e);
			System.out.println("�ɶ��t(�C��Ū/�g�@�Ӧr��)=" + (e - s));
		} 
		// �C��Ū/�g�h�Ӧr��(8192�Ӧr��)
		try(
			FileReader fr = new FileReader("Source.txt");
			FileWriter fw = new FileWriter("Target.txt");				
		) {
			s = System.currentTimeMillis();
			// �H�U���楲���O��
			int count = 0;
			char[] ca = new char[8192];
			while ((count = fr.read(ca)) != -1) {
				fw.write(ca, 0, count);
			}
			e = System.currentTimeMillis();
			System.out.println("�ɶ��t(�C��Ū/�g�h�Ӧr��)=" + (e - s));
		} 
	}
}