package ch06._05_encapsulation.v2;

public class EncapsulationDemoV2 {
	public static void main(String args[]) {
		Plane p2 = new Plane(10000);
		p2.addCargo(5000);
		p2.showCurrentLoad();
		p2.addCargo(4000);
		p2.showCurrentLoad();
		p2.addCargo(3000);
		p2.showCurrentLoad();
		p2.addCargo(2000);
		p2.showCurrentLoad();
		System.out.println("�ܼ�cargoLoad�����t��:" + 
		        p2.getCargoLoadInNewton()+ "���y");
		System.out.println("�ܼ�cargoLoad����ܭ�:" + 
		        p2.getCargoLoad()+ "����");
		
	}
}