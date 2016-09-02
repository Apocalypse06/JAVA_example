package ch04;

/*
Q04_17. 2001-2400ぇ丁琌4计ぃ琌100计
 ┪琌400计陪ボ羆Τ碭硂妓计 
 (秥碞琌ノ砏玥ㄓ∕﹚) 
 */
public class Q04_17 {

	public static void main(String[] args) {
		int x = 2001, count = 0;
		while (x <= 2400) {	// 眖2001-2400			
			// x4ぃ100计 ┪x400计
			if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) { 
				System.out.println(x);
				count++; // 璸衡
			} 
			x++;
		}
		System.out.println("Τ" + count + ""); // 碭
	}
}
