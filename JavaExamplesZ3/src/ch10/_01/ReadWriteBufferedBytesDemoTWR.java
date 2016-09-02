package ch10._01;

// ���{���i�ܦp��Ū�g�줸�ո��
// ��k 1. �ѿ�J�ɤ@��Ū�J�@�Ӧ줸�աA�M��NŪ�J���줸�ռg�X���X��
// ��k 2. �ѿ�J�ɤ@��Ū�J�@�Ӧ줸�հ}�C�A�M�ᦹ�N�줸�հ}�C�g�X���X��
// ��J�ɪ��ɦW�ѩR�O�C�Ѽƴ��ѡC
// �i�Q�� long s = System.currentTimeMillis() ; 
//          long e = System.currentTimeMillis() ; 
// ��ԭz���[���ذ���覡Ū�g��ƩҪ�O�����ɶ�
// �ϥ����O�GFileInputStream/FileOutputStream/BufferedInputStream
//              BufferedOutputStream
import java.io.*;
import ch10.util.IOUtility;

public class ReadWriteBufferedBytesDemoTWR {
	public static void main(String[] args) {
		long s = 0, e = 0;
		// ��k 1:�@��Ū/�g�@�Ӧ줸�ժ���ơA���w�İϡA�N���ɰ���į�
		File inFile = new File("SamplePictures.zip");
		try (FileInputStream fis = new FileInputStream(inFile);
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 FileOutputStream fos = new FileOutputStream("SamplePicturesA.zip");
			 BufferedOutputStream bos = new BufferedOutputStream(fos); 
			)
		{
			int data = 0;
			System.out.println("�}�lŪ�PSamplePcitures.zip, �줸�ռ�:"
					+ inFile.length());
			System.out.println("��k�@:�C��Ū/�g�@�Ӧ줸��(���w�İ�)");
			s = System.currentTimeMillis();
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch(IOException ex){
			System.out.println("�o�Ͳ��`: " + ex.getMessage());
		}
		e = System.currentTimeMillis();
		System.out.println("�ɶ��t(�C��Ū/�g�@�Ӧ줸��)=" + (e - s));
		System.out.println("====================================");
		// ��k 2
		try(
			FileInputStream fis = new FileInputStream(inFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("SamplePicturesB.zip");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			System.out.println("��k�G:�C��Ū/�g1024�Ӧ줸��(���w�İ�)");
			s = System.currentTimeMillis();
			// �H�U���楲���O��
			int count = 0;
			byte[] ba = new byte[1024];
			while ((count = bis.read(ba)) != -1) {
				bos.write(ba, 0, count);
			}
			e = System.currentTimeMillis();
			System.out.println("�ɶ��t(�C��Ū/�g�h�Ӧ줸��)=" + (e - s));
		} catch(IOException ex){
			System.out.println("�o�Ͳ��`: " + ex.getMessage());
		}
	}
}