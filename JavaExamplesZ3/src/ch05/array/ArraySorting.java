package ch05.array;
import java.util.*; 
public class ArraySorting {
	public static void main(String[] args) {
		Integer[] arr = { 100, 50, 70, 88, 99, 39, 91 };
		Arrays.sort(arr);
		System.out.print("���W�Ƨ�:");
		System.out.println(Arrays.toString(arr));
		List<Integer> list = Arrays.asList(arr);
//		List<String> list2 = Arrays.asList("Kitty", "Micky", "String");
//		Collections.reverse(list);
//		System.out.print("����Ƨ�:");
//		System.out.println(Arrays.toString(list.toArray()));
			
	}
}
