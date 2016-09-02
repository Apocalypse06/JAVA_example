package ch06._06_inheritance;

class Human extends Object { // Human�OObject���l���O
	private int age = 18;  // ��private�ݩ�:age

	void smile() {         // ��packageFriendly��smile()��k
		System.out.println("Hello World, :)");
	}

	public void setAge(int age) { // public��k:setAge()
		this.age = age;
	}

	public int getAge() { // public��k:getAge()
		return age;
	}
}

class OrdinaryPeople extends Human { // OrdinaryPeople�OHuman���l���O
}

// HappyMary�OOrdinaryPeople���l���O
class HappyMary extends OrdinaryPeople {
	void birthday() {
		setAge(getAge() + 1);
	}
}

class InheritanceDemo {
	public static void main(String args[]) {
		HappyMary hm = new HappyMary();
		hm.smile();
		// hm.age++; // NG�A�l�N���O���ઽ���s�����N���O��private����
		System.out.println(hm.getAge());
		hm.birthday();
		System.out.println(hm.getAge());
	}
}