 package HomeWork_Ch02;

 /*
  *第二章 3.
  *圓形面積
 */

public class Question3 {
	int _x = 0;
	public static void main(String[] args) {
		//數值
		float PI = 3.14f;
		float r = 10f;
		//面積
		float area = (float) (PI * Math.pow(r,2));
		//
		System.out.println(area);
	}
	public double _sumPower(int x, int y){	
		return Math.pow(_sum(x, y), 2);
	}
	
	public int _sum(int x, int y){
		return x + y;
	}
}
