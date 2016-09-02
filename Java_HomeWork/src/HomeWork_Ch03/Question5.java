package HomeWork_Ch03;

/*
 *隨機產生1~42亂數六個 
 */

public class Question5 {
	public static void main(String[] args) {
		int x = 0;
		// 判斷範圍，印六次
		for (int i = 0; i < 6;) {
			x = (int) (Math.random() * 101);
			if (x > 0 && x < 43) {
				System.out.println(x);
				i++;
			}
		}
	}
}
