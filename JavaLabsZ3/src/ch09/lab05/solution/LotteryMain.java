package ch09.lab05.solution;

import java.util.Set;

public class LotteryMain {
	public static void main(String[] args) {
		LotterySet lb = new LotterySet();
		Set<Integer> set = lb.getLuckyNumbers(1, 49, 6);
		System.out.println("�A���ֳz���P��(Set��):" );
		// �Q��5.0for�ԭz�Nset�����Ʀr�L�X
		for(Integer i :set){
			System.out.print(i + " ");
		}
	}
}
