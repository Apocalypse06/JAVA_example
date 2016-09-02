package HomeWork_Ch05;

/*
 * 計算陣列直行與橫列總和
 */

public class Question5 {
	public static void main(String[] args) {
		int[][] test = {
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 }};
		int[] row_sum = new int[6];
		int[] col_sum = new int[8];
		//總和
		for(int i = 0; i < test.length; i++){
			for(int j = 0; j < test[i].length; j++){
				row_sum[i] += test[i][j];
				col_sum[j] += test[i][j];
			}
		}
		//print
		for(int i = 0; i < row_sum.length; i++)
			System.out.println(row_sum[i]);
		for(int i = 0; i < col_sum.length; i++)
			System.out.println(col_sum[i]);
	}
}
