package ch09._05_Generics._04._02;

import ch09._05_Generics._01.Gen;

public class WildcardDemo {
	// ����k�u�����ѼƬ�Gen<Object>
	// �������ѼƬ�Gen<String>,Gen<Integer>...
	// ²�����A����Ѽƫ��A���OGen<Object>��������
	public void processObjData(Gen<Object> g) {
		Object o = g.getData();
		// �b���B�z���� o 
	    System.out.println(o);
	}
	// �ѼƬ��x�����O������ 
	public void processAllData(Gen<?> g) {
		Object o = g.getData();
		// �b���B�z���� o 
	    System.out.println(o);
	}

	public static void main(String[] args) {
		Gen<Integer> iobj = new Gen<Integer>(100);
		Gen<String>  sobj = new Gen<String>("Kitty");
		Gen<Object>  oobj = new Gen<Object>(new Object());
		WildcardDemo wd = new WildcardDemo();
//		wd.processObjData(iobj);    // NG
//		wd.processObjData(sobj);    // NG
		wd.processObjData(oobj);    // OK
		wd.processAllData(iobj);    // OK
		wd.processAllData(sobj);    // OK
		wd.processObjData(oobj);    // OK
	}

}
