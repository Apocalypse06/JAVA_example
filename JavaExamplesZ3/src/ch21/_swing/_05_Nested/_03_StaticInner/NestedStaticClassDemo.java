package ch21._swing._05_Nested._03_StaticInner;

public class NestedStaticClassDemo {
	public static void main(String[] args) {
		System.out.println("�ѥ~�ɨϥ��R�A�_�����O���R�A�ܼơG" 
					+ NestedStatic.S1.s1s);
		System.out.println("�ѥ~�ɩI�s�R�A�_�����O���R�A��k�G" 
					+ NestedStatic.S1.s1());
		NestedStatic.S1  obj = new NestedStatic.S1();
		System.out.println("�ѥ~�ɨϥ��R�A�_�����O���D�R�A�ܼơG" 
					+ obj.s1t);
		System.out.println("�ѥ~�ɩI�s�R�A�_�����O���D�R�A��k�G" 
					+ obj.t1());
	}
}