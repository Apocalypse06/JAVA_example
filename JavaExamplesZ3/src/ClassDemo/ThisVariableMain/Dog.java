package ClassDemo.ThisVariableMain;

public class Dog {
	String name;
	public Dog(String name) {
		this.name = name;
	}
	public void smile() {
		System.out.println("�Q��Debug�[��this�ܼ�(�bDog���O��smile() )");
		System.out.println("������name�ݩ� :" + name);
		System.out.println("�gthis.name�]�i�H:" + this.name);
		System.out.println("------------------------------------------");
	}

}
