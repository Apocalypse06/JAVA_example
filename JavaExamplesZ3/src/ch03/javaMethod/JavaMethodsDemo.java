package ch03.javaMethod;

public class JavaMethodsDemo {
	public static void main(String args[]) {
		double x = Math.random();
		System.out.println("(1) �H���ü� x = " + x);

		double d = 2.1400000000000002;
		System.out.println("(2) �|�ˤ��J, d=" + Math.round(d * 100) / 100.0);

		String s = "9876";
		System.out.println("(3) �N�r��\"9876\"�ഫ�����9876�A�M��A�[4 = "
				+ Integer.parseInt(s) + 4);

		String vat = "0.0567";
		System.out.println("(4) �N�r��\"0.0567\"�ഫ���B�I��0.0567�A�M��A��100 = "
				+ Double.parseDouble(vat) * 100);

		System.out.println("(5) �r�� vat ������ = " + vat.length());

		System.out.println("(6) �r�� s ���Ĥ@�Ӧr���� = " + s.charAt(0) + ", �̫�@�Ӧr���� = "
				+ s.charAt(s.length() - 1));

		System.out.println("(7) �r��vat���ĤT�Ӧr���H�᪺�r�ꬰ = " + vat.substring(2));

		System.out.println("(8) �r��s���ĤG�B�T�Ӧr���ҧΦ����r�ꬰ = " + s.substring(1, 3));

		System.out.println("(9) �p���I�b�r�� vat ���s���� = " + vat.indexOf("."));

		System.out.println("(10) �̫�@��0�b�r��vat���s���� = " + vat.lastIndexOf("0"));

		String hello = " Hello World!  ";
		System.out.println("(11) �r�� hello �h���Y���ť� = " + hello.trim());
	}
}
