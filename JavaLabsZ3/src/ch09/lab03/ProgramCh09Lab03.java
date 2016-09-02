package ch09.lab03;

import java.util.ArrayList;
/*
 *  編寫ProgramCh09Lab03.java，承前題，對於ArrayList 
 *  類別之物件v，請使用5.0的增強版for()來加總物件
 *  v內，所有數值性的資料 
 */
public class ProgramCh09Lab03 {
	public static void main(String[] args) {
		ArrayList<Object>  v = new ArrayList<Object>();
		v.add(new Integer(10000));
		v.add(3.14);
		v.add(new Long(21L));
		v.add(new Short("100"));
		v.add(new Double(5.1));
		v.add("Kitty");
		v.add(200);
		v.add(new Object());
	}
}