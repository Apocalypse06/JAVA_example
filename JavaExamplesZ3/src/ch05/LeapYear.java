package ch05;

import java.util.GregorianCalendar;
//����اP�_�|�~���覡
// 1.�Q�� GregorianCalendar���O��isLeapYear(int year)
// 2.�Q�α���
//   boolean leapYear = yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0;
public class LeapYear {
	public static void main(String[] args) {
		int count = 0;
		
		GregorianCalendar  gc = new GregorianCalendar();
		for (int yy = 1601; yy <= 2000; yy++) {
			if (gc.isLeapYear(yy))
				count++;
			
		}
		System.out.println("��k�@�G�C400�~�A�|��" +count+"�|�~");
		
		count = 0 ;
		for (int yy = 1601; yy <= 2000; yy++) {
			boolean leapYear = yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0;
			if (leapYear){
			
				count++;
			}
			
		}
		System.out.println("��k�G�G�C400�~�A�|��" +count+"�|�~");
	}
}


			

