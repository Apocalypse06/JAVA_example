package ch06._03_method.callByValue;
class SwapTwoIntegerRef {
	void swap(Data d) {
		int temp;
		temp = d.i;
		d.i = d.j;
		d.j = temp;
		//System.out.println("swap()已將屬性i與j的值交換, i=" + d.i + ", j=" + d.j);
	}
	
}
public class CallByValueReference {
	public static void main(String[] args) throws CloneNotSupportedException {
		int i = 10;
		int j = 20;
		
		Data data = new Data();
		data.i = i;
		data.j = j;
		
		SwapTwoIntegerRef cbv = new SwapTwoIntegerRef();
		System.out.println("呼叫swap()方法前, i=" + data.i + ", j =" + data.j + "\n");
		
		cbv.swap(data);
		System.out.println("呼叫swap()方法後, i=" + data.i + ", j =" + data.j+ "\n");
	
		Data dataTest = data;
		cbv.swap(dataTest);
		System.out.println("複製後呼叫swap()方法, i=" + data.i + ", j =" + data.j+ "\n");
		
		
		Data dataTest2 = (Data) data.clone();
		cbv.swap(dataTest2);
		System.out.println("Clone後呼叫swap()方法, i=" + data.i + ", j =" + data.j+ "\n");
		
	}
}