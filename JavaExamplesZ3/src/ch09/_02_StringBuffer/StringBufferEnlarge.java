package ch09._02_StringBuffer;

public class StringBufferEnlarge {
	public static void main(String[] args) {
		StringBuffer sb0 = new StringBuffer();
		System.out.println("�s��StringBuffer����, sb0=" + sb0.toString() + " sb0.capacity()=" + sb0.capacity());
		for (int i=1; i<=100; i++) {
			sb0.append("aa");
		    System.out.println("�[�J" + i + "�Ӧr��, length=" + sb0.length() + " sb0.capacity()=" + sb0.capacity());
		}
	}
}