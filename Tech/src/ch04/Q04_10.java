package ch04;

/*
Q04_10.撰寫一個程式，它會在螢幕上顯示下列圖形:
 
 A
 BB
 CCC
 DDDD
 EEEEE
 FFFFFF 

 */
public class Q04_10 {
	public static void main(String[] args) {
		int x, y;
		char ch = 'A';
		for (x = 0; x < 6; x++) {
			for (y = 0; y < x+1; y++) {
				System.out.print((char) (ch + x ));
			}
			System.out.println();
		}
	}
}
