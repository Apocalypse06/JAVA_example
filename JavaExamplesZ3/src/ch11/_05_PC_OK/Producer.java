package ch11._05_PC_OK;

public class Producer implements Runnable {
	SharedData sd;
	String s = "ABCDEFGHIJK";
	Producer(SharedData sd) {
		this.sd = sd;
	}
	public void run() {
		System.out.println("P : �Ͳ��̶}�l�Ͳ����...");
		for (int i = 0; i < s.length(); i++) {
			System.out.println("P : �Ͳ��̧Y�N�Ͳ��@�ӷs�����:");
			int j = (int) (Math.random() * 1000);
			sd.setData(s.charAt(i));
			System.out.println(
			"P : �Ͳ��̥Ͳ���ƫ�A�ǳƥ𮧤@�q�ɶ�:" + j + "�@��(�H���ɶ�)");
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("P : �Ͳ��̰���Ͳ���ơA�����e��m-1�ӳq�����O�̤w�L��ƥi���O�C");
		sd.setData(-1);
		System.out.println("P : �Ͳ��̤u�@����...");
	}
}
