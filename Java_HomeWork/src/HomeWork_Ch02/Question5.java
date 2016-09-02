package HomeWork_Ch02;

/*
 *第二章 5.
 *牛肉+雞蛋+青菜總共多少元
*/

public class Question5 {	
	public static void main(String[] args) {
		//單位
		int BEEF = 120;
		int EGG = 36;
		int VEGATABLE = 20;
		//數量
		float beef_Jin = 1.5f;
		float egg_Jin = 2f;
		float vegatable_Number = 3f;
		//
		float total = (BEEF * beef_Jin) + (EGG * egg_Jin) + (VEGATABLE * vegatable_Number);
		System.out.println(total);
	}
}
