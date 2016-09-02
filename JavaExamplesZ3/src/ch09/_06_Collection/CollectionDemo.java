package ch09._06_Collection;
import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) { 
       List<Object> c = new ArrayList<Object>() ;  // ���C�Ψ�x��
       Integer i = new Integer(123) ;
       Integer j = new Integer(456) ;
       c.add(i);                // �[�@�Ӿ�ƪ���
       Cat kitty = new Cat() ;  
       Cat lucky = new Cat() ;
       c.add(kitty) ;			// �[���Cat����
       c.add(lucky) ;
       c.add("abc") ;			// �[���String����
       c.add("abc") ;
       // �d�߶���c�O�_�]�t����i
       System.out.println("����c�O�_�]�t����i:" + c.contains(i));
       // ����c�������Ӽ�
       System.out.println("����c�������Ӽ�:" + c.size());
       // ��������c��������i
       c.remove(i) ;					
       System.out.println("����c�������Ӽ�:" + c.size());
       
       Collection<Integer> s = new Vector<>();
       s.add(i);
       s.add(j);
       System.out.println("����c�������Ӽ�:" + c.size());
       System.out.println("����c�O�_�����t������s������:" + c.containsAll(s));   
       System.out.println("����c.remove(i)��A�A�P�_�@��");
       Object[] oa = c.toArray(); // ����c�ഫ��Object�}�C
       System.out.println("����c�������Ӽ�:" + oa.length);
       Integer[] i0 = new Integer[0];   //Integer[] i0 = new Integer[s.size()];
       // ����s�ഫ����ư}�C
       Integer[] ia = s.toArray(i0);
       System.out.println("����s�������Ӽ�:" + ia.length);
       s.clear();
       System.out.println("�M���Ҧ�������A����s�������Ӽ�:" + s.size());
    }
}    
class Cat {
}	
