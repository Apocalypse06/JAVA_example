package ch06._05_encapsulation.v2;

//�ʸ˽m�� -- Approach 3 
//�ѩ��ݩ�cargoLoad�PallowMaxLoad�]���Y�ح�], ���쥲����Kg�אּ
//Newton, �]���ݩʤ��t�ȷ|�H���ܰ�, ���F���v�T�~�ɪ��ϥΪ�
//���{���N���M�����HKg����쪺��J�ȻP���M���ͥHKg����쪺��X��.
//
//�]��, ���{������ private double kgToNewton(double w) �P
//private double newtonToKg(double w) ��Ӥ�k, �Ӷi����
//���ഫ 

public class Plane {
	private double cargoLoad; 
	private double allowMaxLoad;

	public Plane(double allowMaxLoad) {
		this.allowMaxLoad = kgToNewton(allowMaxLoad);
	}

	public boolean addCargo(double cargoLoad) {
		if (this.cargoLoad + kgToNewton(cargoLoad) <= this.allowMaxLoad) {
			this.cargoLoad = this.cargoLoad + kgToNewton(cargoLoad);
			return true;
		} else {
			return false;
		}
	}
	public double getCargoLoad() {
		return newtonToKg(cargoLoad);
	}

	public void showCurrentLoad() {
		System.out.println("�ثe����:" + newtonToKg(cargoLoad) + "����, "
				+ (cargoLoad > allowMaxLoad ? "�w�W���A�M�I" : "���W���A�w��"));
	}	

	double getCargoLoadInNewton() {
		return cargoLoad;
	}

	private double kgToNewton(double w) {
		return 9.8 * w;
	}

	private double newtonToKg(double w) {
		return w / 9.8;
	}
}