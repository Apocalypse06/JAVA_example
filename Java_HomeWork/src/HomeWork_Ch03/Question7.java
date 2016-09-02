package HomeWork_Ch03;

/*
 * 說明5+5、5+'5'、5+"5"的結果
 */

public class Question7 {
	public static void main(String[] args) {
		System.out.println(5 + 5);
		// 兩個整數5相加，故印出10
		System.out.println(5 + '5');
		// 5表示成字元又與整數5相加，所以以utf編碼十進制表示(53)
		// 5 + 53 = 58
		System.out.println(5 + 2 + "5" + "*");
		// 印出55，但第一個5為整數，第二個5為字串
	}
}
