package HomeWork_Ch09;

/*
 * 定義一個ArrayList<Double> ad
 * 並做排序後印出
 */

import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		//宣告並add
		ArrayList<Double> ad = new ArrayList<>();
		ad.add((double) 98);
		ad.add(12.345);
		ad.add(97.85);
		ad.add((double)12);
		//排序後印出
		ad.sort(null);
		for(int i = 0; i < ad.size(); i++)
			System.out.println(ad.get(i));
	}
}
