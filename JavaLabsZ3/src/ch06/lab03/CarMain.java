package ch06.lab03;

public class CarMain {
	public static void main(String[] args) {
		ToyCar controller1 = new ToyCar();
		controller1.hour = 2;
		controller1.speed = 10;
		controller1.getDistance();  // ����L�X�y�����㨮���F20.0�����z
		
		ToyCar controller2 = controller1;
		controller2.hour = 1;
		controller2.speed = 5;
		
		controller1.getDistance();  // ����L�X��ذT��?
	}
}
// ���D1:���D���ʹX�Ӫ���?
// ���D2:�̫�@��ԭz�|�L�X��ذT��?