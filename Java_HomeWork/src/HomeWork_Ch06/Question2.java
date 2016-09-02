package HomeWork_Ch06;

/*
 *寫一個方法可以算出n階乘 
 */

//計算用
class Calculate {
	//回傳輸入階乘總和
	public long _factorial(int n){
		long total = 1;
		for(int i = n; i >= 1; i--){
			total *= i;
		}
		return total;
	}
	
	
}
//main
public class Question2 {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		
		System.out.println(c._factorial(10));
	}
}
