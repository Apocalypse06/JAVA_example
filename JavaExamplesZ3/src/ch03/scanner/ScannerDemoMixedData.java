package ch03.scanner;
import java.util.Scanner;
// ����LŪ�J�@�ո�ơA���r��B��ơB�B�I�ơB���L���A���Jdone����
public class ScannerDemoMixedData {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0 ; 
        int     i ;
        double  d ;
        boolean b ;
        String   str ;
        
        System.out.println("�п�J�@�ո�ơA�i�H���r��B��ơB�B�I�ơB���L���A�Hdone����");
        while (scan.hasNext()) {
        	if (scan.hasNextInt()) {
        		i = scan.nextInt();
        		System.out.println("Ū���ơG" + i);
        	} else if (scan.hasNextDouble()) {
        		d = scan.nextDouble();
        		System.out.println("Ū��B�I�ơG" + d);
        	} else if (scan.hasNextBoolean()) {
        		b = scan.nextBoolean();
        		System.out.println("Ū�쥬�L�G" + b);
        	} else  {
        		str = scan.next();
        		System.out.println("Ū��r��G" + str);
        		if (str.equals("done")) {
        			break ;
        		}
        	}
        }
	}
}
