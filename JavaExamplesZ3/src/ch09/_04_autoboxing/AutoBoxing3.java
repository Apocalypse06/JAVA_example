package ch09._04_autoboxing;

public class AutoBoxing3 {
	public static void main(String[] args) {
		Integer iOb, iOb2;
		int i;
		iOb = 100;
		System.out.println("��l�� iOb=" + iOb);
		iOb++;
		System.out.println("�[�@�� iOb=" + iOb);
		iOb2 = iOb + (iOb / 3);
		System.out.println("�p��� iOb2=" + iOb2);
		i = iOb + (iOb / 3);
		System.out.println("�p��� i=" + i);
	}
}