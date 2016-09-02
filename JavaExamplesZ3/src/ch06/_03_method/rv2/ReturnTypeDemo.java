package ch06._03_method.rv2;

public class ReturnTypeDemo {
	public int m1() {
	    //¡K
	    return (int)(Math.random()*42) + 1 ; 
	}
	public double m2() {
	    //¡K
	    return Math.random() ;
	}
	public String m3() {
	    //¡K
	    return "Hello World";
	}
	public int[] m4() {
	    //¡K
	    int[] a = {1, 2, 3};
	    return a;
	}
	public void m5() {
	    //¡K
	    
	    return ;
	}
	public Cat m6() {
	    //¡K
	    Cat kitty = new Cat();
	    return kitty;
	}
}
