package HomeWork_Ch04;

/*
 * �H������1~100���10�Ӭۥ[
 */

public class Question1 {
	public static void main(String[] args) {
		int sum = 0, r = 0;
		for(int i =0; i < 10; i++){
			r = (int)(Math.random() * 101);
			if(r > 0 & r < 101){
				System.out.println("R"+ (i + 1) + " : " + r);
				sum += r;
			} else{
				i--;
			}
		}
		System.out.println("Sum : " + sum);
	}
}
