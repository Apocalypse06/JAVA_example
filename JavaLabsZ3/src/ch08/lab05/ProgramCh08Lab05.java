package ch08.lab05;

// �U�����{���sĶ�ɷ|���Ϳ��~�A�Эץ��A���ԭz�Ϩ��������sĶ, �åB����C
import java.net.*;
import java.io.*;

public class ProgramCh08Lab05 {
	public static void main(String[] args) {

	}
}

class SuperClass {
	public void m1() throws MalformedURLException {
		URL seednet = new URL("http://www.seed.net.tw");
		// ...
	}
}

class Subclass extends SuperClass {
	// �����U�����`��
	/*
	public void m1() throws IOException {
		URL seednet = new URL("http://www.seed.net.tw");
		FileInputStream fis = new FileInputStream("c:\\Test.txt");
		// ...
	}
	*/
}