package ch12._03_annotation._05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//�������S���w�q�����k
public @interface Marker {
	String str() default "OK";
	int val() default 120 ;
}
