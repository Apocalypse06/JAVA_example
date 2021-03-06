package ch10._n06;

//傳送整數100到Client端

import java.net.*;
import java.io.*;

public class SimpleServer0 {
   public static void main(String args[]) {
      ServerSocket s = null;
      OutputStream s1out = null;
      InputStream  s1in  = null;
      try {
        s = new ServerSocket(5432);  // 登記Server要使用port 5432
      } catch (IOException e) {
    	System.out.println("Server: 起始化失敗");
        e.printStackTrace();
        return;
      }
//      while (true) {
         try {
            System.out.println("Server: Server待命中") ;
            Socket s1 = s.accept();
            System.out.println("Server: 與Client連上線") ;
            s1out = s1.getOutputStream();
            s1in  = s1.getInputStream();
            s1out.write(100) ;   
            System.out.println("Server: 寫出數字100到Client端") ;
         } catch (IOException e) {
        	System.out.println("Server: 發生IO例外");
            e.printStackTrace();
         } finally {
 			if (s1out != null) {
 				try {
 					s1out.close();
 				} catch (IOException e) {
 					e.printStackTrace();
 				}
 			}
 			if (s1in != null) {
 				try {
 					s1in.close();
 				} catch (IOException e) {
 					e.printStackTrace();
 				}
 			}
 		}
//    }
   }
}
