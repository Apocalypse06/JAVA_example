package ch10._03;

// ���{���i�ܦp��Ū�g������
// ���{���|�N���OrdinaryPeople���O������g�X�ɮפ��A
// ���{���Ψ�T�����OOrdinaryPeople/Custom/Human
// �o�T�����O��������@java.io.Serializable,�~��N�o������O������g�X
// �B�J�@�B�N���OrdinaryPeople���O������(op1, op2)�g�J���ɮ�OOSA.TXT��, 
// �B�J�G�B�A���ɮ�OOSA.TXTŪ�X�o��Ӫ���C
// �ϥ����O�GObjectInputStream/ObjectOutputStream/FileInputStream/FileOutputStream 

import java.io.*;

public class ReadWriteObjectsDemo2TWR {
	public static void main(String[] args) {   // 
		OrdinaryPeople op1, op2;
		
		try(
			FileOutputStream fos = new FileOutputStream("OOSA.TXT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			// �B�J�@
			for(int n=0; n < 3;n++){
				oos.writeInt(10000+n);	
			}
			System.out.println("�g�X�T�Ӿ��: 10000, 10001, 10002");
		} catch (IOException e) {
			System.out.println("�o��IOException:" + e);
			e.printStackTrace();
			return;
		} 
		// �B�J�G
		try(
			FileInputStream fis = new FileInputStream("OOSA.TXT");
			ObjectInputStream ois = new ObjectInputStream(fis);	
		) {
			System.out.println("�ǳ�Ū�J�T�Ӿ��:");
			while (true) {
				try {
					// ��Ū�������� Cast�� OrdinaryPeople
					int n  =  (ois.readInt());
					System.out.println("n =" + n);
				} catch (EOFException e) {
					// �p�G��J��y�S���iŪ��������A�{���|��X EOFException
					System.out.println("Ū���ɮ׳̧���");
					break; // �����j��
				}
			}
			System.out.println("Ū�J�T�Ӿ�ơC");
		} catch (IOException e) {
			System.out.println("Error: IOException, " + e);
			e.printStackTrace();
		} 
	}
}