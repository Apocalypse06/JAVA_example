package HomeWork_Ch04;

/*
 * 1~1000°¸¼Æ©M
 */

public class Question2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 1001; i++){
			if((i % 2) == 0) sum += i;
		}
		System.out.println(sum);
	}
}
