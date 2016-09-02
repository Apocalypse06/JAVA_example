package ch09._05_Generics._03;
import ch09._05_Generics._01.Cat;

public class BoundedTypeMain {
	public static void main(String[] args) {
        Integer[] inum = {1, 2, 3, 4, 5};
        BoundedType<Integer> bti = new BoundedType<Integer>(inum);
        double v = bti.avg();                              // ���Ͱ}�C�ɡA��������
        System.out.println("inum��������=" + v);            // �����Ǥ���
        Double[] dnum = {1.1, 2.2, 3.3, 4.4, 5.5};
        BoundedType<Double> btd = new BoundedType<>(dnum);
        double u = btd.avg();
        System.out.println("dnum��������=" + u);
        Cat kitty = new Cat();
        Cat garfield = new Cat();
        Cat[] cnum = {kitty, garfield};
        //BoundedType<Cat> btc = new BoundedType<>(cnum); // NG
	}
}
