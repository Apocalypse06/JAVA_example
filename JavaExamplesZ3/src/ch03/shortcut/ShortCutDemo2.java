package ch03.shortcut;
public class ShortCutDemo2 {
	public static void main(String[] args) {
        int total = 100;
        // ���� 0,  1,  2,  3 �|�Ӷü�
		int n= (int)(Math.random()*4)  ;   
	    System.out.println("�ü� n = " + n) ;
	    System.out.println( n == 0  ||  total / n > 50  );
	}
}
