package ch09._03_Wrapper;

import java.math.BigInteger;

public class BigIntegerDemo {


	public static void main(String[] args) {
        long fact1 = 1;
//        for(int i = 1 ; i <=100; i++){
//        	fact1 *= i;
//        	System.out.println(i+ "ªº¶¥­¼=" + fact1);
//        }
        BigInteger bi = new BigInteger("1");
        for(int i = 1 ; i <=1000; i++){
        	//bi = bi.multiply(new BigInteger(String.valueOf(i)));
        	bi = bi.multiply(new BigInteger(String.valueOf(i)));
        	System.out.println(i+ "ªº¶¥­¼=" + bi.toString());
        }
	}
}
