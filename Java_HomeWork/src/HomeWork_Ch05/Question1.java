package HomeWork_Ch05;

/*
 * 印出陣列的平均數、與大於平均的數
 */

public class Question1 {
	public static void main(String[] args) {
		double[] array = { 84.0, 94, 79.9, 90.5, 82.4,
				65.7, 72.8, 99.0, 85.2, 100 };
		double average = 0;
		double total = 0;
		//取得總和再除得平均
		for(int i = 0; i < array.length; i++){
			total += array[i];
		}
		average = total / array.length;
		System.out.println("Average : " + average);
		//印出大於平均的數
		for(int i = 0; i < array.length; i++){
			if(array[i] > average) System.out.println(array[i]);
		}
	}
}
