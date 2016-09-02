package ch06._04_constructor.callOtherCtor;

public class EmployeeOC {
	String name;
	int age;
	public EmployeeOC(String name, int age) {
		// 狦Τヴ祘Α琿琌篶ノ糶硂柑
		this.name = name;
		this.age = age;
	}
	public EmployeeOC(String name) {
		// this.name = name ;
		this(name, 0);	// ㊣Τㄢ把计篶
	}
	public EmployeeOC() {  // ㊣Τ把计篶
		// this.name = "代刚ノ" ;
		this("代刚ノ");
	}
	public void printData() {
		System.out.println("Name=" + name);
		System.out.println("Age=" + age);
	}	
}