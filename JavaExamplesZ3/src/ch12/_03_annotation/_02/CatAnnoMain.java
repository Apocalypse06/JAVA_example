package ch12._03_annotation._02;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//���d�ұNŪ��Cat���O����smile()��k�e������:CatAnno
public class CatAnnoMain {
	public static void processCatAnno() {
		try {
			//�ǳƳB�zCat���O�A�ҥH�����J��
			Class<Cat> catClass = Cat.class;
			//���XCat���O����smile()��k�A�s��bMethod���O������m����			
			Method m = catClass.getMethod("smile");
			//���XCat���O����voice���A�s��bField���O������fVoice����			
			Field fVoice = catClass.getDeclaredField("voice");
			//�NCat���O��ҤƬ�����:kitty
			Cat kitty = catClass.newInstance();
			int cnt = 1;
			String voice = null;
			//Ū���[�bCat���O��smile()��k�e��������:CatAnno
			CatAnno ma = m.getAnnotation(CatAnno.class);
			//�p�GCat���O��smile()��k�e�����[�W����CatAnno
			if (ma != null) {
				//���X�ӵ����������]�w��
				cnt = ma.count();
				voice = ma.meow();
				//�N���������Y�@����ƭ˶�^kitty�������voice��
				fVoice.set(kitty, voice);  // <---���n��....
			}
			//�L�X�Ӭݬݧa...
			System.out.println("Ū�쪺����, count=" + cnt + ", voice=" + voice);
			//�Q�ΨϥΪ̳]�w���������Ȩӧ���kitty���󪺦欰
			for (int n = 0; n < cnt; n++) {
				//�I�skitty����smile()��k(�ѤU���檺�ܼ�m�Ӫ��smile()��k)�A�j����檺����(cnt)�ѵ����ӨM�w
				m.invoke(kitty, new Object[] {});
			}
		} catch (NoSuchMethodException e) {
			System.out.println("�䤣����w����k:" + "smile");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		processCatAnno();
	}

}
