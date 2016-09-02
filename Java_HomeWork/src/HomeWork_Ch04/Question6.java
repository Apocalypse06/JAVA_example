package HomeWork_Ch04;

/*
 * 印出題目訊息
 */

public class Question6 {
	public static void main(String[] args) {
		//每一列結尾為該開頭10倍
		//遞加大小為每一列開頭
		for(int i = 1; i <= 10; i++){
			for(int j = i; j <= (i*10); j+=i){
				System.out.print(j + (j > 9 ? "  ":"   " ));
			}
			System.out.println(" ");
		}
	}
}
