package ch10._02;

// �B�J�@�B�g�X�@�ӯB�I��(17.625f)�P�Q�Ӿ�ƨ��X��Target.dat,
// �B�J�G�B�A��Target.dat(���ɥ��@����J��)Ū�J���B�I�ƻP�Q�Ӿ�ơC                                  
// �ϥ����O�GDataInputStream/DataOutputStream/
//          FileInputStream/FileOutputStream

import java.io.*;
import ch10.util.IOUtility;

public class ReadWritePrimitivesDemo {
	public static void main(String args[]) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			// �B�J�@
			System.out.println("�B�J�@: �N�@�ӯB�I��(17.625f)�P�Q�Ӿ�Ƽg�X��Target.dat");
			fos = new FileOutputStream("Target.dat");
			dos = new DataOutputStream(fos);
			dos.writeFloat(17.625f);
			for (int i = 0; i < 10; i++) {
				dos.writeInt(98765432 + i);
			}
			System.out.println("�B�J�@: �g�X���\\n");
		} catch (IOException e) {
			System.out.println("�o��IOException..e=" + e);
			return;
		} finally {
			IOUtility.closeStream(dos);
			IOUtility.closeStream(fos);
		}
		// �B�J�G
		System.out.println("�B�J�G: ��Target.datŪ�J���");
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("Target.dat");
			dis = new DataInputStream(fis);
			float f;
			int i;
			f = dis.readFloat();
			System.out.println("�B�I�� f=" + f);
			System.out.println("�Q�Ӿ�ơG");
			while (true) {
				try {
					i = dis.readInt();
					System.out.println("i=" + i);
				} catch (EOFException e) {
					// ���B����ܬ����T��
					System.out.println("���Ū������");
					break;
				}
			}
			System.out.println("�B�J�G: Ū�J��Ʀ��\");
		} catch (IOException e) {
			System.out.println("�o��IOException..e=" + e);
		} finally {
			IOUtility.closeStream(dis);
			IOUtility.closeStream(fis);
		}
	}
}