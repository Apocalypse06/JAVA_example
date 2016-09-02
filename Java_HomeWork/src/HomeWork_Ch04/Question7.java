package HomeWork_Ch04;

/*
 * 將"Hello,World,大家好"
 * 逐字印出並取整數值
 */

public class Question7 {
	public static void main(String[] args) {
		String s = "Hello, World, 大家好";
		char c_Index_s;
		for(int i = 0; i < s.length(); i++){
			c_Index_s = s.charAt(i);
			System.out.println(c_Index_s + " " + ((int)c_Index_s));
		}
	}
}
