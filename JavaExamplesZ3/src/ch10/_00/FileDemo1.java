package ch10._00;

import java.io.File;
import java.io.IOException;

//���{�����Ӱ����T���A�[��P���p�U�Ҳ��ͪ����T��
public class FileDemo1 {	
	public static void main(String[] args) throws IOException {
	    File f1 = new File("c:\\Kitty");  
	    System.out.println(f1 + "�O�_���ؿ�:" + f1.isDirectory());
	    System.out.println(f1 + "�O�_���ɮ�:" + f1.isFile());
	    System.out.println(f1 + "�O�_�s�b�@:" + f1.exists());
	    // �i�H�s��c:\\Kitty�ؿ�(f1.mkdir())��
	    // �s�ؤ@�ӪŪ��ɮ�(f1.createNewFile())
	    
	    // �U����ӱԭz�G��@
        System.out.println("�s�إؿ�" + f1 + "�O�_���\:" + f1.mkdir());
        //System.out.println("�s���ɮ�" + f1 + ":" + f1.createNewFile());
        System.out.println("-----------------------------------");
        
        // ���]dir���ؿ�
        File dir = new File("d:\\log\\marketing");
        // �p�Gdir���s�b
        if (!dir.exists()){
            // �p�Gdir���s�b �A�s��dir�ؿ�(�`�N��k��:dir.mkdirs();)
        	dir.mkdirs();
        } else {
        	System.out.println(dir + "�w�g�s�b");
        }
        File f2 = new File(dir, "log.txt");
        System.out.println(f2 + "�O�_�s�b�@:" + f2.exists());
        
        if (!f2.exists()){
           //�bFile����dir�ҫ��w���ؿ��U�A�s�ؤ@���ɮ�
           System.out.println("�s���ɮ�" + f2 + ":" + f2.createNewFile());
        } else {
           System.out.println("�ɮ�" + f2 + " �w�g�s�b�L�k�s��");
           System.out.println(f2 + "�O�_�������ɡ@:" + f2.isHidden());
        }
        System.out.println(f2 + "�ɮת��j�p:" + f2.length());
	}
}
