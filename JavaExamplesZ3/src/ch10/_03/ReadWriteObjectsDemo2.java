package ch10._03;

// ���{���i�ܦp��Ū�g������
// ���{���|�N���OrdinaryPeople���O������g�X�ɮפ��A
// ���{���Ψ�T�����OOrdinaryPeople/Custom/Human
// �o�T�����O��������@java.io.Serializable,�~��N�o������O������g�X
// �B�J�@�B�N���OrdinaryPeople���O������(op1, op2)�g�J���ɮ�OOSA.TXT��, 
// �B�J�G�B�A���ɮ�OOSA.TXTŪ�X�o��Ӫ���C
// �ϥ����O�GObjectInputStream/ObjectOutputStream/FileInputStream/FileOutputStream 

import java.io.*;

public class ReadWriteObjectsDemo2 {
	public static void main(String[] args) {   // 
		OrdinaryPeople op1, op2;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			// �B�J�@
			fos = new FileOutputStream("OOSA.TXT");
			oos = new ObjectOutputStream(fos);
			for(int n=0; n < 3;n++){
				oos.writeInt(10000+n);	
			}
			
		} catch (IOException e) {
			System.out.println("�o��IOException:" + e);
			e.printStackTrace();
			return;
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// 
//		// �B�J�G
		try {
			fis = new FileInputStream("OOSA.TXT");
			ois = new ObjectInputStream(fis);
			while (true) {
				try {
					// ��Ū�������� Cast �� OrdinaryPeople
					int n  =  (ois.readInt());
					System.out.println("n     =" + n);
				} catch (EOFException e) {
					// �p�G��J��y�S���iŪ��������A�{���|��X EOFException
					System.out.println("End of file reached");
					break; // �����j��
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Error: IOException, " + e);
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
	}
}