package ch10._06;

import java.io.*;
//�{���\��:
	// 1.�����p��ϥ�IO���O���걵: IO���O���걵���z�L�غc�l�ӧ����C
	// 2.�����j�q��ƿ�X/��J�ɡA�ϥ�BufferedOutputStream���O�P
	// BufferedInputStream�����į઺�v�T�C
	//
	// ���楻�{����A���ӥh��BufferedOutputStream/BufferedInputStream
	// ���O������A�A����@���A�H�K������檺�ɶ��t�C
	// �ϥ����O�GFileInputStream/FileOutputStream/BufferedInputStream
    //              BufferedOutputStream/DataInputStream/DataOutputStream
public class StreamConcatedDemoTWR {
	
	public static void main(String[] args)  {
		
		long start, end;
		try(
			FileOutputStream fos = new FileOutputStream("c:\\data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
		) {
			start = System.currentTimeMillis();
			for (int n = 1; n <= 1000000; n++) {
				dos.writeInt(1234567 + n);
			}
			end = System.currentTimeMillis();
			System.out.println("�g�X1000000����Ʃһݮɶ�:" + (end - start));
		} catch(IOException e){
			e.printStackTrace();
		}
		
		start = System.currentTimeMillis();
		
		try(
			FileInputStream fis = new FileInputStream("c:\\data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);		
		) {
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
		}catch(IOException e){
			e.printStackTrace();
		} 
		
	}
}
