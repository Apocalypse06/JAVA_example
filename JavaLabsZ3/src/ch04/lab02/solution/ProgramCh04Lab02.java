package ch04.lab02.solution;

// �m�ߥت��G�F��if�ԭz���Ϊk
// ���ͤ���-5��5���H���üơA�L�X�ӶüơA
// �p�G�ӶüƤj��0�A�h�L�X"���Ƭ�����"�C

public class ProgramCh04Lab02 {
    public static void main(String[] args) {
    	int n = (int)(Math.random() * 11) - 5 ;
    	System.out.println("�H���ü�:" + n);
    	if (n > 0) {
    		System.out.println("���Ƭ�����");
    	}
    }
}
