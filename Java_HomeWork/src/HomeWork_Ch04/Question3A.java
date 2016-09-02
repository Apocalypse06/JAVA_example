package HomeWork_Ch04;

/*
 *1~10連乘 以while完成 
 */

public class Question3A {
	public static void main(String[] args) {
		int ans = 1, i = 1;
		while(i <= 10){
			ans *= i;
			i++;
		}
		System.out.println(ans);
	}
}
