package ch03.scanner;
import java.util.Scanner;

// ����LŪ�J��Ӿ�ơA�M��p��o��Ӿ�ƪ����n
public class ScannerDemoTwoInts {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		System.out.println("�п�J��Ӿ�ơG");
		if (scan.hasNextInt()) {
			x = scan.nextInt();
		}
		if (scan.hasNextInt()) {
			y = scan.nextInt();
		}
		System.out.println("��Ӿ�ƪ����n��:" + x * y);
	}

}
