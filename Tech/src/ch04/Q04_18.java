package ch04;
/*
Q04_18.�g�@�ӵ{���A����L�X�r�� "������B�L���B�Ŧ�B���A������"���A
                �Ҧ��y��z�X�{����m�C(���ܡA�Q��String���O��indexOf��k)

 */
public class Q04_18 {
	public static void main(String[] args) {
		String s = "������B�L���B�Ŧ�B���A������";
        char c = '��';
        int x = 0;                             //�j��ά����r����m
// �Ѫk�@:
        int idx = -1;
        while (true){
        	idx = s.indexOf("��", idx+1);  // �ѬY�Ӧ�m(idx+1)�}�l�����
        	if (idx == -1){  // ��ܨS��"��"�F
        		break;
        	}
        	System.out.println(idx + " " + s.charAt(idx));
        }
// �Ѫk�G:        
//        System.out.print("�r�ꤤ�Ҧ���X�{����m:");
//        for(x=0;x<s.length();x++){           //�r�ꤺ�C�@�Ӧr�h���R
//        	if(c==s.charAt(x)){              //�o�{��"��"��
//        		System.out.print(x+" ");     //�L�X��m
//        	}
//        }
	}
}
