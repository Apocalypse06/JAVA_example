package ch08.lab04;

// ������10�檺�`�ѨýsĶ�U���{���ɡA��10�C�|���Ϳ��~�A�Х[�J�A�� try-catch �϶����{������sĶ, �ï������
import java.io.* ;
import java.net.* ;

public class ProgramCh08Lab04 {
   public static void main(String[] args)   {
	   
//       methodA() ;
       
       System.out.println("Program ends") ;
   }        
   static void methodA() throws IOException {
       int no = 0 ; 
       if ( no != 0) {
          int i = 3 / no ;
       } 
       URL urlA = new URL("http://www.seed.net.tw") ;
       FileInputStream fis = new FileInputStream("c:\\Test.txt") ;
    }	
} 