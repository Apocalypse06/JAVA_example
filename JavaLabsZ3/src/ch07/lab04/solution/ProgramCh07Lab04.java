package ch07.lab04.solution;

//�Ч󥿥��{�������~�AgetFileName���w�q�bUtility���O(���P�M��)�����D�R�A��k
// (�� ch07.lab02 ����Ӳ�)

public class ProgramCh07Lab04 {
     public static void main(String[] args) {
         //  ���D�e����������k���`��
    	 
         String url_1 = "http://www.railway.gov.tw/pic/big_banner_160_172.jpg";
         String url_2 = "http://www.railway.gov.tw";
         String url_3 = "train.gif";
         Utility util = new Utility();
         System.out.println(util.getFileName(url_1));
         System.out.println(util.getFileName(url_2));
         System.out.println(util.getFileName(url_3));
         
     }
}