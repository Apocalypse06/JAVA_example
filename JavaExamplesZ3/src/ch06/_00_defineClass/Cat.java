package ch06._00_defineClass;
// Cat ���O��weight(double)�PIQ(int)����ݩ� 
// �H�ΤU�C��Ӥ�k:
// 1. public void eat(int foodWeight) 
//     Cat�i����, Cat���魫�N�|�W�[��������10%
// 2. public void study(int hours) 
//     Cat�CŪ�Ѥ@�p��, IQ�|�W�[0.1 

public class Cat {
	public double weight;
	public int IQ;
	
	public void eat(int foodWeight) {
		weight = weight + foodWeight * 0.1;
	}
	public void study(int hours) {
		IQ = (int) (IQ + hours * 0.1);
	}
}