package ch09._04_autoboxing;

public class AutoBoxing1 {
   public static void main(String[] args) {
	   
	   Character c = 'A';
	   Integer   i = 100;
	   Double    d = 200.0;
	   double sum =  c + i + d ;
	   System.out.println("sum=" + sum);
	   
	   Boolean t = true;
	   if ( t ) {
		   System.out.println("1. �u");
	   } else {
		   System.out.println("1. ��");
	   }
	   
	   t = new Boolean("tRuE");  // �����O TRUE
	   if ( t ) {
		   System.out.println("2. �u");
	   } else {
		   System.out.println("2. ��");
	   }
	   t = new Boolean("truth");  // �����O TRUE
	   if ( t ) {
		   System.out.println("2. �u");
	   } else {
		   System.out.println("2. ��");
	   }
   }
}
