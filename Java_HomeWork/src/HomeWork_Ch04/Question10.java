package HomeWork_Ch04;

/*
 * 印出
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * FFFFFF
 */

public class Question10 {
	public static void main(String[] args) {
		int c = 'A';
		//ABCDEF轉為整數亦連號
		//遞增相加後轉為字元印出
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < (i + 1); j++){
				System.out.print((char)(c + i));
			}
			System.out.println(" ");
		}
	}
}
