package ch09._05_Generics._05;

public class GenericMethod {
	// �x����k: printArray�i�H�L�X�h�ؤ��P�������}�C
	// 
	public <E> void printArray(E[] inputArray) {
		// ��ܰ}�C��������
		for (E element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] ia = {1, 2, 3};
		String[]  sa = {"Kitty", "Snoopy"};
		
		GenericMethod gm = new GenericMethod();
		gm.printArray(ia);    // OK
		gm.printArray(sa);    // OK
	}
}