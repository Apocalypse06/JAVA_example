package HomeWork_Ch04;

/*
 * 1~10連乘 以FOR完成
 */

public class Question3 {
	public static void main(String[] args) {
		int ans = 1;
		for(int i = 1; i <= 10; i++){
			ans *= i;
		}
		System.out.println(ans);
	}
}
