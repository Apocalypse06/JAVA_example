package ch10._05;
//  ���ɮ�(readme.txt)Ū�J�h���ơA�� readLine()�Ǧ^ null��, ��ܸ�Ƥw�gŪ�������C
//  �ϥ����O�GBufferedReader/FileReader/PrintWriter/FileWriter
import java.io.*;
public class ReadLinesDemoTWR {
	public static void main(String[] args) throws IOException {
		String s = null;
		// ���ɮ�Ū�J���
		try(BufferedReader br = new BufferedReader(new FileReader("readme.txt"));
			PrintWriter    pw = new PrintWriter(new FileWriter("readme.bak"));	
		) 
		{
			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			System.out.println("��ƥ����g�X��readme.bak");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
};
