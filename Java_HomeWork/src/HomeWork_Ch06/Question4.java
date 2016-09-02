package HomeWork_Ch06;

/*
 * 寫一個方法，回傳介於1~42整數的陣列
 */

//產生亂數類別
class Number {
	//產生1~42亂數方法
	public int[] _luckyNumbers(){
		int[] arrayInt = new int[6];
		for(int i = 0; i < 6; i++){
			arrayInt[i] = (int)(Math.random() * 42) + 1;
		}
		return arrayInt;
	}
}
//main
public class Question4 {
	public static void main(String[] args) {
		Number n = new Number();
		for(int i = 0; i < 6; i++){
			System.out.println(n._luckyNumbers()[i]);
		}
	}
}
