package misc;

public class StringPoolDemo {
	public static void main(String[] args) {
	   String s1 = "Abc";  // ¦r¦ê¦À String Pool
	   String s2 = "abc";  
	   String s3 = "abc";
	   
	   
	   System.out.println(s1==(s2));
	   System.out.println(s1.equals(s2));
	  
	}
}
