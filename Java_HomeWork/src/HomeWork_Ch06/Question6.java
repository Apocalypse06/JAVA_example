package HomeWork_Ch06;

/*
 * 寫一個可以把字串轉為 Uni code的方法
 */
class Turner {
	//連續轉換
	public String _stringToUni(String s){
	    char[] temp = s.toCharArray();
	    StringBuilder uni = new StringBuilder();
	    //逐一轉換後存入
	    for(int i = 0; i < temp.length; i++){
	      uni.append(_charToUni(temp[i]));
	    }
	    return uni.toString();
	  }
	
	//單個字符轉 Uni code
	  public String _charToUni(char c){
	    int i = c;
	    String temp = Integer.toHexString(i);
	    StringBuilder uni = new StringBuilder(temp);
	    //不足補上 0 
	    while(uni.length() < 4){
	      uni.insert(0,0);
	    }
	    //最後補上\\u回傳
	    uni.insert(0,"\\u");
	    return uni.toString();
	  }
}

public class Question6 {
	public static void main(String[] args) {
		Turner t = new Turner();
		System.out.println(t._stringToUni("ABC"));
		System.out.println(t._stringToUni("張君雅"));	
	}
}
