package HomeWork_Ch09;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class Question1 {
	//�L�X
	public static void _print(Object[] o){
		for(int i = 0; i <o.length; i++){
			System.out.println(o[i]);
		}
	}
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> v = new ArrayList<>();
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
		//�L�X
		Object[] o = v.toArray();
		_print(o);
		//�����DNumber����
		for(int i = 0; i <o.length; i++)
			if(!(o[i] instanceof Number))
				v.remove(o[i]);
		System.out.println("----�����DNumber�����-----");
		o = v.toArray();	
		_print(o);
	}
}
