package ch08.lab06;

//����ErrorProne.java�ɡA�ù��|�L�X���Ǧr��?
public class ErrorProne {
  public static void main(String[] args) {
    try {
      Tiger.eat();
      System.out.print("E");  
    } catch (ArithmeticException e) {
      System.out.print("F");
    } finally {
      System.out.print("G");
    }
    System.out.print("Z");
  }
}
class Tiger {
  public static void eat() {
    try {
      int x = 10 / 0;   // �o�@��|����java.lag.ArithmeticException
      System.out.print("A");
    } finally {
      System.out.print("C");
    }
    System.out.print("D");
  }
}
