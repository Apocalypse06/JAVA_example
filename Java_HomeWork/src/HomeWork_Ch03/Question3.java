package HomeWork_Ch03;

import java.util.Scanner;

/*
 *��J��Ӿ�ơA�D�M�t�n�Ӿl�� 
 */

public class Question3 {
	// private static Scanner scanner;

	public static void main(String[] args) {
		// ��J
		Scanner scanner;
		scanner = new Scanner(System.in);
		int intput1 = scanner.nextInt();
		int intput2 = scanner.nextInt();

		/*
		 * String s = null; s = scanner.next(); System.out.println(s); String z
		 * = s.replace('A', 'Z'); System.out.println(z);
		 */
		// ��X
		System.out.println("�M : " + (intput1 + intput2));
		System.out.println("�t : " + (intput1 - intput2));
		System.out.println("�n : " + (intput1 * intput2));
		System.out.println("�� : " + (intput1 / intput2));
		System.out.println("�l : " + (intput1 % intput2));
		// System.out.printf("%d\n" ,intput1);
		// System.out.printf("%.6f" ,x);
		scanner.close();
	}
}
