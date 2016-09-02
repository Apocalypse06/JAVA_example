package ch10._14;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
 
public class ClientMain {

	public static void main(String[] args) {
		P2PClient client = null;
		try {
			client = new P2PClient("127.0.0.1", 12345, new File("D:\\data"));
			System.out.println("Client: �w�g�PServer�s�u...");
			System.out.println("-----------------------------------------------");
			//�����@�Ӧ줸�ժ����
		    int o = client.receiveByte();
			System.out.println("Client: �w�gŪ��Server�e�Ӫ����Ӧ줸��, n=" + (byte)o);
			System.out.println("-----------------------------------------------");
			//�����h�Ӧ줸�ժ����
			Collection<Byte> collb = client.receiveMultiBytes();
			for(Byte b: collb){
				byte by = b;
			    System.out.println("Client: Ū�쪺�줸�� =" + by);
			}

			System.out.println("-----------------------------------------------");
			//�����@�Ӿ�ƪ����
		    int i1 = client.receiveInteger();
			System.out.println("Client: Ū�쪺���=" + i1);
			System.out.println("-----------------------------------------------");
			//�����h�Ӿ�ƪ����
			Collection<Integer> colli = client.receiveMultiIntegers();
			for(int i: colli){
			    System.out.println("Client: Ū�쪺��� =" + i);
			}
//			//�����@�Ӧr��
		    String msg = client.receiveUTF();
			System.out.println("Client: Ū�쪺�r��=" + msg);
			System.out.println("-----------------------------------------------");
//			//�����h�Ӧr��
			Collection<String> colls = client.receiveMultiUTFs();
			for(String str: colls){
			    System.out.println("Client: Ū�쪺�r�� =" + str);
			}
			System.out.println("-----------------------------------------------");
			//�����h�Ӫ���
			Collection<Object> collo = client.receiveMultiObjects();
			for(Object obj: collo){
			    System.out.println("Client: Ū�쪺���� =" + obj);
			}
			System.out.println("-----------------------------------------------");
//			// �����@���ɮ�
//			client.receiveFile("rt.jar");
//			System.out.println("Client: �������ɮ�");
//			System.out.println("-----------------------------------------------");
			// �����@���ɮ�(���)
			client.receiveFileResume("rt.zip");
			System.out.println("Client: �������ɮ�(���)");
			System.out.println("-----------------------------------------------");
	
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (client != null) {
				//client.stop();
			}
		}

	}

}
