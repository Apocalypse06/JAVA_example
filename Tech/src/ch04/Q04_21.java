package ch04;
/*
Q04_21.
      �g�@�ӵ{���A�������LŪ�J�@�Ө����Ҹ��X�A�ѵ{���P�_�����O�_���@��
      �X�k�������Ҹ��X�C  
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
		//�a�ϽX�A�Ҧp�GA�������ƭ�10�Aarea[0]=1,area[1]=0�C
		int area[] = new int[2];  
		//�y�����A�x�s�r��str��9�X����ƼƭȡC
		int serial[] = new int[9];
		//�Ȧs���X�^��j�g(�Y���p�g�j���ର�j�g)�C
		int choose = 0;
		//�p���J�������Ҧr���N���v�����ơC
		int checksum = 0; 
		
		int i,j;//�j�鱱��C
		boolean redo = false;//�H�X�ЧP�_�O�_�ŦX�����Ү榡�A�Y�_�A���s��J�C
		Scanner scan = new Scanner(System.in);
		do{
			redo = false;
			System.out.println("�п�J�����Ҧr��(�^��+9��Ʀr)");
			if(scan.hasNextLine()) {
				str = scan.nextLine();
			}
			//�P�_�r����׬O�_��10��C
			if(str.length()!=10) {
				System.out.println("�����Ҫ��ץ�����10��!�Э��s��J!");
				redo=true;
			}
			//�P�_����r���O�_���r���C
			if((Character.isLetter(str.charAt(0))!=true)) {
				System.out.println("�����ҭ��쥲�����^��r��!�Э��s��J!");
				redo=true;
			}
			//�P�_str���ĤG�Ӧr���O�_��'1'��'2'�C
			if(str.charAt(1)!='1' && str.charAt(1)!='2') {
				System.out.println(str.charAt(1));
				System.out.println("�����ҲĤG�쥲����1��2!�Э��s��J!");
				redo=true;
			}
			//�P�_��1~9��Ʀr�A�O�_���Ʀr�C
			for(i=1;i<str.length();i++)	{
				if((Character.isDigit(str.charAt(i))!=true)) {
					System.out.println("�����Ҳ�1~9�쥲����0~9���Ʀr!�Э��s��J!");
					redo=true;
					break;
				}
			}
		}  while(redo==true);
		scan.close();
		
		//�s���J�����X�^��r�������a�Ϫ����ޭȡC
		choose = (int)(str.toUpperCase().charAt(0)-65);
		System.out.println();
		System.out.println("�z��J�������Ҧr�����G\n" + str);
		//serial[]�x�s�y������������ƭȡC
		for(i=0;i<9;i++) {
			serial[i]=Integer.parseInt(str.substring(i+1,i+2));
		}
		System.out.println();
		System.out.println("�ˬd���p��L�{�p�U�G");
		//�s��r���������ƭȡA��:A=>10,1�s�Jarea[0],0�s�Jarea[1]�C
		area[0]=arrayArea[choose]/10;
		area[1]=arrayArea[choose]%10;
		//�^��r���U�O���H1�M9�C
		checksum=area[0]*1+area[1]*9;
		System.out.println(area[0]+" * "+"1 = "+area[0]*1);
		System.out.println(area[1]+" * "+"9 = "+area[1]*9);
		//�N�y�������H�������v���ȡC
		for(j=0;j<8;j++) {	
			checksum+=serial[j]*(8-j);
			System.out.println(serial[j]+" * "+(8-j)+" = "+serial[j]*(8-j));
		}
		System.out.println();
		System.out.println("�ˬd�X��"+checksum);
		System.out.println("�ˬd�X���H10���l�Ƭ��G"+(checksum % 10));
		//�Y�l�Ƭ�0,checksum=0,�_�hchecksum=10-�l��
		if(checksum % 10==0) {
			checksum=0;
		} else	{
			checksum=10-(checksum % 10);
		}
		System.out.println("10��l�Ƭ��G"+checksum);
		System.out.println("�����ҼƦr�ĤE�X���G"+serial[8]);
		System.out.println();
		//�Ychecksum�P��J���ĤQ�X�۲�,�����T�������Ҧr���C
		if(checksum==serial[8]) {
			System.out.println("�z��J�������Ҧr�����T�I");
		} else {
			System.out.println("�z��J�������Ҧr�����~�I");
		}
	}
}
