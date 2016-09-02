package ch04;

import java.util.Scanner;

/*
Q04_13.由鍵盤輸入10個Java隨堂測驗的成績，它們是介於0-100的整數，請由程式統計該
 組成績中介於 90-100、80-89、70-79、60-69 以及 0-59 的分數各有多少個，
 必須分別用if敘述及switch敘述來解本題。

 */
public class Q04_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y;
		int sum90_100 = 0, sum80_89 = 0, sum70_79 = 0, sum60_69 = 0, sum59_0 = 0;
		while (true){
			x++;
			if (x > 10)break;
			//switch 
			System.out.println("請輸入第" + x + "個測驗成績(1-100):");
			if (scan.hasNextInt()) {
				y = scan.nextInt();
				if (y >= 0 && y <= 100) {
					int s = y / 10;
					//System.out.println(s);
					switch (s) {
					case 10:
					case 9:
						sum90_100++;
						break;
					case 8:
						sum80_89++;
						break;
					case 7:
						sum70_79++;
						break;
					case 6:
						sum60_69++;
						break;
					default:
						sum59_0++;
						break;
					}
				} else {
					System.out.println("錯誤");
					x--;
				}
			} else {
				System.out.println("錯誤");
				x--;
				scan.next();
				continue;
			}
		}
	    scan.close();
		System.out.println("90~100分共有" + sum90_100 + "人");
		System.out.println("80~ 89分共有" + sum80_89 + "人");
		System.out.println("70~ 79分共有" + sum70_79 + "人");
		System.out.println("60~ 69分共有" + sum60_69 + "人");
		System.out.println(" 0~ 59分共有" + sum59_0 + "人");

	}
}
