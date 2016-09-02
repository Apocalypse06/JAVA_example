package ch03.scanner;
import java.util.Scanner;

// 由鍵盤讀入兩個整數，然後計算這兩個整數的乘積
public class ScannerDemoTwoInts {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		System.out.println("請輸入兩個整數：");
		if (scan.hasNextInt()) {
			x = scan.nextInt();
		}
		if (scan.hasNextInt()) {
			y = scan.nextInt();
		}
		System.out.println("兩個整數的乘積為:" + x * y);
	}

}
