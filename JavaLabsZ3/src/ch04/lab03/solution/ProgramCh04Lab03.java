package ch04.lab03.solution;

// �m�ߥت��G�F��if�ԭz���Ϊk
// ���ͤ���1��10���H���üơA�L�X�ӶüơA
// �p�G�ӶüƬ����ơA�h�L�X"���Ƭ�����"�A�_�h�L�X"���Ƭ��_��"

public class ProgramCh04Lab03 {
    public static void main(String[] args) {
    	int n = (int)(Math.random() * 10) + 1 ;
    	System.out.println("�H���ü�:" + n);
    	if (n % 2 == 0) {
    		System.out.println("���Ƭ�����");
    	} else {
    		System.out.println("���Ƭ��_��");
    	}
    }
}
