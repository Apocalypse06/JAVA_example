package ch06.lab02.solution;

public class SendMessage {
	public static void main(String[] args) {
		// �b�o�̼��g�{���X
		Cat kitty = new Cat();
		kitty.weight = 10;
		kitty.iq = 50;
		kitty.study(3);
		kitty.displayInformation();

		Piggy piglet = new Piggy();
		piglet.weight = 70;
		piglet.eat(30);
		piglet.exercise(3);
		if (piglet.weight > piglet.sellableWeight) {
			System.out.println("�p�ޥi�X��");
		} else {
			System.out.println("�p���٤��i�X��");
		}
		Circle c = new Circle();
		System.out.println(c.getArea()); //
		c.radius = 5;
		System.out.println(c.getArea()); //
	}
}