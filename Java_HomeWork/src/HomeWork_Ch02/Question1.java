package HomeWork_Ch02;
import HomeWork_Ch10.Cat;
/*
 *第二章 1.
 *長方形邊長與面積
*/
//sysout alt+/
//ctrl shift o
public class Question1 {
	public static void main(String[] args) {
		//數值
		int x = 12, y = 6;
		//周長面積
		int total_Length = (x + y) * 2;
		int area = x * y;
		//
		System.out.println("周長 : " + total_Length);
		System.out.println("面積 : " + area);
		System.out.println("total : " + factr(3));
	}
	static int factr(int n)
	{
	    return n<=0 ? 1 : n*factr(n-1);
	}
}
