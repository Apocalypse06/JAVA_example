package HomeWork_Ch06;

/*
 *�g�@�Ӥ�k�i�H��Xn���� 
 */

//�p���
class Calculate {
	//�^�ǿ�J�����`�M
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
