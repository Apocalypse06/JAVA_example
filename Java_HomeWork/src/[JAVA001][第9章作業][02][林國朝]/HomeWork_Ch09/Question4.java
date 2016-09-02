package HomeWork_Ch09;

/*
 * 使用Array的方法對字串陣列做排序
 */

import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		//宣告後排序
		String[] names = {"張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪",
				"黃美華", "劉雪麗", "黃彬彬", "潘美雪", "潘美雪"};
		Arrays.sort(names);
		//印出
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);
	}

}
