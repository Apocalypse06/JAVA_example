package ch06._02_javaVariable;

public class VariablesDemo {
    public static void main(String args[]) {
      // p �P args ���ϰ��ܼ�
      Piglet p = new Piglet() ;
      p.eat(100) ;
      System.out.println("The weight of Piglet p is " + p.weight ); 
   }
}
class Piglet {
   // growthRatio �����O�ܼ�(�S���R�A�ܼ�)
   static public double grouthRatio = 0.35 ; 
   // weight ������ܼ�
   double weight ;
   public void eat(int foodWeight) {
   // ratio �P foodWeight ���ϰ��ܼ�
      double ratio = 0.75 ; 
      weight = weight + foodWeight * ratio ;
   }	
}