package ch07.lab01.solution;
// �Ч󥿥��{�������~�AVAT���w�q�bUtility���O�����R�A����
public class ProgramCh07Lab01 {
     public static void main(String[] args) {
         //  ���D�e����������k���`��
    	 double price = 300 ; 
    	 double totalPriceTaxed = price * (1 + Utility.VAT); 
    	 System.out.println("�`���B:" + totalPriceTaxed);
     }
}


