package ch06._04_constructor.callOtherCtor;

public class EmployeeOC {
	String name;
	int age;
	public EmployeeOC(String name, int age) {
		// �p�G������{�����q�O�h�ӫغc�l�@�ΡA�i�H�g�b�o��
		this.name = name;
		this.age = age;
	}
	public EmployeeOC(String name) {
		// this.name = name ;
		this(name, 0);	// �I�s����ӰѼƪ��غc�l
	}
	public EmployeeOC() {  // �I�s���@�ӰѼƪ��غc�l
		// this.name = "���ե�" ;
		this("���ե�");
	}
	public void printData() {
		System.out.println("Name=" + name);
		System.out.println("Age=" + age);
	}	
}