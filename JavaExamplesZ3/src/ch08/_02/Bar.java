package ch08._02;
public class Bar {
	public void divide() {
		System.out.println("Bar���O��divide()��k�}�l");
		try {
			int sum = 100;
			int no = 0;
			int average = sum / no;
			System.out.println("����=" + average);
		} catch (ArithmeticException e) {
			System.out.println("�o�ͺ�N�ҥ~�G���k�ɤ�����0");
		} finally {
			System.out.println("Bar���O��divide()��finally�϶�");
		}
		System.out.println("Bar���O��divide()��k����");
	}
}
