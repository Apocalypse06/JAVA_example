package HomeWork_Ch04;

/*
 * for印出題目訊息
 * 1 4 9 16 25 36 49 64 81 100
 */

public class Question4 {
	public static void main(String[] args) {
		int now = 1;
		//遞增大小為3 6 9 11...至19
		//差為2、起始是3
		for(int i = 3; i < 22; i+=2){
			System.out.print(now + " ");
			now += i;
		}	
	}
}
