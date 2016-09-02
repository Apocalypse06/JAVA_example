package ch10._10;
import java.io.File;
import java.io.FilenameFilter;
public class ListDirService04 {
	private File dir ;			//�n��ܤ��e����Ƨ�
	private String fileTypes;	//�ɮ�����
	String[] suffix;
	//�غc�l�@�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��File
	// 2. fileType:�n��ܪ��ɮ�����
	public ListDirService04(File dir, String fileTypes){
		this.dir = dir;
		this.fileTypes = fileTypes;
		suffix = fileTypes.split(",");
		for (int n = 0; n < suffix.length; n++) {
			suffix[n] = suffix[n].toLowerCase().trim();
		}
	}
	//�غc�l�G�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��String
	// 2. fileType:�n��ܪ��ɮ�����	
	public ListDirService04(String dir, String fileTypes){
		this(new File(dir), fileTypes);
	}
	// �ĥ� Lambda Expression
	// 
	public void showDirectoryContent(){
		String[] ld01 = dir.list(			
			(File dir, String name)-> {
				boolean ok = false;
				name = name.toLowerCase();
				for (String str : suffix) {
					if (name.endsWith(str)) {
						ok = true;
						break;
					}
				}
				return ok;
			}
		);
		for (String s:ld01){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ListDirService05 ld05 = new ListDirService05("D:\\", "gif, html");
		ld05.showDirectoryContent();
	}
}