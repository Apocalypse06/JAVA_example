package ch06._04_constructor.whyctor;

public class PersonMain {
	public static void main(String[] args) {
		PersonNG pNG1 = new PersonNG();
		pNG1.name = "�i�g��";
		pNG1.address = "�x����";
		pNG1.userId = "kitty123";
		pNG1.displayInfo();
		System.out.println("=================");
		Person p1 = new Person("�i�g��", "�x����", "kitty123");
		p1.displayInfo();
	}
}
