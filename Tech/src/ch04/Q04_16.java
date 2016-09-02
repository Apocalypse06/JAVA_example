package ch04;
/* 
Q04_16:  
    本題限用while()敘述與continue敘述來完成。
    印出1-100的數字、此數的平方、此數的立方，但是遇到五的倍數則
    不印出。  
 */
public class Q04_16 {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {		// 由1做到100為止
			if (x % 5 == 0) { 	// 如果x除以5，餘數為0
				x++;          	// 如果沒有這一行，會產生無窮迴圈
				continue;		// 跳過本次迴圈     
			} else {
				/*int pow2 = (int) Math.pow(x, 2);
				int pow3 = (int) Math.pow(x, 3);
				System.out.println("數字" + x + "的平方=" + pow2 + ", 立方="+ pow3);*/
				// 否則印出
				//System.out.println("數字" + x + "的平方=" + x * x + ", 立方="+ x * x * x);
				x++;
			}

		}

	}
}
