package ch10._08;

import java.io.File;
import java.io.FilenameFilter;

//�����O�i�ΨӹL�o *.zip�������ɮ�
public class SuffixFilter implements FilenameFilter {
	String[] suffix;
	public SuffixFilter(String sx) {
		//�ǤJ���Ѽƥi��O "zip, rar, jar"�����ɦW
		//���̷ӳr���Ӥ��Φr��
		suffix = sx.split(",");
		//�N�}�C�������������令�p�g�r��
		for (int n = 0; n < suffix.length; n++) {
			suffix[n] = suffix[n].toLowerCase().trim();
		}
	}
	//FilenameFilter�����w�q����k
	public boolean accept(File dir, String name) {
		boolean ok = false;
		name = name.toLowerCase();
		//���ǤJ���ѼơA�P�_name�O���O�άY�@�Ӱ��ɦW������?
		for (String str : suffix) {
			if (name.endsWith(str)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
}
