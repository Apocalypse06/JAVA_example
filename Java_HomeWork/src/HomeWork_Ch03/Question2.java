package HomeWork_Ch03;

/*
 *�p��256559�O�X�ѴX�p�ɴX���X�� 
 */

public class Question2 {
	public static void main(String[] args) {
		byte b = 10;
		b = (byte)(b + 1);
		
		
		//��U�����
		int question_s = 256559;
		int min_s = 60;
		int hour_s = min_s * min_s;
		int day_s = hour_s * 24;
		//�L�X�ӼơA�s�^�l��
		System.out.print((question_s / day_s) + "��");
		System.out.print(((question_s %= day_s)/hour_s) + "�p��");
		System.out.print((question_s %= hour_s)/min_s + "��");
		System.out.print((question_s %= min_s) + "��");		
	}
}
