package HomeWork_Ch02;
import HomeWork_Ch10.Cat;
/*
 *�ĤG�� 1.
 *���������P���n
*/
//sysout alt+/
//ctrl shift o
public class Question1 {
	public static void main(String[] args) {
		//�ƭ�
		int x = 12, y = 6;
		//�P�����n
		int total_Length = (x + y) * 2;
		int area = x * y;
		//
		System.out.println("�P�� : " + total_Length);
		System.out.println("���n : " + area);
		System.out.println("total : " + factr(3));
	}
	static int factr(int n)
	{
	    return n<=0 ? 1 : n*factr(n-1);
	}
}
