package ch12._03_annotation._06;
import java.lang.reflect.Method;

import ch12._03_annotation._05.*;
public class MySingleDemo {
	@MySingle(100)
	public static void myMeth(String s, int i, double[] da) {
		try {
			Class<MarkAnnotationDemo> c = MarkAnnotationDemo.class;
			Method m = c.getMethod("myMeth", String.class, 
					          int.class, double[].class);
			if (m.isAnnotationPresent(Marker.class)) {
				System.out.println("����Marker�s�b");
			} else {
				System.out.println("����Marker���s�b");
			}
		} catch (NoSuchMethodException e) {
			System.out.println("�䤣����w����k:" + "myMeth");
		}
	}
	public static void main(String[] args) {
		myMeth("111", 12, new double[] { 1.1, 20 });
	}
	@Override
	public String toString() {
		return super.toString();
	}	
}