package ch09._01_String;

import java.util.Hashtable;

public class StringDemo {
	public static void main(String[] args) {
		String s = "Ayz";
		String t = "abc";
		System.out.println("s.compareTo(t)==>" + s.compareTo(t));
		
		s = "������������������";
		t = "��";
		
		System.out.println("s.replace(t)==>" + s.replace('��','��'));
		System.out.println("s==>" + s);
		
		s = "���ѩ��ѫ����";
		String[] sa = s.split("��");
		System.out.println(sa.length);
		for(String x: sa){
			System.out.println("e=" + x + "*");
		}
		Hashtable<String, Object> ht = new Hashtable<>();
	}
}
