package ClassDemo.ThisVariableMain;

public class Dog {
	String name;
	public Dog(String name) {
		this.name = name;
	}
	public void smile() {
		System.out.println("利用Debug觀察this變數(在Dog類別的smile() )");
		System.out.println("此物件的name屬性 :" + name);
		System.out.println("寫this.name也可以:" + this.name);
		System.out.println("------------------------------------------");
	}

}
