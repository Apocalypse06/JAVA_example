package ch03.lab10.solution;
/*
��ƫ��A���P���ܼƤ��������w�A���n�ɥ����i�櫬�A�ഫ(Cast)�A
�Ҧpint���A����ƫ��w��byte���A�N�����i�櫬�A�ഫ�C

�нs�g�{��ch03.lab10.ProgramCh03Lab10�A�b main()���w�qint
���A���ܼ�i�Pj����Ȭ�5�P10�A�N���̬ۥ[����O���w���G

 1. byte���A���ܼ�b
 2. short���A���ܼ�s
 3. int���A���ܼ�n
 4. double���A���ܼ�d
 
 �̫�A�L�X�o���ܼƪ��ȡC
*/
public class ProgramCh03Lab10 {
	public static void main(String[] args) {
		int i=5, j=10;
		byte	b 	= (byte)(i+j);
		short 	s	= (short)(i+j);
		int   	n	= i+j;
		double  d	= i+j;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("n=" + n);
		System.out.println("d=" + d);
		
	}
}
