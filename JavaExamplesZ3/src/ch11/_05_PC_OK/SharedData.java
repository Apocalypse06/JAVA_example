package ch11._05_PC_OK;
public class SharedData {
	private int data;
	private boolean available = false;
	synchronized public void setData(int i) {
		// �Ͳ��̰��檺��k
		System.out.println("P1");
		while (available == true) {   
			try {
				System.out.println("P2: �ѩ���O�̩|�������W���Ͳ�����ơA�]���Ͳ��̵L�k�~��u�@�A�������ݡC");
				this.wait();
				System.out.println("P3: �Ͳ��̳Q��_�C");
			} catch (InterruptedException e) {
			}
		}
		System.out.println("P4: �Ͳ��̷ǳƱN�̷s�Ͳ�����Ʃ�J�@�ΰ�: " + ( i != -1 ?   (char) i : "-1, ��ܤw�g�S����ƥi�H���O") );
		data = i;
		available = true;
		System.out.println("P5");		
		this.notify();
		System.out.println("P6: �Ͳ��̷ǳƪ�^...");
	}
	synchronized public int getData() {
		// ���O�̰��檺��k
		System.out.println("C1");
		while (available == false) {
			try {
				System.out.println("C2: �ѩ�Ͳ��̩|���Ͳ��̷s����ơA�]�����O�̵L�k�~��u�@�A�������ݡC");
				this.wait();
				System.out.println("C3: ���O�̳Q��_�C");
			} catch (InterruptedException e) {
			}
		}
		System.out.println("C4");
		available = false;
		System.out.println("C5");
		this.notify();
		System.out.println("C6: ���O�̷ǳƪ�^...");
		return data;
	}	
}
