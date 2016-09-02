package ch09._10_time;
import java.util.*;
public class SystemTimeDemo {
	public static void main(String[] args) {
		
		long now = System.currentTimeMillis();
		System.out.println("----�H�U��ܲ{�b�ɶ�----");
		// �I�sdisplayTime(long)����
		displayTime(now); 
		System.out.println("----�H�U��ܯì��{�b�ɶ�----");
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		
//		System.out.println("----�H�U��ܮ�L�ªv�{�b�ɶ�----");
//		tz = TimeZone.getTimeZone("GMT");
		// �I�sdisplayTime(long,TimeZone)����
		displayTime(now, tz); 
		System.out.println("----�H�U��ܥ��Ӯɶ�----");
		long future = now + 2*365*24*60*60*1000L;
		Date d = new Date(future);
		// �I�sdisplayTime(Date)����
		displayTime(d); 
	}

	public static void displayTime(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.print(" �~=" + cal.get(Calendar.YEAR));
		System.out.print(" ��(0-based)=" + cal.get(Calendar.MONTH));
		System.out.print(" ��=" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.print(" ��=" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.print(" ��=" + cal.get(Calendar.MINUTE));
		System.out.print(" ��=" + cal.get(Calendar.SECOND));
		System.out.print(" ����=" + cal.get(Calendar.MILLISECOND));
		System.out.println();
	}
	public static void displayTime(long t) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(t);
		System.out.print(" �~=" + cal.get(Calendar.YEAR));
		System.out.print(" ��(0-based)=" + cal.get(Calendar.MONTH));
		System.out.print(" ��=" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.print(" ��=" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.print(" ��=" + cal.get(Calendar.MINUTE));
		System.out.print(" ��=" + cal.get(Calendar.SECOND));
		System.out.print(" ����=" + cal.get(Calendar.MILLISECOND));
		System.out.println();
	}
	public static void displayTime(long t, TimeZone tz) {
		Calendar cal = Calendar.getInstance(tz);
		cal.setTimeInMillis(t);
		System.out.print(" �~=" + cal.get(Calendar.YEAR));
		System.out.print(" ��(0-based)=" + cal.get(Calendar.MONTH));
		System.out.print(" ��=" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.print(" ��=" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.print(" ��=" + cal.get(Calendar.MINUTE));
		System.out.print(" ��=" + cal.get(Calendar.SECOND));
		System.out.print(" ����=" + cal.get(Calendar.MILLISECOND));
		System.out.println();
	}
}
