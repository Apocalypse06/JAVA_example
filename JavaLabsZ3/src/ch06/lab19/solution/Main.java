package ch06.lab19.solution;

/*
1. ch06.lab19�M�󤺦��T�����O: Employee���O�BManager���O�PPresident���O�A
        �䤤Manager��Employee���l���O�A President��Manager���l���O�C
        
2. �Эק�Manager���O�PPresident���O�A���o������O���O�[�W�@�ӯ�������r��Ѽ�
        ���غc�l�A�o�ӰѼƱN����������name�ݩʪ��ݩʭȡC
        
3. ����Main���O�������ѡA���էA���{���C
*/
public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("John");
		System.out.println("emp���W�r=" + emp.getName());
		Manager man = new Manager();
		System.out.println("man���W�r=" + man.getName());
		President pre = new President();
		System.out.println("pre���W�r=" + pre.getName());
		
		Manager man1 = new Manager("Jack");
		System.out.println("man1���W�r=" + man1.getName());
		President pre1 = new President("Marie");
		System.out.println("pre1���W�r=" + pre1.getName());
	}
}