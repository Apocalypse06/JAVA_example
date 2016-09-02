package ch09.lab06.solution;

import java.util.Map;
import java.util.TreeMap;

public class LotteryMap {
	// �Q�ΡyMap�����\���ƪ�Key���S�ʡz�Ӳ��ͼֳz���X
	public Map<Integer, String> getLuckyNumbers(int lowerBound, int upperBound, int ballNumber) {
		Map<Integer, String> map = new TreeMap<>();
		while (map.size() < ballNumber) {
			int num = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
			map.put(num, "");
		}
		return map;
	}
}
