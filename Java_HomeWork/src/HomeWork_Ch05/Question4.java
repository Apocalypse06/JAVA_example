package HomeWork_Ch05;

/*
 * 計算 String[] ca = { "snoppy", "micky", "lucky", "kitty", "derby"};
 * 有多少a e i o u
 */

public class Question4 {
	public static void main(String[] args) {
		String[] ca = { "snoppy", "micky", "lucky", "kitty", "derby"}; 
		int a, e, i, o, u;
		a = e =i =o = u = 0;
		for(int x = 0; x < ca.length; x++){
			for(int j = 0; j < ca[x].length(); j++){
				switch(ca[x].charAt(j)){
				 case 'a':
					a++;
					break;
				 case 'e':
					e++;
					break;
				 case 'i':
					i++;
					break;
				 case 'o':
					o++;
					break;
				 case 'u':
					u++;
					break;
				default:
					break;
				}
			}
		}
		System.out.println("a :" + a);
		System.out.println("e : " + e);
		System.out.println("i : " + i);
		System.out.println("o : " + o);
		System.out.println("u : " + u);
	}

}
