package ch03.scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// �Ѥ�r��Ū�J�@�ռƦr()�A�M��p��o�ռƦr��������
public class ScannerDemoFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("number.txt");
		fw.write(" 10 asd 10 aaa 2 aa 3 4 5 ");
		fw.close();
		FileReader fr = new FileReader("number.txt");
		// Scanner���ɮ�Ū����Ʈɷ|�۰ʰ����ɮ׵���
        Scanner scan = new Scanner(fr);
        int count = 0 ; 
        double sum = 0 ;
        while (scan.hasNext()) {
        	if (scan.hasNextInt()) {
        		sum += scan.nextInt();
        		count++;
        	} 
        }
        System.out.println("������:" + sum / count);
	}

}
