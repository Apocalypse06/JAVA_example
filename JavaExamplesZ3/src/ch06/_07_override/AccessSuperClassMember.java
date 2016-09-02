package ch06._07_override;

class A {
	public int age = 10;

	void smile() {
		System.out.println(":)");
	}
}

class B extends A {	// B�OA���l���O
	void smile() {		// Override�����O��smile()��k
		System.out.println("Ha");
	}
}

class C extends B {	// C�OB���l���O
	
	// �U�����ܼ�String age���OOverride���N���ܼơA
	// �u�����P���N���O���P�W�ܼƳo���O���`�����O�]�p�C
	// ���`���]�p���N���ܼƧ�W�C�u�����N�l�N����k����
	// �~��Override������
	String age = "��20��"; 

	void smile() {
		//�b�l���O���A�p�G�ݭn������N���O����k�Asuper.method()
		//�ݭn�o�˰�����]�p�U�G ��l�N���OOverride���N���O
        //����k�ɡA�p�G���N��k�������w�n���檺�ԭz�A�_�h�{���L�k���`�B�@�A
        //���ɧڭ̥i�b���N��k���ϥ�super.method()�өI�s���N��k�C
		super.smile();  
		System.out.println("HaHaHa.....");
	}

	void displayAge() {
		System.out.println("������������O�w�q��age =" + age);
		System.out.println("�����O�w�q��age =" + super.age);
	}
}

public class AccessSuperClassMember {
	public static void main(String[] args) {
		C c = new C();
		c.smile();      // �o�@��|�I�sC��smile()��k
		c.displayAge();
	}
}