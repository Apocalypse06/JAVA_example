package ch04;

/*
Q04_20.將兩變數的內容交換通常寫成
 int x = 10;
 int y = 20;
 int temp = x ;
 x = y ;
 y = temp;

 但也有兩種不需要第三個變數的做法，其中一種是
 x = x + y;
 y = x - y;
 x = x - y;
 System.out.println("x="  + x + ", y=" + y);
 請寫出另外一種做法。 

 */
public class Q04_20 {
	public static void main(String[] args) {
		int x, y;
		x = 3;
		y = 4;
		System.out.println("交換前,x=" + x + ",y=" + y);
		x = x - y;
		y = x + y;
		x = y - x;
		System.out.println("交換後,x=" + x + ",y=" + y);
		System.out.println("-------------------------" );
		x = 3;
		y = 4;
		System.out.println("交換前,x=" + x + ",y=" + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("交換後,x=" + x + ",y=" + y);

	}

}
