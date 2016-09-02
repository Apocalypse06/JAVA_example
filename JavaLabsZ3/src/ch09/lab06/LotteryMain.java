package ch09.lab06;

import java.util.Map;
import java.util.Set;

public class LotteryMain {
	public static void main(String[] args) {
		LotteryMap lm = new LotteryMap();
		Map<Integer, String> map = lm.getLuckyNumbers(1, 49, 6);
		System.out.println("你的樂透明牌為(Map版):" );
		// 利用5.0for敘述將map內的數字印出
	}
}
