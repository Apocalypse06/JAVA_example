package ch06._03_method;
//  Foo���O���@�Ӥ�kout�A���S���Ǧ^�ȡA�]�S���ѼơA�I�s���ɡA���|�b�ù�
// �W��ܦr�� Hello, World!
public class MethodDesign00 {
   public static void main (String args[]){
       Foo foo = new Foo() ;
       foo.out();
       System.out.println("Program ending");
   }
}
class Foo {
	
    public void out() {
       System.out.println("Hello, World!");
    }
}