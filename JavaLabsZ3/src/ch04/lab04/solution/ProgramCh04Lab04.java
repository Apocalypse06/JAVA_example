package ch04.lab04.solution;
// �m�ߥت��G�F��if�ԭz���Ϊk
// ���ͤ���-5��5���H���üơA�L�X�ӶüơA
// �p�G�ӶüƤj��0�A�h�L�X"�ӼƬ�����" �A�_�h�p�G�ӶüƤp��0 �A�h
// �L�X"�ӼƬ��t��" �A�_�h�L�X"�ӼƬ�0" 
public class ProgramCh04Lab04 {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 11) - 5;
		System.out.println("�H���ü�:" + n);
		if (n > 0) {
			System.out.println("�ӼƬ�����");
		} else if (n < 0) {
			System.out.println("�ӼƬ��t��");
		} else {
			System.out.println("�ӼƬ�0");
		}
	}
}
