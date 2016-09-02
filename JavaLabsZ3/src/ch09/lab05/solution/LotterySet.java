package ch09.lab05.solution;

import java.util.HashSet;
import java.util.Set;

public class LotterySet {
	// �Q�ΡySet���ƪ���ƥu�O�d�@�����S�ʡz�Ӳ��ͼֳz���X
	public Set<Integer> getLuckyNumbers(int lowerBound, int upperBound, int ballNumber) {
		Set<Integer> set = new HashSet<>();
		while (set.size() < ballNumber) {
			int num = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
			set.add(num);
		}
		return set;
	}
}
