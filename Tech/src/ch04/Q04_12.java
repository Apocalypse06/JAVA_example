package ch04;
/*
Q04_12. �g�@�ӵ{���Ӥ��_�H�����ͤ���-1��10�üơA���첣�ͪ��üƬO-1����A
             �p��o�Ƕü�(���F-1)���`�M�C(���ܡG�Q��while()�ԭz)
 */
public class Q04_12 {
	public static void main(String[] args) {
		int ran = 0, sum = 0;

		while (ran != -1) {
			ran = ((int) (Math.random() * 12) - 1);
			if (ran == -1) {
				break;
			} else {
				sum += ran;
				System.out.print(ran + " ");
			}

		}
		System.out.println();
		System.out.println("�`�M��" + sum);
		
	}
}
