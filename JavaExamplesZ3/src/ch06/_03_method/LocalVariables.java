package ch06._03_method;

public class LocalVariables {
   public void m1() {
	   long sum = 0 ;  //�ܼ�sum�����Ľd�򬰥Ѧ���}�l�A����m1()��k�������� 
	   for (int i=1; i < 100; i++) {  
		   //�ܼ�count�����Ľd��for�ԭz���@��j��
		   int count = 0;     
		   if ( i % 2 == 0 ) {
			   // int i = 100;  // NG
			   sum += i;
			   count++;
			   System.out.println("count=" + count);  // OK
		   }
	   }
	   System.out.println("sum=" + sum);
	   // System.out.println("count=" + count);  // NG
	   int i = 1 ;    // OK
	   sum = 0 ; 
	   while ( i <= 100) {
		   sum += i ;
	   }
   }
}
