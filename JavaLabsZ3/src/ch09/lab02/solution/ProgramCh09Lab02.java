package ch09.lab02.solution;

import java.util.ArrayList;
import java.util.Vector;
/*
�s�gProgramCh09Lab02.java�A�bmain()�����ŧi�@��
ArrayList���O������al�A�䤺�����s��U�C��ơG
  new Integer(10000)
  new Double(3.14)
  new Long(21L)
  short���O������(�Ȭ�100)
  new Double(5.1)
  "Kitty"
  new Integer(200)
  new Object()
  �غc�@��Vector���O������v�A�䤺�����s��U�C��ơGnew Integer(10000)�Pnew Integer(200)
  �P�_����al�O�_�����]�t(containsAll())����v
  �L�X����al�P����v�������Ӽ�
  �Nv�ഫ�������OInteger���}�C
 */
public class ProgramCh09Lab02 {
	public static void main(String[] args) {
		ArrayList<Object>  al = new ArrayList<>();
		al.add(new Integer(10000));
		al.add(new Double(3.14));
		al.add(new Long(21L));
		al.add(new Short("100"));
		al.add(new Double(5.1));
		al.add("Kitty");
		al.add(new Integer(200));
		al.add(new Object());
		Vector<Integer> v = new Vector<>();
		v.add(new Integer(200));
		v.add(new Integer(10000));
		System.out.println("����al�O�_�����]�t����v:" + al.containsAll(v));
		System.out.println("����al�������Ӽ�:" + al.size());
		System.out.println("����v�������Ӽ�:" + v.size());
		Integer[] ia = (Integer[])v.toArray(new Integer[0]);
	}
}