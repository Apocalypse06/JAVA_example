package ch04;

/*
Q04_19.計算1-1000中，所有13倍數的總和。
 */
public class Q04_19 {
	public static void main(String[] args) {
		int x = 1, sum = 0;
		while (x <= 1000) {    // 從1~1000
			if (x % 13 == 0) { // 若為13倍數
				sum += x;      // 值相加
			}
			x++;
		}
		System.out.println("13倍數之數字總和為" + sum);
	}
}
