package HomeWork_Ch03;

/*
 *計算256559是幾天幾小時幾分幾秒 
 */

public class Question2 {
	public static void main(String[] args) {
		byte b = 10;
		b = (byte)(b + 1);
		
		
		//算各單位秒數
		int question_s = 256559;
		int min_s = 60;
		int hour_s = min_s * min_s;
		int day_s = hour_s * 24;
		//印出商數，存回餘數
		System.out.print((question_s / day_s) + "天");
		System.out.print(((question_s %= day_s)/hour_s) + "小時");
		System.out.print((question_s %= hour_s)/min_s + "分");
		System.out.print((question_s %= min_s) + "秒");		
	}
}
