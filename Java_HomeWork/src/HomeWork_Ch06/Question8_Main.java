package HomeWork_Ch06;

class Justify{
	public String _inhertance(Question8_Animal any){
		StringBuilder s = new StringBuilder();
		if(any instanceof Question8_Animal){
			s.append("Animal");
		}
		if(any instanceof Question8_Mammal){
			s.append(" & Mammal");
		}
		if(any instanceof Question8_Cat){
			s.append(" & Cat");
		}
		if(any instanceof Question8_Dog){
			s.append(" & Dog");
		}
		if(s.length() != 0) return(s.toString());
		return ("None");
	}
}

public class Question8_Main {
	public static void main(String[] args) {
		Question8_Animal animal = new Question8_Animal();
		Question8_Mammal mammal = new Question8_Mammal();
		Question8_Cat cat = new Question8_Cat();
		Question8_Dog dog = new Question8_Dog();
		Justify J = new Justify();
		
		System.out.println("Animal : " + J._inhertance(animal));
		System.out.println("Mammal : " + J._inhertance(mammal));
		System.out.println("Cat : " + J._inhertance(cat));
		System.out.println("Dog : " + J._inhertance(dog));

	}

}
