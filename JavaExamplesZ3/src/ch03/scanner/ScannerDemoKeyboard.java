package ch03.scanner;
import java.util.Scanner;
// 由鍵盤讀入一組數字，當輸入done結束，然後計算這組數字的平均值
public class ScannerDemoKeyboard {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0 ; 
        double sum = 0 ;
        System.out.println("請輸入一組數字，以done結束");
        while (scan.hasNext()) {
        	if (scan.hasNextInt()) {
        		sum += scan.nextInt();
        		count++;
        	} else {
        		String str = scan.next();
        		if (str.equals("done")) {
        			break ;
        		}
        	}
        }
        System.out.println("平均為:" + sum / count);
	}

}
