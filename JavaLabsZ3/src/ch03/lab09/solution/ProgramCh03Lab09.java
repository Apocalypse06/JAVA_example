package ch03.lab09.solution;

/*
 �нs�g�{��ch03.lab09.ProgramCh03Lab09�A�b main()���w�q�@��
 double���A���ܼ� d , ��Ȭ�19583.1415�A
 1. �N�ܼ�d���w��float���A���ܼ�f ;
 2. �N�ܼ�f���w��short���A���ܼ�s ;
 3. �N�ܼ�s���w��byte���A���ܼ�b ;
 4. �N�ܼ�d���w��int���A���ܼ�i ;
 5. �N�ܼ�i���w���ܼ�s ;
 6. �L�X�o���ܼƪ��ȡC
 */
public class ProgramCh03Lab09 {
	public static void main(String[] args) {
		double	d 	= 19583.1415;
		float	f 	= (float)d;
		short	s 	= (short)f;
		byte	b 	= (byte)s;
		int 	i	= (int)d;
		s	= (short)i;
		System.out.println("d=" + d);
		System.out.println("f=" + f);
		System.out.println("i=" + i);
		System.out.println("s=" + s);
		System.out.println("b=" + b);
	}
}
