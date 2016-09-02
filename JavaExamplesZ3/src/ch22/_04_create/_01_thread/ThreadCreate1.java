package ch22._04_create._01_thread;

public class ThreadCreate1 {
   public static void main(String args[]) { 
      HelloThread r = new HelloThread("Kitty");
      r.start();
      HelloThread s = new HelloThread("Micky");
      s.start();
   }
}
