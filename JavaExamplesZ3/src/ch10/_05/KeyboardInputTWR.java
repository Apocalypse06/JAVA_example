package ch10._05;

import java.io.*;

import ch10.util.IOUtility;

public class KeyboardInputTWR {
	public static void main(String[] args) {
		String s = null;
		try(
			// �إߤ@��InputStreamReader���O������isr
			InputStreamReader isr = new InputStreamReader(System.in);
			// �إߤ@��BufferedReader���O������br�A��br����|�Pisr����
			// �X�@Ū���@����
			BufferedReader in = new BufferedReader(isr);		
		) {
			s = in.readLine();
			System.out.println("Ū�J����Ƭ�:" + s);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
