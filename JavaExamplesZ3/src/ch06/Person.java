package ch06;

public class Person {
	String name;
	String address;
	String userId;
	public Person(String name, String address, String userId) {
		this.name = name;
		this.address = address;
		this.userId = userId;
	}
	public void displayInfo(){
		System.out.println("�m�W�G" + name);
		System.out.println("�a�}�G" + address);
		System.out.println("�N���G" + userId);
	}
}