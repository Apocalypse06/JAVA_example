package ch10._07;
import java.io.File;
public class ListDirService01 {
	private File dir ;   //�n��ܤ��e����Ƨ�
	//�غc�l�@�G����File���O������
	public ListDirService01(File dir){
		this.dir = dir;
	}
	//�غc�l�G�G����String���O������
	public ListDirService01(String dir){
		this.dir = new File(dir);
	}
	//��ܸ�Ƨ������e�A��������ܡA�S���L�o�C
	public void showDirectoryContent(){
		String[] ld01 = dir.list();
		for (String s:ld01){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		String path = "D:\\";
		ListDirService01 ld = new ListDirService01(path);
		System.out.println(path+ "���U�����e:");
		ld.showDirectoryContent();
	}
}