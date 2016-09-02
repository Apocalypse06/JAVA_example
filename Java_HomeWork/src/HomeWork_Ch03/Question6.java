package HomeWork_Ch03;

/*
 * 
 *計算直徑為10與內接圓面積的差值 
 */

public class Question6 {
	public static void main(String[] args) {
		int length = 10;
		int r = length / 2;
		double area_sqr = Math.pow(length, 2);
		double area_cir = Math.pow(r, 2) * Math.PI;
		System.out.println(area_sqr - area_cir);
	}
}
