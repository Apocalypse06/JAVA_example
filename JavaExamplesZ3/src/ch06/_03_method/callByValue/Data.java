package ch06._03_method.callByValue;

public class Data implements Cloneable{
	int i;
	int j;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}