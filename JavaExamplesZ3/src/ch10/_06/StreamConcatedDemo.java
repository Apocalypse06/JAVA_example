package ch10._06;

import java.io.*;
import ch10.util.IOUtility;
//�{���\��:
	// 1.�����p��ϥ�IO���O���걵: IO���O���걵���z�L�غc�l�ӧ����C
	// 2.�����j�q��ƿ�X/��J�ɡA�ϥ�BufferedOutputStream���O�P
	// BufferedInputStream�����į઺�v�T�C
	//
	// ���楻�{����A���ӥh��BufferedOutputStream/BufferedInputStream
	// ���O������A�A����@���A�H�K������檺�ɶ��t�C
	// �ϥ����O�GFileInputStream/FileOutputStream/BufferedInputStream
    //              BufferedOutputStream/DataInputStream/DataOutputStream
public class StreamConcatedDemo {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		long start, end;
		try {
			start = System.currentTimeMillis();
			fos = new FileOutputStream("c:\\data.txt");
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			for (int n = 1; n <= 1000000; n++) {
				dos.writeInt(1234567 + n);
			}
			end = System.currentTimeMillis();
			System.out.println("�g�X1000000����Ʃһݮɶ�:" + (end - start));
		} finally {
			IOUtility.closeStream(dos);
			IOUtility.closeStream(bos);
			IOUtility.closeStream(fos);
		}
		start = System.currentTimeMillis();
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("c:\\data.txt");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			while (true) {
				try {
					int i = dis.readInt();
				} catch (EOFException e) {
					System.out.println("���Ū������");
					break;
				}
			}
			end = System.currentTimeMillis();
			System.out.println("Ū��1000000����Ʃһݮɶ�:" + (end - start));
		} finally {
			IOUtility.closeStream(dis);
			IOUtility.closeStream(bis);
			IOUtility.closeStream(fis);
		}
	}
}
