package ch03.scanner;
import java.util.Scanner;
// ����LŪ�J�@�ռƦr�A���Jdone�����A�M��p��o�ռƦr��������
public class ScannerDemoKeyboard {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0 ; 
        double sum = 0 ;
        System.out.println("�п�J�@�ռƦr�A�Hdone����");
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
        System.out.println("������:" + sum / count);
	}

}
