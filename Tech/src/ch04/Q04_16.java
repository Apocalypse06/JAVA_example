package ch04;
/* 
Q04_16:  
    ���D����while()�ԭz�Pcontinue�ԭz�ӧ����C
    �L�X1-100���Ʀr�B���ƪ�����B���ƪ��ߤ�A���O�J�줭�����ƫh
    ���L�X�C  
 */
public class Q04_16 {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {		// ��1����100����
			if (x % 5 == 0) { 	// �p�Gx���H5�A�l�Ƭ�0
				x++;          	// �p�G�S���o�@��A�|���͵L�a�j��
				continue;		// ���L�����j��     
			} else {
				/*int pow2 = (int) Math.pow(x, 2);
				int pow3 = (int) Math.pow(x, 3);
				System.out.println("�Ʀr" + x + "������=" + pow2 + ", �ߤ�="+ pow3);*/
				// �_�h�L�X
				//System.out.println("�Ʀr" + x + "������=" + x * x + ", �ߤ�="+ x * x * x);
				x++;
			}

		}

	}
}
