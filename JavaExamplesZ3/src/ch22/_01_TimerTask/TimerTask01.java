package ch22._01_TimerTask;

import java.util.Timer;
import java.util.TimerTask;

import ch22._00_TimerTask.Dog;

public class TimerTask01 {
	public static void main(String[] args) {
        Timer t = new Timer();
        final Dog d = new Dog();
        final int x = 3;
        t.schedule(new TimerTask(){
        	int i = 0 ;
        	@Override
        	public void run() {
        		for(int n=0 ; n < x; n++){
        		   d.bark();
        		}
        		i++;
        		System.out.println("此方法每隔一段時間會被執行一次:" + i);
        	}
        }, 0, 1000);
	}
}
