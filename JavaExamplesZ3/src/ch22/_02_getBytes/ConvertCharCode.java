package ch22._02_getBytes;

import java.io.UnsupportedEncodingException;

public class ConvertCharCode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String user = "";
		byte[] b1 = user.getBytes("UTF-16BE");
		byte[] b2 = user.getBytes("UTF-8");
		byte[] b3 = user.getBytes("CNS11643");
//      // 盢﹃ず–じ絪絏パUnicode锣传﹚絪絏
		byte[] b = user.getBytes("BIG5");
		// 单  for(int n=0; n < b.length; n++) {
		for(byte ch:b){                              
			// 盢俱计ch锣传16秈ボ猭﹃跑计tmpず
			String tmp = Integer.toHexString(ch);    
			// 狦tmp1,
			if (tmp.length() == 1){                  
				// 玡干0 (策篋じ舱戈常Τㄢ才腹)
				tmp = "0" + tmp;                     
				// 狦tmp2, ffffffa7
			} else if (tmp.length() > 2) {           
				// 程ㄢ计
				tmp = tmp.substring(tmp.length()-2);  
			}
			System.out.println(tmp.toUpperCase());
		}

	}

}
