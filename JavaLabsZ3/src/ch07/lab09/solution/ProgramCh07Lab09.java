package ch07.lab09.solution;

// �����m�ߨB�J�@�G(���{���L�k����)
// ���]interface Weight�p�U:

interface Weight {
	int getWeight();
}

//�{��Plane, Rock, Dog�T�����O, ������@Weight����, �H�K�o��
//getWeight()�o�˪��欰�C�Ч����o�T�����O�C

//��:getWeight()���Ǧ^�Ӫ��󪺭��q

class Plane implements Weight {
	int weight = 100000;
	public int getWeight() {
		return weight;
	}
}

class Rock implements Weight {
	int rockWeight = 50000;
	public int getWeight() {
		return rockWeight;
	}
}

class Dog implements Weight {
	int dogWeight = 100;
	public int getWeight() {
		return dogWeight;
	}
}