package ch10._01;

// ���{���i�ܦp��Ū�g�줸�ո��
// ��k 1. �ѿ�J�ɤ@��Ū�J�@�Ӧ줸�աA�M��NŪ�J���줸�ռg�X���X��
// ��k 2. �ѿ�J�ɤ@��Ū�J�@�Ӧ줸�հ}�C�A�M�ᦹ�N�줸�հ}�C�g�X���X��
// ��J�ɪ��ɦW�ѩR�O�C�Ѽƴ��ѡC
// �i�Q��	long s = System.currentTimeMillis() ; 
//			long e = System.currentTimeMillis() ; 
// ��ԭz���[���ذ���覡Ū�g��ƩҪ�O�����ɶ�
// �ϥ����O�GFileInputStream/FileOutputStream
import java.io.*;

public class ReadWriteBytesDemo {
	public static void main(String[] args) throws IOException {
		// ��k 1:�@��Ū/�g�@�Ӧ줸�ժ���ơA�S���w�İϡA�N�ӶO�j�q�ɶ�
		long s = 0, e = 0;

		File inFile = new File("SamplePictures.zip");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(inFile);
			fos = new FileOutputStream("SamplePicturesA.zip");

			int data = 0;
			System.out.println("�}�lŪ�PSamplePcitures.zip, �줸�ռ�:"
					+ inFile.length());
			System.out.println("��k�@:�C��Ū/�g�@�Ӧ줸��");
			s = System.currentTimeMillis();
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		e = System.currentTimeMillis();
		System.out.println("�ɶ��t(�C��Ū/�g�@�Ӧ줸��)=" + (e - s));
		System.out.println("====================================");
		// ��k 2
		try {
			fis = new FileInputStream(inFile);
			fos = new FileOutputStream("SamplePicturesB.zip");
			System.out.println("��k�G:�C��Ū/�g1024�Ӧ줸��");
			s = System.currentTimeMillis();
			// �H�U���楲���O��
			int count = 0;
			byte[] ba = new byte[1024];
			while ((count = fis.read(ba)) != -1) {
				fos.write(ba, 0, count);
			}
			e = System.currentTimeMillis();
			System.out.println("�ɶ��t(�C��Ū/�g�h�Ӧ줸��)=" + (e - s));
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}