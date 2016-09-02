package ch21._swing._05_Nested._03_StaticInner;

public class NestedStaticClassDemo {
	public static void main(String[] args) {
		System.out.println("由外界使用靜態巢狀類別的靜態變數：" 
					+ NestedStatic.S1.s1s);
		System.out.println("由外界呼叫靜態巢狀類別的靜態方法：" 
					+ NestedStatic.S1.s1());
		NestedStatic.S1  obj = new NestedStatic.S1();
		System.out.println("由外界使用靜態巢狀類別的非靜態變數：" 
					+ obj.s1t);
		System.out.println("由外界呼叫靜態巢狀類別的非靜態方法：" 
					+ obj.t1());
	}
}