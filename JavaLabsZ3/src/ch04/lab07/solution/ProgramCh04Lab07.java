package ch04.lab07.solution;

// �ϥ�while�ԭz
// 1. �L�X 1 + 2 + 3 + 4 + .... + 18 + 19 + 20���`�M
// 2. �L�X 1 + 3 + 5 + .... + 17 + 19 ���`�M
// 3. �L�X 2 + 4 + 6 + .... + 18 + 20 ���`�M

public class ProgramCh04Lab07 {
    public static void main(String[] args) {
    	int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int n = 1;
		while (n <= 20) {
			sum1 += n;
			n++;
		}
		n = 1;
		while (n <= 19) {
			sum2 += n;
			n += 2;
		}
		n = 2;
		while (n <= 20) {
			sum3 += n;
			n += 2;
		}
		System.out.println("1. 1 + 2 + 3 + .... + 19 + 20 ���`�M=" + sum1);
		System.out.println("2. 1 + 3 + 5 + .... + 17 + 19 ���`�M=" + sum2);
		System.out.println("3. 2 + 4 + 6 + .... + 18 + 20 ���`�M=" + sum3);
    }
}
