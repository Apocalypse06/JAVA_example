package ch04;

/*
Q04_17. �L�X2001-2400�����A�L�X�O4�����Ʀ����O100�����ơA
 �Ϊ̬O400�����ơA������`�@���X�ӳo�˪��Ʀr�C 
 (�|�~�N�O�Φ��W�h�ӨM�w��) 
 */
public class Q04_17 {

	public static void main(String[] args) {
		int x = 2001, count = 0;
		while (x <= 2400) {	// �q2001-2400			
			// x��4������100������ �A��x��400������
			if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) { 
				System.out.println(x);
				count++; // �p��[�@
			} 
			x++;
		}
		System.out.println("�@��" + count + "��"); // �L�X�X��
	}
}
