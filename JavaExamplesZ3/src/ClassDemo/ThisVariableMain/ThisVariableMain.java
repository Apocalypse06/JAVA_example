package ClassDemo.ThisVariableMain;

public class ThisVariableMain {
	public static void main(String[] args) {
		Cat kitty = new Cat("凱蒂貓");
		// 當透過kitty來呼叫smile()時，
		// 此時在Cat類別之smile()方法內的this變數值，
		// 就是kitty的值
		kitty.smile();  
		
//		// -----------------------------
//		Cat garfield = new Cat("嘉菲貓");
//		// 當透過garfield來呼叫smile()時，
//		// 此時在Cat類別之smile()方法內的this變數值，
//		// 就是garfield的值
//		garfield.smile();
		
	}
}