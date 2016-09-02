package ch04;

public class test {

	public static void main(String[] args) {
		String s = "ABC";
		int x = 0;
		float y = 5.96f;
		double z = 0.87654;
		if(s == "ABC")
			System.out.println("equal true");
		x = (int) y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
