package ch06._03_method.callByValue;

class SwapTwoIntegerPri {
	void swap(int x, int y) {
		// swap()��k�|�N�ǤJ���Ѽ�x, y�����t�ȥ洫
		// �Ѽ�x���ȩ�J�Ѽ�y���A�ӱN�Ѽ�y���ȩ�J�Ѽ�x��
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("�w�Nx�Py���ȥ洫, x=" + x + ", y="+y);
	}
}

public class CallByValuePrimitive {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		SwapTwoIntegerPri cbv = new SwapTwoIntegerPri();
		System.out.println("�I�sswap()��k�e, i=" + i + ", j =" + j);
		cbv.swap(i, j);
		System.out.println("�I�sswap()��k��, i=" + i + ", j =" + j);
		System.out.println("=======================");
	}
}