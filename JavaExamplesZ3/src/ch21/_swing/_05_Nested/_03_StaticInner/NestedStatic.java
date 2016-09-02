package ch21._swing._05_Nested._03_StaticInner;

public class NestedStatic {
	int t = 10 ;
	static int s = 100;
	
	static public class S1 {
		int s1t = 200;
		static int s1s = 300;
		public static int s1(){ 
			s++;	    // 存取外部類別的靜態變數
			// t++;     // NG
			outerS1();	// 呼叫外部類別的靜態方法
			// outerT1();  // NG
			System.out.println("Hello, s1()");
			return -1;
		}
		public int t1() {
			// t++;     // NG
			System.out.println("Hello, t1()");
			outerS1();
			// outerT1();  // NG
			return -2;
		}
	}
	
	public void outerT1(){
		System.out.println("Hello, OuterT1()");
	}
	public static void outerS1(){
		System.out.println("Hello, OuterS1()");
	}
}
