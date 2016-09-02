package ch05.array;
// �p���ư}�C���������`�M�B�̤j�ȻP�̤p��
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 100, 77, 90, 88, 99, 39, 91 };
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int n = 0; n < arr.length; n++) {
			sum += arr[n];
			if (arr[n] > max) {
				max = arr[n];
			}
			if (arr[n] < min) {
				min = arr[n];
			}
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.println("sum=" + sum);
	}
}