package ch02.lab08.solution;
/*
 * �b�M��ch02.lab08���A�s�ؤ@���OProgramCh02Lab08.java�A ��
�t main()�A�b main() ����

1.�w�q���char���A���ܼ�ch1, ch2�P�@��int���A���ܼ�n�A
2.�]�wch1���Ȭ� 'A' 
3.�]�wch2���Ȭ� '\u0041'
4.�b�ù��W�L�X�ܼ� ch1, ch2
5.�]�wch1���Ȭ� '��' 
6.�]�wn���Ȭ� '��' 
7.�b�ù��W�L�X�ܼ� ch1, n
 */
public class ProgramCh02Lab08 {
	public static void main(String[] args) {
		char ch1, ch2;
		int n;
		ch1 = 'A';
		ch2 = '\u0041';
		System.out.println(ch1);
		System.out.println(ch2);
		ch1 = '��';
		n = '��';
		System.out.println(ch1);
		System.out.println(n);
	}
}