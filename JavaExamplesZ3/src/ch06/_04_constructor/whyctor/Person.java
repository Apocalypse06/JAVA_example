package ch06._04_constructor.whyctor;
// �����O���@�ӨϥΪ̩w�q���غc�l
public class Person {
	String name;
	String address;
	String userId;
	public Person(String n, String a, String u) {
		name = n;
		address = a;
		userId = u;
	}
	public void displayInfo(){
		System.out.println("�m�W�G" + name);
		System.out.println("�a�}�G" + address);
		System.out.println("�N���G" + userId);
	}
	public void Person() {
        // �o���O�غc�l�A�o�O��k
    }
}