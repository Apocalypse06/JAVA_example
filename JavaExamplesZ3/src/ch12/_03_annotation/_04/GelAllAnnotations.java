package ch12._03_annotation._04;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
//���d�Ҫ�myMeth���Ѽ�
public class GelAllAnnotations {
	@What(desc = "�o�O�ƻ�F�F...")
	@MyAnno(str = "�o�ӽd�Ҫ�myMeth()��k����ӵ����A" +
						"�Q��reflectionŪ������������", val = 200)
	public static void myMeth(String s, int i, double[] da) {
		try {
			Class<GelAllAnnotations> c = GelAllAnnotations.class;
			Method m = c.getMethod("myMeth", String.class, int.class, 
										double[].class);
			Annotation[] ma = m.getAnnotations();
			for (Annotation a: ma){
				if (a.annotationType() == What.class){
					What w = (What)a;
					System.out.println("Ū��What������desc:" + w.desc());
				} else if (a.annotationType() == MyAnno.class){
					MyAnno w = (MyAnno)a;
					System.out.println("Ū��MyAnno������str:" + w.str());
				}  
			}
		} catch (NoSuchMethodException e) {
			System.out.println("�䤣����w����k:" + "myMeth");
		}
	}
	public static void main(String[] args) {
		myMeth("111", 12, new double[]{1.1, 20} );
	}
}