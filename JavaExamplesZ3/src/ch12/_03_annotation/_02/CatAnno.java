package ch12._03_annotation._02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//�U�@��@�w�n�[�A�_�h���Y����G   
@Retention(RetentionPolicy.RUNTIME)
public @interface CatAnno {
	String meow();
	int count();
}
