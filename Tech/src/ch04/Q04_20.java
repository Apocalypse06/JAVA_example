package ch04;

/*
Q04_20.�N���ܼƪ����e�洫�q�`�g��
 int x = 10;
 int y = 20;
 int temp = x ;
 x = y ;
 y = temp;

 ���]����ؤ��ݭn�ĤT���ܼƪ����k�A�䤤�@�جO
 x = x + y;
 y = x - y;
 x = x - y;
 System.out.println("x="  + x + ", y=" + y);
 �мg�X�t�~�@�ذ��k�C 

 */
public class Q04_20 {
	public static void main(String[] args) {
		int x, y;
		x = 3;
		y = 4;
		System.out.println("�洫�e,x=" + x + ",y=" + y);
		x = x - y;
		y = x + y;
		x = y - x;
		System.out.println("�洫��,x=" + x + ",y=" + y);
		System.out.println("-------------------------" );
		x = 3;
		y = 4;
		System.out.println("�洫�e,x=" + x + ",y=" + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("�洫��,x=" + x + ",y=" + y);

	}

}
