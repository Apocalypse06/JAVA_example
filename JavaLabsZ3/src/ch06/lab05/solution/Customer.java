package ch06.lab05.solution;
/*
 * �Щ�M��ch06.lab05���A�s�g�{��Customer.java�A
 * �ӵ{���w�q Customer ���O�A�t�������ݩʻP�@�Ӥ�k�A
 * �����ݩʦp�U�G 
1. customerID (int) : �t����� 12345
2. name (String)  : �t����� �i�j��
3. address (String) : �t����� �x�����j����581��415��
4. phoneNumber (String) : �t����� 0936666666
5. emailAddress (String) :�t����� mmm@sss.com.tw  
�Ч��������O����k:
   public void displayInformation() 
     ����k�|�H�U�C���覡�b�ù��W��� Customer ���򥻸��:
     �Ȥ�s��:xxxxxxxx 
     �Ȥ�m�W:xxxxxx
     �Ȥ�a�}:XXXXXXXXXXXXXXXXXXXXXXXX
     �q��:xxxxxxxxxxxxxxx
     email:xxxxxxxxxxxxxxxxxxxxxxxx

 */
public class Customer {
	int customerID = 12345;
	String name = "�i�j��";
	String address = "�x�����j����581��415��";
	String phoneNumber = "0936666666";
	String emailAddress = "mmm@sss.com.tw";
	public void displayInformation() {
	    System.out.println("�Ȥ�s��:" + customerID);	
	    System.out.println("�Ȥ�m�W:" + name);
	    System.out.println("�Ȥ�a�}:" + address);
	    System.out.println("�q��:" + phoneNumber);
	    System.out.println("email:" + emailAddress);
	}	
}