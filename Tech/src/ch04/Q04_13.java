package ch04;

import java.util.Scanner;

/*
Q04_13.����L��J10��Java�H����窺���Z�A���̬O����0-100����ơA�Хѵ{���έp��
 �զ��Z������ 90-100�B80-89�B70-79�B60-69 �H�� 0-59 �����ƦU���h�֭ӡA
 �������O��if�ԭz��switch�ԭz�Ӹѥ��D�C

 */
public class Q04_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y;
		int sum90_100 = 0, sum80_89 = 0, sum70_79 = 0, sum60_69 = 0, sum59_0 = 0;
		while (true){
			x++;
			if (x > 10)break;
			//switch 
			System.out.println("�п�J��" + x + "�Ӵ��禨�Z(1-100):");
			if (scan.hasNextInt()) {
				y = scan.nextInt();
				if (y >= 0 && y <= 100) {
					int s = y / 10;
					//System.out.println(s);
					switch (s) {
					case 10:
					case 9:
						sum90_100++;
						break;
					case 8:
						sum80_89++;
						break;
					case 7:
						sum70_79++;
						break;
					case 6:
						sum60_69++;
						break;
					default:
						sum59_0++;
						break;
					}
				} else {
					System.out.println("���~");
					x--;
				}
			} else {
				System.out.println("���~");
				x--;
				scan.next();
				continue;
			}
		}
	    scan.close();
		System.out.println("90~100���@��" + sum90_100 + "�H");
		System.out.println("80~ 89���@��" + sum80_89 + "�H");
		System.out.println("70~ 79���@��" + sum70_79 + "�H");
		System.out.println("60~ 69���@��" + sum60_69 + "�H");
		System.out.println(" 0~ 59���@��" + sum59_0 + "�H");

	}
}
