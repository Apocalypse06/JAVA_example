package ch11._05_PC_NG_0;

public class Producer implements Runnable {
	SharedData sd;

	Producer(SharedData sd) {
		this.sd = sd;
	}

	String s = "ABCDEFGHIJK";

	public void run() {
		System.out.println("P : �Ͳ��̶}�l�Ͳ����...");
		for (int i = 0; i < s.length(); i++) {
			System.out.println("P : �Ͳ��̧Y�N�Ͳ��@�ӷs�����:");
			int j = (int) (Math.random() * 1000);
			sd.data = s.charAt(i);
			System.out.println("P : �Ͳ��̷ǳƱN�̷s�Ͳ�����Ʃ�J�@�ΰ�: " + (char) sd.data);
			System.out.println("P : �Ͳ��̥Ͳ���ƫ�A�ǳƥ𮧤@�q�ɶ�:" + j + "�@��(�H���ɶ�)");

			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
			}

		}
		System.out.println("P : �Ͳ��̰���Ͳ���ơA�����e��m-1�ӳq�����O�̤w�L��ƥi���O�C");
		sd.data = -1;
		System.out.println("P : �Ͳ��̤u�@����...");
	}
}
