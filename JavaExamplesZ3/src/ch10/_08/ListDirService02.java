package ch10._08;

import java.io.File;

public class ListDirService02 {
	private File dir ;  		//�n��ܤ��e����Ƨ�
	private String fileTypes;	//�ɮ�����
	//�غc�l�@�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��File
	// 2. fileType:�n��ܪ��ɮ�����
	public ListDirService02(File dir, String fileTypes){
		this.dir = dir;
		this.fileTypes = fileTypes;
	}
	//�غc�l�G�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��String
	// 2. fileType:�n��ܪ��ɮ�����
	public ListDirService02(String dir, String fileTypes){
		this.dir = new File(dir);
		this.fileTypes = fileTypes;
	}

	public void showDirectoryContent(){
		//�غcSuffixFilter���O������
		SuffixFilter sf = new SuffixFilter(fileTypes);
		String[] ld01 = dir.list(sf);
		for (String s:ld01){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ListDirService02 ld02 = new ListDirService02("D:\\", "zip, txt");
		ld02.showDirectoryContent();
	}
}