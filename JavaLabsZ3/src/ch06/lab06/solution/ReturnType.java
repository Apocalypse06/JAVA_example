package ch06.lab06.solution;

import ch06.lab06.Car;

/*
// �Хh��ReturnType.java�PReturnTypeMain.java�������ѡA
// �ק�Ҧ��� ???�C

// ������A�а���ReturnTypeMain.java�Ӵ��էA���{���X�C
*/
public class ReturnType {
	
	public byte[] m1() {
	    byte[] b = {1,2,3};
	    return b ; 
	}
	public float m2() {
	    return 3.14F ;
	}
	public String m3() {
	    return "�p�G�ݨ�o�@��A��ܧڧ�����׶Ǧ^�Ȫ����A�F";
	}
	public Integer m4() {
	    Integer i = new Integer(100);
	    return i;
	}
	public void m5() {
        // ����k�S���Ǧ^��     
	    return ;
	}
	public Car m6() {
	    Car sportCar = new Car();
	    return sportCar;
	}
}