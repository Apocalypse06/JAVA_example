package HomeWork_Ch04;

/*
 * 印出
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 
 * 1 2 3 4 5 6 7 8 
 * 1 2 3 4 5 6 7 
 * 1 2 3 4 5 6 
 * 1 2 3 4 5 
 * 1 2 3 4 
 * 1 2 3 
 * 1 2 
 * 1
 */

public class Question5 {
	public static void main(String[] args) {
		//每一列減掉要多印的次數
		for(int i = 1 ;i <= 10; i++){
			for(int j = 1; j <= (11 - i); j++){
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
