package ch04;
/*
Q0415���t�~�@�ظѪk:
          �H�����ͤ���-1��10���üơA�p�G�O-1�A����{��������A
          �_�h�̧ǦL�X����B���B�Ŧ�P�ӶüơC�Ҧp���ͪ��üƬ� 
    5, 1, 7, 10, 2, 0, 8, -1�A�h�{���L�X
	����  5
	���  1
	�Ŧ�  7
	����  10
	���  2
	�Ŧ�  0
	����  8
 */
public class Q04_15A {
	public static void main(String[] args) {
		System.out.println("Q0415���t�~�@�ظѪk:");
		int x=(int)(Math.random()*12)-1;	//����-1~10���ܼ�
		int count=0;                    	//�x�s�j����檺����
		while(x!=-1){                   	//while����
			count++;                    	//�i�J�j���[�@��
			if (count%3==1){            	//�p��`��
				System.out.println("����  "+x);
			} else if  (count%3==2){           
				System.out.println("���  "+x);
			} else {
				System.out.println("�Ŧ�  "+x);
			}
			x=(int)(Math.random()*12)-1;   //�A����-1~10���H���ܼ�
		}	   
		System.out.println("�{������, x=" + x);
	}
}
