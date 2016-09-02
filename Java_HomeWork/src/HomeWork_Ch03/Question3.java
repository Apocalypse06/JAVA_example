package HomeWork_Ch03;

import java.util.Scanner;

/*
 *輸入兩個整數，求和差積商餘數 
 */

public class Question3 {
	// private static Scanner scanner;

	public static void main(String[] args) {
		// 輸入
		Scanner scanner;
		scanner = new Scanner(System.in);
		int intput1 = scanner.nextInt();
		int intput2 = scanner.nextInt();

		/*
		 * String s = null; s = scanner.next(); System.out.println(s); String z
		 * = s.replace('A', 'Z'); System.out.println(z);
		 */
		// 輸出
		System.out.println("和 : " + (intput1 + intput2));
		System.out.println("差 : " + (intput1 - intput2));
		System.out.println("積 : " + (intput1 * intput2));
		System.out.println("商 : " + (intput1 / intput2));
		System.out.println("餘 : " + (intput1 % intput2));
		// System.out.printf("%d\n" ,intput1);
		// System.out.printf("%.6f" ,x);
		scanner.close();
	}
}
