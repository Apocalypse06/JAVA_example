package ch09._05_Generics._04._02;

import ch09._05_Generics._01.Gen;

public class WildcardDemo {
	// よ猭钡把计Gen<Object>
	// ぃ钡把计Gen<String>,Gen<Integer>...
	// 虏ēぇヴ把计篈ぃ琌Gen<Object>常ぃ钡
	public void processObjData(Gen<Object> g) {
		Object o = g.getData();
		// 矪瞶ン o 
	    System.out.println(o);
	}
	// 把计獂摸ン 
	public void processAllData(Gen<?> g) {
		Object o = g.getData();
		// 矪瞶ン o 
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
