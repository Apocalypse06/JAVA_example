package ch10._05;
//  �{���p�G����PrintWriter����A�̫�@���ƱN���g�X�C
import java.io.*;

public class ReadLinesErrorProneDemo {
	public static void main(String[] args)  {
		String s = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		// ���ɮ�Ū�J���
		
		try {
			br = new BufferedReader(new FileReader("readme.txt"));
			pw = new PrintWriter(new FileWriter("readme.err"));
			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			System.out.println("��ƥ����g�X��readme.err");
			System.out.println("�{���p�G�S������PrintWriter����A�̫�@���ƱN���g�X�C");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			if (pw!=null) {
//				pw.close();
//			}
			if (br!=null) {
				try {
				  br.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
};