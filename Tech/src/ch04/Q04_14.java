package ch04;
/*
Q04_14.�N�r�� kITTY sNoopY MiCKY �ഫ�� Kitty Snoopy Micky
 (�Ĥ@�Ӧr���j�g�A�䥦���r���Ҭ��p�g) 
 */
public class Q04_14 {
	public static void main(String[] args) {
		//String str = " KITty    SNOOPY miCk   y";
		String str = " KITty    SNOOPY miCky";
		String result = "";
		// �ǳƫ��X��Ӧr��
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // �@�����X�@�Ӧr��
			// �p�G���r���O�ť�
			if (ch == ' ') {
				char t; 
				// �i�঳�\�h�ťզr��
				while ((t = str.charAt(i)) == ' ' && i != str.length() - 1) {
					i++; // i++���ت��O�����ഫ�U�@�Ӧr�������j�g�r��
					result += " ";
				}

				result += Character.toUpperCase(str.charAt(i));

			} else { // ��Ӧr�����O�ťծɨ� else
				if (i == 0) { // �p�G�O�Ĥ@�Ӧr��(�Y�Ĥ@�Ӧr�����O�ť�)
					// �����ন�j�g
					// System.out.print(Character.toUpperCase(str.charAt(i)));
					result += Character.toUpperCase(str.charAt(i));
				} else {
					// �����ন�p�g
					// System.out.print(Character.toLowerCase(str.charAt(i)));
					result += Character.toLowerCase(str.charAt(i));
				}
			}
		}
		System.out.println("�ഫ�e:" + str);
		System.out.println("�ഫ��:" + result);

	}
}
