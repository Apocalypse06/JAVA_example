package ch04;
/*
Q04_12. 寫一個程式來不斷隨機產生介於-1到10亂數，直到產生的亂數是-1為止，
             計算這些亂數(除了-1)的總和。(提示：利用while()敘述)
 */
public class Q04_12 {
	public static void main(String[] args) {
		int ran = 0, sum = 0;

		while (ran != -1) {
			ran = ((int) (Math.random() * 12) - 1);
			if (ran == -1) {
				break;
			} else {
				sum += ran;
				System.out.print(ran + " ");
			}

		}
		System.out.println();
		System.out.println("總和為" + sum);
		
	}
}
