package ch11._05_PC_OK;
public class Consumer implements Runnable {
	SharedData sd;
	Consumer(SharedData sd) {
		this.sd = sd;
	}
	public void run() {
		int i;
		System.out.println("C : ���O�̶}�l���O���...");
		while (true) { 
			int j = (int) (Math.random() * 1000);
			System.out.println("C : ���O�̧Y�N���O�@�Ӹ��:");
			if ((i = sd.getData()) == -1) {
				break;
			}
			System.out.println("C : ���O�̥������O�����: " + (char) i);
			System.out.println(
			"C : ���O�̮��O��ƫ�A�ǳƥ𮧤@�q�ɶ�:" + j + "�@��(�H���ɶ�)");
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("C : ���O�̤u�@�����A�]���S����ƥi�H���O...");
	}
}
