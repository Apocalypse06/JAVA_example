package ch06.lab07.solution;
/*
// Parameter.java���@�Ӥ�kgetCapitalGain()���T�ӰѼ�
// 1. int     principal     ����
// 2. double  rate  �Q�v
// 3. int     period  		����
// �Ǧ^�Ȭ�double���A�������P�Q�����`�M�A�г]�p����k���Ѽ�
// 
// Math.pow(x, y) �|�Ǧ^ x��y����
// ������A�а���ParameterMain.java�Ӵ��էA���{���X�C
*/
public class Parameter {
	//����k�p�⥻�Q�M
	public double getCapitalGain(int principal, double rate, int period) {
	    double gain = 0 ;

	    gain = principal * Math.pow(1 + rate, period);
	    return gain ; 
	}
}