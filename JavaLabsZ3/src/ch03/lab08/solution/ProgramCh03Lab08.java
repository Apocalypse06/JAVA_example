package ch03.lab08.solution;

import java.text.NumberFormat;

public class ProgramCh03Lab08 {
	/*
	  �нs�g�{��ch03.lab08.ProgramCh03Lab08�A�bmain()��
	  ���бN�ؤ�70���ഫ���ūסC
	  
	  ����: �ؤ�ū״�h 32, �M�᭼�H 5, �A���H 9 �Y�����ūסC
	 */
	public static void main(String[] args) {
		double f = 70, c;
		c = (f - 32) * 5 / 9.0;
		System.out.println("�ؤ�ū׬�" + f);
		System.out.println("���ū׬�" + c);
		
	    NumberFormat nf = NumberFormat.getInstance();
	    nf.setMaximumFractionDigits(2);           //�]�w�p�ƥu��ܨ��
	    System.out.println("�ؤ�ū�" + f + "�� = ���ū� "+ nf.format(c) +"��");
	}
}
