package ch04.if_stmt;

public class IfElseIfDemo {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 130);
		System.out.println("����=" + score);
		if (score >= 60 && score <= 100) {
			System.out.println("�U��");
			System.out.println("�U��");
			System.out.println("�U��");
		} else if (score >= 50 && score <= 59) {
			System.out.println("����");
		} else if (score >= 0 && score <= 49) {
			System.out.println("����");
		} else {
			System.out.println("���ƿ��~");
		}
	}
}
