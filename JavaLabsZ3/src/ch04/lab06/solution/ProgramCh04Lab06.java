package ch04.lab06.solution;

// �N�r�� "Hi, �j�a�n!" �@�C�L�X�@�Ӧr��
// �A�i�Q��for�ԭz�PSystem.out.println()�ӧ���

public class ProgramCh04Lab06 {
	public static void main(String[] args) {
		String str = "Hi, �j�a�n!";
		for (int n = 0; n < str.length(); n++) {
			System.out.println(str.charAt(n));
		}
	}
}
