package ch07.lab03.solution;

// �Ч󥿥��{�������~�AVAT���w�q�bUtility���O�����D�R�A����
// (�� ch07.lab01 ����Ӳ�)
public class ProgramCh07Lab03 {
     public static void main(String[] args) {
         //	  ���D�e����������k���`��
         double price = 300 ; 
         Utility util = new Utility();
         double totalPriceTaxed = price * (1 + util.VAT);
         System.out.println("�`���B:" + totalPriceTaxed);
     }
}
