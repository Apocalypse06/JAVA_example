package ClassDemo.ThisVariableMain;

public class Cat {
    String name;
    public Cat(String name) {
    	this.name = name;
    }
	public void smile() {
		System.out.println("�Q��Debug�[��this�ܼ�(�bCat���O��smile() )");
		System.out.println("������name�ݩ� :" + name);
		System.out.println("�gthis.name�]�i�H:" + this.name);
		System.out.println("------------------------------------------");
		//--------------------------------------------
		// ��z�Lsnoopy�өI�ssmile()�ɡA
		// ���ɦbDog���O��smile()��k����this�ܼƭȡA
		// �N�Osnoopy����		
		Dog snoopy = new Dog("�v����");
		snoopy.smile();
	}

}

