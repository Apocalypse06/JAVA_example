package ch10._10;
import java.io.File;
import java.io.FilenameFilter;
public class ListDirService05 {
	private File dir ;			//�n��ܤ��e����Ƨ�
	private String fileTypes;	//�ɮ�����
	String[] suffix;
	//�غc�l�@�G������ӰѼ�
	// 1. dir:�n��ܪ���Ƨ��A���O��File
	// 2. fileType:�n��ܪ��ɮ�����
	public ListDirService05(File dir, String fileTypes){
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
	public ListDirService05(String dir, String fileTypes){
		this(new File(dir), fileTypes);
	}
	// ����k�����ΦW�����O
	// �ΦW�����O�����I:
	// 1. ����new������new��H���O��new����ݭn�QOverride�Y�Ӥ�k�������O
	// 2. ���ͪ���ɡA�~�w�q���O
	public void showDirectoryContent(){
		String[] ld01 = dir.list(new FilenameFilter(){			
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
		});
		for (String s:ld01){
			System.out.println(s);
		}
	}
	/* ************** �w�g���� *********************
	public class SuffixFilter implements FilenameFilter {
		String[] suffix;

		public SuffixFilter(String suffix) {
			String[] tmp = suffix.split(",");
			for (int n = 0; n < tmp.length; n++) {
				tmp[n] = tmp[n].toLowerCase().trim();
			}
			this.suffix = tmp;
		}
		@Override
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
    // ************** �w�g���� *********************
	*/
	public static void main(String[] args) {
		ListDirService05 ld04 = new ListDirService05("D:\\", "jar, txt");
		ld04.showDirectoryContent();
	}
}