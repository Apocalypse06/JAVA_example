package ch09._05_Generics._02;

public class TwoTypesParam<T, S> {
	private T ob1;
	private S ob2;
	public TwoTypesParam(T ob1, S ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public T getOb1() {
		return ob1;
	}
	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}
	public S getOb2() {
		return ob2;
	}
	public void setOb2(S ob2) {
		this.ob2 = ob2;
	}
	public void showTypes() {
		System.out.println("��ӫ��A�Ѽƪ��κA��:" + 
        ob1.getClass().getName() + "�P" +  ob2.getClass().getName()  );
	}
}