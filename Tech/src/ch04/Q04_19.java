package ch04;

/*
Q04_19.�p��1-1000���A�Ҧ�13���ƪ��`�M�C
 */
public class Q04_19 {
	public static void main(String[] args) {
		int x = 1, sum = 0;
		while (x <= 1000) {    // �q1~1000
			if (x % 13 == 0) { // �Y��13����
				sum += x;      // �Ȭۥ[
			}
			x++;
		}
		System.out.println("13���Ƥ��Ʀr�`�M��" + sum);
	}
}
