package ch07.lab08.solution;

//���{���n�[�`�@���ݩ�Rectangle�BTriangle�BCircle���O�����󪺭��n, 
//���̳��~�Ӧ�Shape���O�C���椧��, �o�{�������O�����n�ä����T(���s) 
//�ЧQ��abstract���O/��k���u�I�ӧ勵���{���C

// �B�J�@: �NShape���O��getArea()��k�קאּabstract��k�C
abstract class Shape {
   abstract double getArea() ;
}

// �B�J�G: �sĶ���{���N�i�o�{���D���Ҧb�C

class Rectangle extends Shape  {
   double a, b ; 
   Rectangle(double a, double b) {
     this.a = a ;
     this.b = b ;
   }	
   //double getarea() {  
   double getArea() {
     return a * b ;
   }
}

class Triangle extends Shape  {
   double a, h ;
   Triangle(double a, double h) {
      this.a = a ;
      this.h = h ;
   }	
//   double getARea() {  
   double getArea() {
     return 0.5 * a * h ;
   }   
}

class Circle  extends Shape {
   double radius ; 
   Circle(double r) {
      radius = r ;
   }	
//   double cirArea() {
   double getArea() {
      return Math.PI * radius * radius ;
  }	
}
// main program 
public class ProgramCh07Lab08 {
   public static void main(String args[]) {
      Rectangle r = new Rectangle(10, 20) ;
      Triangle t = new Triangle(5, 3) ;
      Circle  c = new Circle(10) ;
      System.out.println("�ꭱ�n    = " + r.getArea() ) ;
      System.out.println("�T���έ��n= " + t.getArea() ) ;
      System.out.println("����έ��n= " + c.getArea() ) ;
      double totalArea = r.getArea() + 
                         t.getArea() + 
                         c.getArea() ;
                        
      System.out.println("�`���n��:" + totalArea ) ;
      System.out.println("�`���n��:" + Math.round(totalArea * 100) / 100.0 ) ;  // �|�ˤ��J
   }
}