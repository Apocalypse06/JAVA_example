package ch07.lab09;

// �����m�ߨB�J�@�G(���{���L�k����)
// ���]interface Weight�p�U:

interface Weight {
	int getWeight();
}

// �{��Plane, Rock, Dog�T�����O, ������@Weight����, �H�K�o��
// getWeight()�o�˪��欰�C�Ч����o�T�����O�C

// ��:getWeight()���Ǧ^�Ӫ��󪺭��q

class Plane {
	int weight = 100000;

}

class Rock {
	int rockWeight = 50000;
}

class Dog {
	int dogWeight = 100;
}