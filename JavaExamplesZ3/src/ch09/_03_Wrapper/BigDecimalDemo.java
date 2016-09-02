package ch09._03_Wrapper;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		double d1 = 3.14;// 3.140000000000000001
		double d2 = 2.67;
	    System.out.println(d1+d2);
	    
	    BigDecimal bd1 = new BigDecimal(d1);
	    BigDecimal bd2 = new BigDecimal(d2);
	    BigDecimal bd3 = bd1.add(bd2);
	    System.out.println(bd3.toString());  // NG
	    bd1 = new BigDecimal(String.valueOf(d1));  // 3.14
	    bd2 = new BigDecimal(String.valueOf(d2));
	    bd3 = bd1.add(bd2);
	    System.out.println(bd3.toString());  // OK
	}
}
