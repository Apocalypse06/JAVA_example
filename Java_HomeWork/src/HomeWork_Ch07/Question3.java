package HomeWork_Ch07;

//宣告smile為抽象方法

abstract class Human {
	int _weight = 50;
	abstract void _smile();
}

class OrdinaryPeople extends Human {
	@Override
	void _smile() {
		System.out.println("HA");
	}	
}

class HappyMary extends OrdinaryPeople {
	void _smile() {
		System.out.println("HA");
	}	
}

public class Question3 {
	public static void main(String[] args) {
		HappyMary hm = new HappyMary();
		hm._smile();
	}
}
