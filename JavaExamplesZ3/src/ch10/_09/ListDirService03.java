package ch10._09;

import java.io.File;
import java.io.FilenameFilter;

public class ListDirService03 {
	private File dir ;			//�n��ܤ��e����Ƨ�
	private String fileTypes;	//�ɮ�����
	//�غc�l�@�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��File
	// 2. fileType:�n��ܪ��ɮ�����
	public ListDirService03(File dir, String fileTypes){
		this.dir = dir;
		this.fileTypes = fileTypes;
	}
	//�غc�l�G�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��String
	// 2. fileType:�n��ܪ��ɮ�����
	public ListDirService03(String dir, String fileTypes){
		this.dir = new File(dir);
		this.fileTypes = fileTypes;
	}
	public void showDirectoryContent(){
		SuffixFilter sf = new SuffixFilter();
		String[] ld01 = dir.list(sf);
		for (String s:ld01){
			System.out.println(s);
		}
	}
	//SuffixFilter���������O�C�Ъ`�N�A�b�����O�������ϥΥ~�����O��
	//fileTypes�ݩ�
	public class SuffixFilter implements FilenameFilter {
		String[] suffix;
		public SuffixFilter() {
			suffix = fileTypes.split(",");
			for (int n = 0; n < suffix.length; n++) {
				suffix[n] = suffix[n].toLowerCase().trim();
			}
		}
		
		public boolean accept(File dir, String name) {
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
	}	
	public static void main(String[] args) {
		ListDirService03 ld03 = new ListDirService03("D:\\", "zip, gif");
		ld03.showDirectoryContent();
	}
}