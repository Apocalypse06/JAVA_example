package ch03.lab06.solution;
/*
 �нs�g�{��ch03.lab06.ProgramCh03Lab06�A�bmain()����
 �w�q��Ӿ���ܼ�(int) x, y , �䤺�t�Ȭ�
 100�P3, �к�X���̪��M(+)�A�t(-)�A�n(*)�A��(/)
 �P�l��(%)�A�ñN���G��ܩ�ù��W�C
*/
public class ProgramCh03Lab06 {

	public static void main(String[] args) {
		//1. �b���w�q���ܼ�x, y
		int x = 100;
		int y = 3;
        //2. ��X �M(+)�A�t(-),�n(*)�A��(/)
        // �P�l��(%)�A�ñN���G��ܩ�ù��W�C
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
		System.out.println("x % y = " + (x%y));
	}
}