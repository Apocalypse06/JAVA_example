package ch07._05_interface_jdk8;

public interface InterfaceJDK8 extends IParent {
	int n = 100;
	public static void staticMethod(){
		System.out.println("�o�O����InterfaceJDK8���R�A��k");
	}
	default void defaultMethod(){
		System.out.println("�o�O����InterfaceJDK8��Default��k");
	}
    public void m1(); 
}
