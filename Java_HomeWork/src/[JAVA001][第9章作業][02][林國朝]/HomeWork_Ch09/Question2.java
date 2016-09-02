package HomeWork_Ch09;

import java.util.Collection;
import java.util.HashSet;

/*
 *利用SET特性，避免加入重複姓名 
 */

public class Question2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> cs = new HashSet<>();
		String[] names = {"張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪",
				"黃美華", "劉雪麗", "黃彬彬", "潘美雪", "潘美雪"};
		//加入後印出
		for(String s : names) cs.add(s);
		for(String s : cs)System.out.println(s);
		
	}

}
