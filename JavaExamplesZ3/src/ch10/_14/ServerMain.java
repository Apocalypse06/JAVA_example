package ch10._14;

import java.io.File;
import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) {
		P2PServer server = null;
		try {
			server = new P2PServer(12345, new File("c:\\data"));
			System.out.println("-----------------------------------------------");
			// �ǰe�@�Ӧ줸�ժ����
			server.sendByte(100);
			System.out.println("-----------------------------------------------");
			// �ǰe�h�Ӧ줸�ժ����
			byte[] b = { (byte) 100, (byte) -128, (byte) 127, (byte) -1 };
			server.sendMultiBytes(b);

			System.out.println("-----------------------------------------------");
			// �ǰe�@�Ӿ��
			server.sendInteger(-10000);
			System.out.println("-----------------------------------------------");
			// �ǰe�h�Ӿ��
			server.sendMultiIntegers(12000, 1984, -100, 7890, 55, 89);
			System.out.println("-----------------------------------------------");
			// �ǰe�@�Ӧr��
			server.sendUTF("Hello, World, �j�a�n");
			System.out.println("-----------------------------------------------");
			// �ǰe�h�Ӧr��
			server.sendMultiUTFs("HelloKitty", "HelloSnoopy", "HelloMicky");
			System.out.println("-----------------------------------------------");
			// �ǰe�h�Ӫ���
			server.sendMultiObjects("HelloPinky", null, new Double(3.14), new Long(9876543210L));
			System.out.println("-----------------------------------------------");
//			// �ǰe�@���ɮ�
//			server.sendFile("rt.jar");			
			// �ǰe�@���ɮסA���
			System.out.println("-----------------------------------------------");
			server.sendFileResume();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				server.stop();
			}
		}

	}
}
