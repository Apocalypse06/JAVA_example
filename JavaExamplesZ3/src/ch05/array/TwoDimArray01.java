package ch05.array;

public class TwoDimArray01 { 
    public static void main(String args[]) {
       int[][] ax00 = {{1,     2,   3, 5 ,6 }, //0
    		   
                       {123, 111,   5, 5, 7}, //1
                       
                       {0,    20,   0, 9, 6},  
                       
                       {19,   29,  39, 8, 100}}  ;//3 
       //ax00 ��4�Ӱ}�C
      
       // ��V�[�`(�C)
       int sum = 0 ;               
       for (int  i= 0 ; i < ax00.length; i++)  {
          sum = 0 ;
          for (int j = 0 ; j < ax00[i].length; j++)  {
             sum +=  ax00[i][j]; 
          }
          System.out.println("��" + i + "�C���M=" + sum ) ;
       }

       System.out.println( ) ;
       System.out.println("=========================");
    
       // �a�V�[�`(��)
       for (int i = 0 ; i < ax00[0].length; i++)  {
           sum = 0 ;
           for (int j = 0 ; j < ax00.length; j++)  {
              sum +=  ax00[j][i]; 
           }
           System.out.println("��" + i + "�檺�M="+ sum ) ;
        }
      }
  }

