package ch22._00_TimerTask;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    int i = 0 ;
    Dog d;
    int x;
    MyTask(int x){
       d = new Dog();	
       this.x = x;
    }
	@Override
	public void run() {
		for(int n=0 ; n < x; n++){
		   d.bark();
		}
		i++;
		System.out.println("此方法每隔一段時間會被執行一次:" + i);
	}
}
