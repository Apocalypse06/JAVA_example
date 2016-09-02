package ch06._03_method.callByValue;

class SwapTwoIntegerPri {
	void swap(int x, int y) {
		// swap()よ猭穦盢肚把计x, yずユ传
		// 把计x把计yずτ盢把计y把计xず
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("盢x籔yユ传, x=" + x + ", y="+y);
	}
}

public class CallByValuePrimitive {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		SwapTwoIntegerPri cbv = new SwapTwoIntegerPri();
		System.out.println("㊣swap()よ猭玡, i=" + i + ", j =" + j);
		cbv.swap(i, j);
		System.out.println("㊣swap()よ猭, i=" + i + ", j =" + j);
		System.out.println("=======================");
	}
}