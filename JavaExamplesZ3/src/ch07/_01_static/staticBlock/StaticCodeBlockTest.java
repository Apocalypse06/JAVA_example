package ch07._01_static.staticBlock;
//�����ù��W�|�X�{�ǰT���C
class  StaticDemo {
   static {
      System.out.println("SD-01") ;
   }   
}

public class StaticCodeBlockTest {
   static  {
      System.out.println("SCB-A") ;
   }
   public static void main(String[] args) {
      StaticDemo sd = new StaticDemo() ;
      System.out.println("SCB-C") ;
   }
   static {
      System.out.println("SCB-B") ;
   }
}
