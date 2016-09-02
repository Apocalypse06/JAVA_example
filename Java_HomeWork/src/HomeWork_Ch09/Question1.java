package HomeWork_Ch09;

import java.awt.List;
import java.math.BigInteger;
import java.util.*;

public class Question1 {
	//印出
	public static void _print(Object[] o){
		for(int i = 0; i <o.length; i++){
			System.out.println(o[i]);
		}
	}
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> v = new ArrayList<>();
		Iterator<Object> vI = v.iterator();
		
		ArrayList<String> numbers = new ArrayList<String>();
		Iterator<String> numbersI = numbers.iterator();
		
		Queue q = new LinkedList(); 
		Iterator iq = q.iterator();
		
		Stack s = new Stack();
		Iterator is = s.iterator();
		
		//int[] i = new int[];
		int[] i2 = new int[5];
 		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add((short)100);
		v.add(new Double(5.1));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add(new Object());
		v.add("sonppy");
		v.add(new BigInteger("1000"));
		//印出
		Object[] o = v.toArray();
		_print(o);
		//移除非Number物件
		for(int i = 0; i <o.length; i++)
			if(!(o[i] instanceof Number))
				v.remove(o[i]);
		System.out.println("----移除非Number物件後-----");
		o = v.toArray();	
		_print(o);
		
		while(vI.)
	}
}
