package ch04;
/*
Q04_21.
      寫一個程式，它能由鍵盤讀入一個身分證號碼，由程式判斷此它是否為一個
      合法的身分證號碼。  
*/

import java.util.Scanner;
public class Q04_21 {
	public static void main(String args[]) 	{
		String str="";
		int arrayArea[]=new int[]	{10,11,12,13,14,
									15,16,17,34,18,
									19,20,21,22,35,
									23,24,25,26,27,
									28,29,32,30,31,33};
		//地區碼，例如：A對應的數值10，area[0]=1,area[1]=0。
		int area[] = new int[2];  
		//流水號，儲存字串str後9碼的整數數值。
		int serial[] = new int[9];
		//暫存首碼英文大寫(若為小寫強制轉為大寫)。
		int choose = 0;
		//計算輸入的身分證字號代表的權重分數。
		int checksum = 0; 
		
		int i,j;//迴圈控制。
		boolean redo = false;//以旗標判斷是否符合身分證格式，若否，重新輸入。
		Scanner scan = new Scanner(System.in);
		do{
			redo = false;
			System.out.println("請輸入身分證字號(英文+9位數字)");
			if(scan.hasNextLine()) {
				str = scan.nextLine();
			}
			//判斷字串長度是否為10位。
			if(str.length()!=10) {
				System.out.println("身分證長度必須為10位!請重新輸入!");
				redo=true;
			}
			//判斷首位字元是否為字元。
			if((Character.isLetter(str.charAt(0))!=true)) {
				System.out.println("身分證首位必須為英文字母!請重新輸入!");
				redo=true;
			}
			//判斷str的第二個字元是否為'1'或'2'。
			if(str.charAt(1)!='1' && str.charAt(1)!='2') {
				System.out.println(str.charAt(1));
				System.out.println("身分證第二位必須為1或2!請重新輸入!");
				redo=true;
			}
			//判斷第1~9位數字，是否為數字。
			for(i=1;i<str.length();i++)	{
				if((Character.isDigit(str.charAt(i))!=true)) {
					System.out.println("身分證第1~9位必須為0~9的數字!請重新輸入!");
					redo=true;
					break;
				}
			}
		}  while(redo==true);
		scan.close();
		
		//存放輸入的首碼英文字元對應地區的索引值。
		choose = (int)(str.toUpperCase().charAt(0)-65);
		System.out.println();
		System.out.println("您輸入的身分證字號為：\n" + str);
		//serial[]儲存流水號對應的整數值。
		for(i=0;i<9;i++) {
			serial[i]=Integer.parseInt(str.substring(i+1,i+2));
		}
		System.out.println();
		System.out.println("檢查的計算過程如下：");
		//存放字母對應的數值，例:A=>10,1存入area[0],0存入area[1]。
		area[0]=arrayArea[choose]/10;
		area[1]=arrayArea[choose]%10;
		//英文字母各別乘以1和9。
		checksum=area[0]*1+area[1]*9;
		System.out.println(area[0]+" * "+"1 = "+area[0]*1);
		System.out.println(area[1]+" * "+"9 = "+area[1]*9);
		//將流水號乘以對應的權重值。
		for(j=0;j<8;j++) {	
			checksum+=serial[j]*(8-j);
			System.out.println(serial[j]+" * "+(8-j)+" = "+serial[j]*(8-j));
		}
		System.out.println();
		System.out.println("檢查碼為"+checksum);
		System.out.println("檢查碼除以10的餘數為："+(checksum % 10));
		//若餘數為0,checksum=0,否則checksum=10-餘數
		if(checksum % 10==0) {
			checksum=0;
		} else	{
			checksum=10-(checksum % 10);
		}
		System.out.println("10減掉餘數為："+checksum);
		System.out.println("身分證數字第九碼為："+serial[8]);
		System.out.println();
		//若checksum與輸入的第十碼相符,為正確的身分證字號。
		if(checksum==serial[8]) {
			System.out.println("您輸入的身分證字號正確！");
		} else {
			System.out.println("您輸入的身分證字號錯誤！");
		}
	}
}
