package ch04;

/*
Q04_11.���g�@�ӵ{���A���|�b�ù��W���5�C�A�C�C40�Ӧr���G�o�Ǧr���O�Ѥj�p�g�r���H�����͡A�p
 
 upFIxAPsLBhaLuyJOFfYTZkGWJHiVgIHBzfukPgq
 PIkMSECiTdRBDwcSZWEzvLAUZDNMDodYFEdctiKE
 IVyqXmhIvWAujLCXxAZhFvtvbYCQRrxzGEYErPAR
 XeEffgDKdrozrtChzXHUDMIHwUpiFAvEexGVcego
 snwlhjQgTNWkBxLYoFFShRKHSaWIKzmaynztXLRT

 */
public class Q04_11 {
	public static void main(String[] args) {
		int ch1 = 'A', ch2 = 'a';
        //  'A' �P 'a' �����t�F   ('a' - 'A')
        //  'B' �P 'b' �����t�F   ('b' - 'B')
        //  'C' �P 'c' �����t�F   ('c' - 'C')
		//   ...
        //  'Z' �P 'z' �����t�F   ('z' - 'Z')	
		//ASCII
		//System.out.println(ch1);
		//System.out.println(ch2);
		for (int x = 1; x <= 5; x++) {        // �L�X5��C
			for (int y = 1; y <= 40; y++) {   // �L�X�C�@��C��40�Ӧr��
				//�ܼ�e��0��1���üơA�Ψӱ���j�g(e=0)�Τp�g(e=1)
				//�Ƚd��G0 ~ 0.9999999(�L�a�p��)
				//0~0.49�B0.5~0.9
				int e = (int) (Math.random() * 2) + 0;
				
				int upOrLower = (ch2 - ch1) * e;
				int ch = ch1 + (int) (Math.random() * 26) + upOrLower;
				
				System.out.print((char) ch);

			}
			System.out.println();
		}

	}
}
