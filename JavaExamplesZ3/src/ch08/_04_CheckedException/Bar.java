package ch08._04_CheckedException;

// �����O�N�ʺA���إ߬Y�����O������A�s�g���{���ɨä����D
// �n�غc���������O�W�١A�]���L�k������ 
// Object o = new Object(); ���ԭz�ӫغc����C
// Java�y����Class���O�i�ΨӸѨM�o�Ӱ��D�C
// �n�إߤ��������O�W�ٱN�b����ɥ��ɮ�Ū�J�C
// 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bar {
	public void divide() {
		System.out.println("Bar���O��divide()��k�}�l");
		Mammal m = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("c:\\JavaShared\\className.txt");
			// �W���ԭz�����غc�l�|��X FileNotFoundExcepxion,
			// ���ҥ~�� IOException ���l���O
			br = new BufferedReader(fr);
			String classname = br.readLine();
			Class c = Class.forName(classname);
			Object obj = c.newInstance();
			if (obj instanceof Mammal) {
				m = (Mammal) obj;
				m.smile();
			}
			// Mammal m = new Mammal(); // ���ԭz�P�W�����C�ԭz�L�k���� 
		} catch (IOException e) {
			System.out.println("�o�ͨҥ~�G" + e.getClass().getName());
		} catch (ClassNotFoundException e) {
			System.out.println("�o�ͨҥ~�G" + e.getClass().getName());
		} catch (InstantiationException e) {
			System.out.println("�o�ͨҥ~�G" + e.getClass().getName());
		} catch (IllegalAccessException e) {
			System.out.println("�o�ͨҥ~�G" + e.getClass().getName());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
				// �W�����close()�|��XIOException
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Bar���O��divide()��k����");
	}
}