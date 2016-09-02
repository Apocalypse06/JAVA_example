package ch03.cast;

public class ExplicitCast {
	public static void main(String agrs[]) {
		short s = 200;
		s = (short) (s + 1); // int«¬§Oªº¸ê®ÆÂà´«¬°short«¬§O„»NG

		byte b = 100;
		b = (byte) (b + 1);   // int«¬§Oªº¸ê®ÆÂà´«¬°byte«¬§O„»NG

		int i = 100;
		i = i + 1;
		// double«¬§Oªº¸ê®ÆÂà´«¬°float«¬§O„»NG
		@SuppressWarnings("unused")
		float area0 = (float) (30 * 30 * 3.14);

		@SuppressWarnings("unused")
		double area1 = 30 * 30 * 3.14;
	}
}
