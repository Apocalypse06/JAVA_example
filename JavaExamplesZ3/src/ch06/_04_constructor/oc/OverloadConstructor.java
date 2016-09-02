package ch06._04_constructor.oc;

public class OverloadConstructor {
	public static void main(String[] args) throws Exception {
		String s0 = new String(); // �إߪŦr��
		System.out.println("s0="+s0);
		
		char[] c0 = {'�i', '�x', '��'};
		// �Q�Φr���}�Cc0�����e�A�ӫإߦr�ꪫ��
	    String s1 = new String(c0); 
	    System.out.println("s1="+s1);
	    
	    // �Q�Φr�ꪫ��s1�A�ӫإ߷s���r�ꪫ��s2
	    String s2 = new String(s1); 
	    System.out.println("s2="+s2);
	    
	    // �إߤ@�Ӧ줸�հ}�Cba
		byte[] ba = {(byte)0xB1, (byte)0x69, (byte)0xAD, (byte)0xB8};
	    // �Q�Φ줸�հ}�C���������ӫإ߷s���r�ꪫ��s3�A�줸�հ}�C�������|��
		// �����w�]�s�X(Big5)�Ӹ�Ū�A����A�������Ӽƨ��ഫ��Unicode�r��
		// �A�N�o�Ǧr���զ��@�Ӧr��C
		// �y�i�z��Big5�s�X��0xB1, 0x69, �y���z��Big5�s�X��0xAD, 0xB8
		String s3 = new String(ba); 
		System.out.println("s3="+s3);
		
	    // �إߤ@�Ӧ줸�հ}�Cbx
		byte[] bx = {(byte)0xE9,(byte)0x97, (byte)0x9C, (byte)0xE5, (byte)0x85, (byte)0xAC};
	    // �Q�Φ줸�հ}�C���������ӫإ߷s���r�ꪫ��s4�A�줸�հ}�C�������|��
		// ���w���s�X�Ӹ�Ū�A����A�������Ӽƨ��ഫ��Unicode�r��
		// �A�N�o�Ǧr���զ��@�Ӧr��C
		// �y���z��UTF-8�s�X��0xE9, 0x97, 0x9C, �y���z��UTF-8�s�X��0xE5, 0x85, 0xAC
		String s4 = new String(bx, "UTF-8"); 
		System.out.println("s4="+s4);
	}
}