package ch22._00_TimerTask;

import java.util.Timer;

public class TimerTask00 {
	public static void main(String[] args) {
		MyTask mt = new MyTask(2);
        Timer t = new Timer();
        t.schedule(mt, 0, 1000);
	}
}
