package ch10._00;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {	
	public static void main(String[] args) throws IOException {
        File dir = new File("C:\\", "Program Files");
        System.out.println(dir + "�O�_�s�b�@:" + dir.exists());
        System.out.println(dir + "�O�_���ؿ�:" + dir.isDirectory());
        System.out.println(dir + "�O�_��������|:" + dir.isAbsolute());
        //�p�G��File���󬰤@�Ӹ�Ƨ��A�h�Ǧ^�Ȥ���N�q�C
        System.out.println(dir + "�ɮת��j�p:" + dir.length());
        System.out.println(dir + "�ɮת����|:" + dir.getPath());
        System.out.println(dir + "�ɮת�������|:" + dir.getAbsolutePath());
        System.out.println(dir + "�ɮת��зǸ��|:" + dir.getCanonicalPath());
        System.out.println("-----------------------------------");
        dir = new File("C:\\", ".\\..\\Program Files");
        System.out.println(dir + "�O�_�s�b�@:" + dir.exists());
        System.out.println(dir + "�O�_���ؿ�:" + dir.isDirectory());
        System.out.println(dir + "�O�_��������|:" + dir.isAbsolute());
        //�p�G��File���󬰤@�Ӹ�Ƨ��A�h�Ǧ^�Ȥ���N�q�C
        System.out.println(dir + "�ɮת��j�p:" + dir.length());
        System.out.println(dir + "�ɮת����|:" + dir.getPath());
        System.out.println(dir + "�ɮת�������|:" + dir.getAbsolutePath());
        System.out.println(dir + "�ɮת��зǸ��|:" + dir.getCanonicalPath());
        System.out.println("-----------------------------------");        
        System.out.println("�bJava�{�����A�Ҧ����۹���|���O�۹��System.getProperty(\"user.dir\")");
        System.out.println(System.getProperty("user.dir"));       
        System.out.println("-----------------------------------");
        File f3 = new File("pictures", "./cartoon/micky.gif");
        // �p�Gf3���s�b
        if (!f3.exists()){
            // �p�Gf3���s�b �A�s��f3�ɮ�
        	dir.createNewFile();
        } 
        System.out.println(f3 + "�O�_���ؿ�:" + f3.isDirectory());
	    System.out.println(f3 + "�O�_���ɮ�:" + f3.isFile());
	    System.out.println(f3 + "�O�_�s�b�@:" + f3.exists());
	    System.out.println(f3 + "�ɮת��W��:" + f3.getName());
	    System.out.println(f3 + "�ɮת����ؿ��W��:" + f3.getParent());
	    System.out.println(f3 + "�ɮת����|:" + f3.getPath());        
        System.out.println(f3 + "�ɮת�������|:" + f3.getAbsolutePath());
        System.out.println(f3 + "�ɮת��зǸ��|:" + f3.getCanonicalPath());
        System.out.println("-----------------------------------");
	}
}
