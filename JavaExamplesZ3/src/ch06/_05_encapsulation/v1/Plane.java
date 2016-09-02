package ch06._05_encapsulation.v1;

// �ʸ˽m�� -- Approach 2 
// �ק糧�{��, ���~�ɵL�k�����s��cargoLoad�PallowMaxLoad�A
// �p���@�ӥ~�ɴN�L�k���g���ު����p�U, �����ק�o���ܼƪ����t��
//
// �t�~, ���{������public boolean addCargo(double load)���~��
// �ϥ�, ��~�ɻݭn�N�f���[�JPlane��, �~�ɫK�I�s����k.
// �Ӥ�k�|�i���ˬd, �Y�ثe����(cargoLoad)�[�W���󪺭��q���Ӥp
// ��allowMaxLoad, �_�h����[��Plane��. 

public class Plane {
	private double cargoLoad; //
	private double allowMaxLoad;

	public Plane(double allowMaxLoad) {
		this.allowMaxLoad = allowMaxLoad;
	}
	public boolean addCargo(double load) {
		if (this.cargoLoad + load <= this.allowMaxLoad) {
			this.cargoLoad = this.cargoLoad + load;
			return true;
		} else {
			return false;
		}
	}
	public double getLoad() {
		return cargoLoad;
	}
	public void showCurrentLoad() {
		System.out.println("�ثe����:" + cargoLoad + "����, "
				+ (cargoLoad > allowMaxLoad ? "�w�W���A�M�I" : "���W���A�w��"));
	}
}
