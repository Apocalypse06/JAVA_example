package ch04.if_stmt;

public class IfDemo {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 101);
		System.out.println("����=" + score);
		if (score >= 60) {
			System.out.println("�U��");
			System.out.println("�U��");
			System.out.println("�U��");
		}
	}
}
