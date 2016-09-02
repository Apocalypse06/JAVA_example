package HomeWork_Ch05;

import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 輸入某個年月日
 * 計算是該年第幾天
 */

public class Question3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int date = scan.nextInt();
		int[] days = { 0, 31, 28, 31, 30, 31, 30,
				31, 31, 30, 31, 30, 31 };
		//判斷閏年
		GregorianCalendar gc = new GregorianCalendar(); 
		if(gc.isLeapYear(year)) days[2] = 29;
		//計算天數
		int total = 0;
		for(int i = 1; i < (month - 1); i++){
			total += days[i];
		}total += date;
		scan.close();
		System.out.println("為第" + total + "天");
		
	}
	
}
