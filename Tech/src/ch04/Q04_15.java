package ch04;
/*
Q04_15.�H�����ͤ���-1��10���üơA�p�G�O-1�A����{��������A
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
public class Q04_15 {
	public static void main(String[] args) {
		int x=(int)(Math.random()*12)-1;	//����-1~10���ܼ�
		int count=0;                    	//�x�s�j����檺����
		while(x!=-1){                   	//while����
			count++;                    	//�i�J�j���[�@��
			switch(count%3){            	//�p��`��
			case 1:
				System.out.println("����  "+x);
				break;
			case 2:
				System.out.println("���  "+x);
				break;
			default:
				System.out.println("�Ŧ�  "+x);
			}
			x=(int)(Math.random()*12)-1;  //�A����-1~10���H���ܼ�
		}	   
		System.out.println("�{������, x=" + x);
	}
}
