package ch06._05_encapsulation.v0;

//�ʸ˽m�� -- Approach 1 
//���OPlane���ݩʦp�U :
//	    cargoLoad(double)    : �ثe������(��쬰 Kg)
//	    allowMaxLoad(double) : Plane �Ҥ��\���̤j����(��쬰 Kg)
//
//���󪫫~�n�[��Plane�ɡA���ݥ��ˬd�ثe����(cargoLoad)�[�W
//���󪺭��q���Ӥp��allowMaxLoad,�_�h����[��Plane��.
//
//��Plane���ݩʨS������s������ӥ~�ɥi�H���NŪ�g��,
//load�N�]����s��X�z���ƭȥH�P�L�k�o�ͥ\��.
public class Plane {
	public double cargoLoad; //
	public double allowMaxLoad;

	public Plane(double allowMaxLoad) {
		this.allowMaxLoad = allowMaxLoad;
	}
	public void showCurrentLoad() {
		System.out.println("�ثe����:" + cargoLoad + "����, " 
	         + (cargoLoad > allowMaxLoad ? "�w�W���A�M�I" :  "���W���A�w��" ));
	}	
}