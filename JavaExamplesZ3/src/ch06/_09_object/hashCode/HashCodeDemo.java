package ch06._09_object.hashCode;

public class HashCodeDemo {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		String s = "xyz";
		System.out.println("Cat���O������c1��hashCode��" + c1.hashCode());
		System.out.println("Cat���O������c2��hashCode��" + c2.hashCode());
		System.out.println("Dog���O������d1��hashCode��" + d1.hashCode());
		System.out.println("Dog���O������d2��hashCode��" + d2.hashCode());
		System.out.println("String���O������s��hashCode��" + s.hashCode());

	}
}
