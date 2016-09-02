package ClassDemo.ThisVariableMain;

public class Cat {
    String name;
    public Cat(String name) {
    	this.name = name;
    }
	public void smile() {
		System.out.println("利用Debug觀察this變數(在Cat類別的smile() )");
		System.out.println("此物件的name屬性 :" + name);
		System.out.println("寫this.name也可以:" + this.name);
		System.out.println("------------------------------------------");
		//--------------------------------------------
		// 當透過snoopy來呼叫smile()時，
		// 此時在Dog類別之smile()方法內的this變數值，
		// 就是snoopy的值		
		Dog snoopy = new Dog("史奴比");
		snoopy.smile();
	}

}

