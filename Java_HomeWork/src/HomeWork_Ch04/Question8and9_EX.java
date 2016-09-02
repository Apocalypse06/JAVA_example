package HomeWork_Ch04;

/*
 * 印出題目8+9的合體
 */

public class Question8and9_EX {
	public static void main(String[] args) {
		//從7遞減到-7但跳過0
		//8 - 掉取絕對值 = 印出次數
		for(int i = 7; i > -15; i-- ){
			if(i == 0) continue;
			for(int j = 0; j < 8 - (Math.abs(i)); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
