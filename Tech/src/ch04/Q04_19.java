package ch04;

/*
Q04_19.璸衡1-1000い┮Τ13计羆㎝
 */
public class Q04_19 {
	public static void main(String[] args) {
		int x = 1, sum = 0;
		while (x <= 1000) {    // 眖1~1000
			if (x % 13 == 0) { // 璝13计
				sum += x;      // 
			}
			x++;
		}
		System.out.println("13计ぇ计羆㎝" + sum);
	}
}
