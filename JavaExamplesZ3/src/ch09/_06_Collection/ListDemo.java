package ch09._06_Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> m = new ArrayList<>();
		m.add(50);
		m.add(51);
		m.add(52);
		System.out.println("-----��1���L�X�Ҧ�����-----");
		for(Integer i:m){
			System.out.println(i);
		}

		m.add(0, 100);
		m.add(0, 200);
		m.add(0, 300);
		System.out.println("�����Ӽ�:" + m.size());
		System.out.println("-----��2���L�X�Ҧ�����-----");
		for(Integer i:m){
			System.out.println(i);
		}

	}

}
