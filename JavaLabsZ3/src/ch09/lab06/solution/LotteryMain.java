package ch09.lab06.solution;

import java.util.Map;
import java.util.Set;

public class LotteryMain {
	public static void main(String[] args) {
		LotteryMap lm = new LotteryMap();
		Map<Integer, String> map = lm.getLuckyNumbers(1, 49, 6);
		System.out.println("�A���ֳz���P��(Map��):" );
		// �Q��5.0for�ԭz�Nmap�����Ʀr�L�X
		Set<Integer> set = map.keySet();
		for(Integer i :set){
			System.out.print(i + " ");
		}
	}
}
