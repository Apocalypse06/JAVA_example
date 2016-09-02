package ch03.scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// 由文字檔讀入一組數字()，然後計算這組數字的平均值
public class ScannerDemoFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("number.txt");
		fw.write(" 10 asd 10 aaa 2 aa 3 4 5 ");
		fw.close();
		FileReader fr = new FileReader("number.txt");
		// Scanner由檔案讀取資料時會自動偵測檔案結束
        Scanner scan = new Scanner(fr);
        int count = 0 ; 
        double sum = 0 ;
        while (scan.hasNext()) {
        	if (scan.hasNextInt()) {
        		sum += scan.nextInt();
        		count++;
        	} 
        }
        System.out.println("平均為:" + sum / count);
	}

}
