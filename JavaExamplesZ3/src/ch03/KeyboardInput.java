package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	public static void main(String[] args) {
		// �إߤ@��InputStreamReader���O������isr
		InputStreamReader isr = new InputStreamReader(System.in);
		// �إߤ@��BufferedReader���O������br�A��br����|�Pisr����X�@��
		// Ū���@����
		BufferedReader in = new BufferedReader(isr);
		String s = null;
		try {
			s = in.readLine(); 
			System.out.println("Ū�J����Ƭ�:" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
