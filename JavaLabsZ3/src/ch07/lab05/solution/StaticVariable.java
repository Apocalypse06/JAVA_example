package ch07.lab05.solution;

import java.util.Calendar;

public class StaticVariable {
	public static String comment = "�T�w�����";
	static {
		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.AM_PM) == Calendar.AM) {
			comment = "�{�b�O�W��";
		} else {
			comment = "�{�b�O�U��";
		}	
	}
}
