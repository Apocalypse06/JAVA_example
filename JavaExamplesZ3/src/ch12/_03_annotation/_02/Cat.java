package ch12._03_annotation._02;

public class Cat { 
	public String voice="(�L��)";
	//1. ���դU��������
	//@CatAnno(meow="�p�p�p", count=5)
	//2. �A�ոճo�@�� 
	@CatAnno(meow="�L�L�L", count=2)
	//3. �e��ӳ����[, �A�դ@��
    public void smile(){
	    System.out.println("Cat:" + voice);
    }
}
