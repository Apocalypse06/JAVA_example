package ch07._05_interface_jdk8;

public class SubclassA implements InterfaceJDK8, In_JDK8_2 {
	public void defaultMethod(){
		System.out.println("�p�G�Ѩ�Ӥ����~�Ө�ӬۦPñ�W����k,");
		System.out.println("�l���O�N�@�w�nOverride����k");
	}
	@Override
	public void m1() {

	}
	public static void staticMethod(){
		System.out.println("�o�OSubclassA���R�A��k");
	}
}
