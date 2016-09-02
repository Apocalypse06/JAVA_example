package ch04;
/*
Q04_14.將字串 kITTY sNoopY MiCKY 轉換為 Kitty Snoopy Micky
 (第一個字母大寫，其它的字母皆為小寫) 
 */
public class Q04_14 {
	public static void main(String[] args) {
		//String str = " KITty    SNOOPY miCk   y";
		String str = " KITty    SNOOPY miCky";
		String result = "";
		// 準備拜訪整個字串
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 一次取出一個字元
			// 如果此字元是空白
			if (ch == ' ') {
				char t; 
				// 可能有許多空白字元
				while ((t = str.charAt(i)) == ' ' && i != str.length() - 1) {
					i++; // i++的目的是直接轉換下一個字元成為大寫字母
					result += " ";
				}

				result += Character.toUpperCase(str.charAt(i));

			} else { // 當該字元不是空白時走 else
				if (i == 0) { // 如果是第一個字元(即第一個字元不是空白)
					// 直接轉成大寫
					// System.out.print(Character.toUpperCase(str.charAt(i)));
					result += Character.toUpperCase(str.charAt(i));
				} else {
					// 直接轉成小寫
					// System.out.print(Character.toLowerCase(str.charAt(i)));
					result += Character.toLowerCase(str.charAt(i));
				}
			}
		}
		System.out.println("轉換前:" + str);
		System.out.println("轉換後:" + result);

	}
}
