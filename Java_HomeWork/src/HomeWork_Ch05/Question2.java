package HomeWork_Ch05;

/*
 * 隨機產生六個1~42個隨機數，不重複
 */

public class Question2 {
	public static void main(String[] args) {
		int[] array = new int[6];
		int r = 0;
		//有重複時索引不往前加
		for(int i = 0; i < array.length; i++){
			r = (int)(Math.random() * 42) + 1;
			array[i] = r;
			for(int j = i - 1; j >= 0; j--){
				if(array[j] == r) i--;
			}
		}	
		
		//print
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
