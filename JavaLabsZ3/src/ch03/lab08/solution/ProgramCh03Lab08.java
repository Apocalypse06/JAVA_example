package ch03.lab08.solution;

import java.text.NumberFormat;

public class ProgramCh03Lab08 {
	/*
	  叫絪糶祘Αch03.lab08.ProgramCh03Lab08main()ぇ
	  ず叫盢地ん70锣传尼ん放
	  
	  矗ボ: 地ん放搭 32, 礛 5, 埃 9 尼ん放
	 */
	public static void main(String[] args) {
		double f = 70, c;
		c = (f - 32) * 5 / 9.0;
		System.out.println("地ん放" + f);
		System.out.println("尼ん放" + c);
		
	    NumberFormat nf = NumberFormat.getInstance();
	    nf.setMaximumFractionDigits(2);           //砞﹚计陪ボㄢ
	    System.out.println("地ん放" + f + " = 尼ん放 "+ nf.format(c) +"");
	}
}
