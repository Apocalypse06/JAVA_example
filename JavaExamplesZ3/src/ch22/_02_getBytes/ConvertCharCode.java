package ch22._02_getBytes;

import java.io.UnsupportedEncodingException;

public class ConvertCharCode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String user = "��";
		byte[] b1 = user.getBytes("UTF-16BE");
		byte[] b2 = user.getBytes("UTF-8");
		byte[] b3 = user.getBytes("CNS11643");
//      // �N�r�ꤺ���C�@�Ӧr�����s�X�A��Unicode�ഫ�����w���s�X
		byte[] b = user.getBytes("BIG5");
		// ���P��  for(int n=0; n < b.length; n++) {
		for(byte ch:b){                              
			// �N���ch�ഫ��16�i���ܪk�A��J�r���ܼ�tmp��
			String tmp = Integer.toHexString(ch);    
			// �p�Gtmp�����׬�1,
			if (tmp.length() == 1){                  
				// �e����0 (�]���ߺD�W�@�Ӧ줸�ժ���Ƴ�����ӲŸ�)
				tmp = "0" + tmp;                     
				// �p�Gtmp�����פj��2,�p ffffffa7
			} else if (tmp.length() > 2) {           
				// ���̫��ӼƦr
				tmp = tmp.substring(tmp.length()-2);  
			}
			System.out.println(tmp.toUpperCase());
		}

	}

}
