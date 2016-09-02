package ch03.scanner;
import java.util.Scanner;
// 由鍵盤讀入一組資料，有字串、整數、浮點數、布林等，當輸入done結束
public class ScannerDemoMixedData {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0 ; 
        int     i ;
        double  d ;
        boolean b ;
        String   str ;
        
        System.out.println("請輸入一組資料，可以有字串、整數、浮點數、布林等，以done結束");
        while (scan.hasNext()) {
        	if (scan.hasNextInt()) {
        		i = scan.nextInt();
        		System.out.println("讀到整數：" + i);
        	} else if (scan.hasNextDouble()) {
        		d = scan.nextDouble();
        		System.out.println("讀到浮點數：" + d);
        	} else if (scan.hasNextBoolean()) {
        		b = scan.nextBoolean();
        		System.out.println("讀到布林：" + b);
        	} else  {
        		str = scan.next();
        		System.out.println("讀到字串：" + str);
        		if (str.equals("done")) {
        			break ;
        		}
        	}
        }
	}
}
