package ch06._03_method.rv;
import java.util.Date;
public class ReturnValueDemo {
	public void returnValue0() {
		System.out.println("����k�S���Ǧ^��");
	}
	public int returnValue1() {
		System.out.println("����k�Ǧ^�@�Ӿ�ơG");
		int num = (int)(Math.random() * 11) - 5 ;
		return num;
	}
	public int[] returnValue2() {
		System.out.println("����k�Ǧ^�@�Ӱ}�C�G");
		int yy = 2012;
		int mm = 6;
		int dd = 30;
		int[] ar1 = { yy, mm, dd };
		return ar1;
	}
	public Message returnValue3() {
		System.out.println("����k�Ǧ^�@��Message���A������G");
		Message msg = new Message();
		msg.code = 100;
		msg.msg = "�в�Ū���d��";
		msg.now = new Date();
		return msg;
	}
}
