package HomeWork_Ch03;

import java.util.Scanner;

/*
 *��J�T�Ӧr��A�L�X���� 
 */

public class Question4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		//��J
		scanner = new Scanner(System.in);
		String intputS1 = scanner.nextLine();
		String intputS2 = scanner.nextLine();
		

		//��X
		System.out.println("NextLine()>>>>>");
		System.out.println("S1 : " + intputS1 +" : "+ (intputS1.length()));
		System.out.println("S2 : " + intputS2 +" : "+ (intputS2.length()));
		System.out.println("\n");
		
		intputS1 = scanner.next();
		intputS2 = scanner.next();
		String intputS3 = scanner.next();
		System.out.println("Next()>>>>>");
		System.out.println("S1 : " + intputS1 +" : "+ (intputS1.length()));
		System.out.println("S2 : " + intputS2 +" : "+ (intputS2.length()));
		System.out.println("S3 : " + intputS3 +" : "+ (intputS2.length()));
		scanner.close();
	}
}
