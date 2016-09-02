package HomeWork_Ch07;

import java.util.Calendar;


//取得目前月份數值，設定season數值
class StaticCodeBlock {
	static public String SEASON = "冬天";
	static {
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH) + 1;
		if (month < 6 && month > 2) SEASON = "春天";
		else if (month < 9 && month > 5) SEASON = "夏天";
		else if (month < 12 && month > 8) SEASON = "秋天";
	}
}

//呼叫靜態變數
public class Question2 {
	public static void main(String[] args) {
		System.out.println(StaticCodeBlock.SEASON);
	}
}
