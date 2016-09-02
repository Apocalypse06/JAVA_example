package ch04;

/*
Q04_11.撰寫一個程式，它會在螢幕上顯示5列，每列40個字元：這些字元是由大小寫字母隨機產生，如
 
 upFIxAPsLBhaLuyJOFfYTZkGWJHiVgIHBzfukPgq
 PIkMSECiTdRBDwcSZWEzvLAUZDNMDodYFEdctiKE
 IVyqXmhIvWAujLCXxAZhFvtvbYCQRrxzGEYErPAR
 XeEffgDKdrozrtChzXHUDMIHwUpiFAvEexGVcego
 snwlhjQgTNWkBxLYoFFShRKHSaWIKzmaynztXLRT

 */
public class Q04_11 {
	public static void main(String[] args) {
		int ch1 = 'A', ch2 = 'a';
        //  'A' 與 'a' 之間差了   ('a' - 'A')
        //  'B' 與 'b' 之間差了   ('b' - 'B')
        //  'C' 與 'c' 之間差了   ('c' - 'C')
		//   ...
        //  'Z' 與 'z' 之間差了   ('z' - 'Z')	
		//ASCII
		//System.out.println(ch1);
		//System.out.println(ch2);
		for (int x = 1; x <= 5; x++) {        // 印出5橫列
			for (int y = 1; y <= 40; y++) {   // 印出每一橫列的40個字元
				//變數e為0或1的亂數，用來控制大寫(e=0)或小寫(e=1)
				//值範圍：0 ~ 0.9999999(無窮小數)
				//0~0.49、0.5~0.9
				int e = (int) (Math.random() * 2) + 0;
				
				int upOrLower = (ch2 - ch1) * e;
				int ch = ch1 + (int) (Math.random() * 26) + upOrLower;
				
				System.out.print((char) ch);

			}
			System.out.println();
		}

	}
}
