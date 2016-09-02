package ch10._03;

// ���{���i�ܦp��Ū�g������
// ���{���|�N�@�Ӿ�ơB�@�ӯB�I�ơB���null�B�@�Ӧr�ꪫ��B�@�Ӿ�ƪ���B
// �P���OrdinaryPeople���O������g�X�ɮפ��C
// ���{���Ψ�T�����OOrdinaryPeople/Custom/Human
// �o�T�����O��������@java.io.Serializable,�~��N�o������O������g�X
// �B�J�@�B�N���OrdinaryPeople���O������(op1, op2)�g�J���ɮ�OOSA.TXT��, 
// �B�J�G�B�A���ɮ�OOSA.TXTŪ�X�o��Ӫ���C
// �ϥ����O�GObjectInputStream/ObjectOutputStream/FileInputStream/FileOutputStream 

import java.io.*;
import ch10.util.IOUtility;

public class ReadWriteObjectsDemo {
	public static void main(String[] args) {   // 
		OrdinaryPeople op1, op2=null;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			// �B�J�@
			fos = new FileOutputStream("OOSA.TXT");
			oos = new ObjectOutputStream(fos);
			// �g�X���
			oos.writeInt(10000);
			// �g�X�B�I��			
			oos.writeFloat(17.625F);
			// �Nnull�g�X��stream��			
			oos.writeObject(null);
			// ���ͤ@�� OrdinaryPeople ����
			Custom c = new Custom("Chinese", "rice");
			op1 = new OrdinaryPeople(c, 35, "John", "Chinese");
			// �N����op1�g�X��stream��
			oos.writeObject(op1);
			// �NString����g�X��stream��			
			oos.writeObject("HelloKitty");			
			// �NInteger����g�X��stream��			
			oos.writeObject(new Integer(123456));			
			// ���ͥt�@�� OrdinaryPeople ����
			// �Nnull�g�X��stream��			
			oos.writeObject(null);
			c = new Custom("Brazil", "Bread");
			op1 = new OrdinaryPeople(c, 35, "Mary", "Latin");
			// �N����op2�g�X��stream��
			oos.writeObject(op1);
		} catch (IOException e) {
			System.out.println("�o��IOException:" + e);
			e.printStackTrace();
			return;
		} finally {
			IOUtility.closeStream(oos);
			IOUtility.closeStream(fos);
		}
		// �B�J�G
		try {
			fis = new FileInputStream("OOSA.TXT");
			ois = new ObjectInputStream(fis);
			// Ū�����
			int   n = ois.readInt();
			// Ū���B�I��			
			float f = ois.readFloat();
			System.out.println("Ū����    =" + n);
			System.out.println("Ū��B�I��=" + f);
			Object o = null;
			while (true) {
				try {
					// ��Ū�������� ���O�ഫ(Cast)�� OrdinaryPeople
					o = ois.readObject();
					if (o instanceof OrdinaryPeople) {
					   op2 = (OrdinaryPeople) (o);
					} else if (o instanceof String) {
					   String s = (String)o;
					   System.out.println("Ū��r�ꪫ��:" + s);
					   continue;
					} else if (o instanceof Integer) {
					   Integer i = (Integer)o;
					   System.out.println("Ū���ƪ���:" + i);
					   continue;
					}
				}  catch (ClassNotFoundException e) {
					System.out.println("�䤣�����O:" + e);
					break;
				} catch (EOFException e) {
					// �p�G��J��y�S���iŪ��������A�{���|��X EOFException
					System.out.println("��Ƥw�g����Ū������");
					break; // �����j��
				}
				if (o == null) {
					System.out.println("Ū�쪺����Onull");
				} else {
			    System.out.println("Ū��OrdinaryPeople����:");
				System.out.println("Name     =" + op2.name);
				System.out.println("Age      =" + op2.age);
				System.out.println("Ethnic   =" + op2.ethnic);
				System.out.println("Language =" + op2.custom.language);
				System.out.println("Food     =" + op2.custom.majorFood);
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Error: IOException, " + e);
			e.printStackTrace();
		} finally {
			IOUtility.closeStream(ois);
			IOUtility.closeStream(fis);
		}
	}
}