package HomeWork_Ch06;

import java.util.Scanner;

//
class Handler {
	private int _max = Integer.MIN_VALUE;
	private int _min = Integer.MAX_VALUE;
	private int _count;
	private int _total;
	//参璸羆㎝计秖耞琌程程
	public void _handlString(String s) {
		int temp = Integer.parseInt(s);
		_total += temp;
		_count ++;
		_findMax(temp);
		_findMin(temp);
	}
	//ゑ耕程
	public void _findMax(int n) {
		if(n > _max)
			_max = n;
	}
	//ゑ耕程
	public void _findMin(int n) {
		if(n < _min)
			_min = n;
	}
	//程
	public int _getMax() {
		return _max;
	}
	//程
	public int _getMin() {
		return _min;
	}
	//羆㎝
	public int _getTotal() {
		return _total;
	}
	//キА
	public double _getAve() {
		return (_total / _count);
	}
}

public class Question5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Handler handl = new Handler();
		String s = scan.next();
		
		//quit瞒秨玥秈羆矪瞶
		while (!s.equals("quit")){
			handl._handlString(s);
			s = scan.next();
		}
		scan.close();
		//
		System.out.println("羆㎝    : " + handl._getTotal());
		System.out.println("キА : " + handl._getAve());
		System.out.println("程 : " + handl._getMax());
		System.out.println("程 : " + handl._getMin());
	}

}
