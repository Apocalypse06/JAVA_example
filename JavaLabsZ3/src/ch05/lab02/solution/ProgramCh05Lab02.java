package ch05.lab02.solution;

/*
 * �нs�g�{��ch05.lab02.ProgramCh05Lab02�A
 * �bmain()�����w�q:��ư}�C ar�A�䤺�t���U�C�����G
 * 100, 35, 46, 75, 56, 69�A�Эp��æL�X�o��
 * �������`�M�A�����A�̤j�������P�̤p�������C
 */
public class ProgramCh05Lab02 {
	public static void main(String[] args) {
		int[] ar = { 100, 35, 46, 75, 56, 69 };
		int sum = 0, max = ar[0], min = ar[0];
		double ave = 0;
		for (int n = 0; n < ar.length; n++) {
			if (ar[n] > max) {
				max = ar[n];
			}
			if (ar[n] < min) {
				min = ar[n];
			}
			sum += ar[n];
		}
		ave = (double)sum / ar.length;
		System.out.println("�`�M=" + sum);
		System.out.println("Max=" + max);
		System.out.println("Min=" + min);
		System.out.println("Ave=" + ave);
	}
}
