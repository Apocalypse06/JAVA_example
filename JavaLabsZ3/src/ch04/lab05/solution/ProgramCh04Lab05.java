package ch04.lab05.solution;

// �ϥ�for �ԭz
// 1. �L�X 1 + 2 + 3 + 4 + .... + 18 + 19 + 20���`�M
// 2. �L�X 1 + 3 + 5 + .... + 17 + 19 ���`�M
// 3. �L�X 2 + 4 + 6 + .... + 18 + 20 ���`�M

public class ProgramCh04Lab05 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int n = 1; n <= 20; n++) {
			sum1 += n;
		}
		for (int n = 1; n <= 19; n += 2) {
			sum2 += n;
		}
		for (int n = 2; n <= 20; n += 2) {
			sum3 += n;
		}
		System.out.println("1. 1 + 2 + 3 + .... + 19 + 20 ���`�M=" + sum1);
		System.out.println("2. 1 + 3 + 5 + .... + 17 + 19 ���`�M=" + sum2);
		System.out.println("3. 2 + 4 + 6 + .... + 18 + 20 ���`�M=" + sum3);
	}
}
