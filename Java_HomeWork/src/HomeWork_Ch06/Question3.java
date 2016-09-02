package HomeWork_Ch06;

import java.util.Arrays;

/*
 * 撰寫一個方法，可以排列陣列元素
 */

//排序
class Sorter{
	//呼叫排序函數後回傳
	public int[] _mySort(int[] arrayInt){
		Arrays.sort(arrayInt);
		return arrayInt;
	}
}
//main
public class Question3 {
	public static void main(String[] args) {
		int[] arrayInt = {7, 5, 12, 521, 321, 1024, 2048, 1, 99, 86400};
		Sorter s = new Sorter();
		s._mySort(arrayInt);
		//印出結果
		for(int i = 0; i < 10; i++)
			System.out.println(arrayInt[i]);
	}
}
