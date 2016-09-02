package ch04;
/*
Q04_15.隨機產生介於-1到10的亂數，如果是-1，停止程式的執行，
          否則依序印出黃色、綠色、藍色與該亂數。例如產生的亂數為 
    5, 1, 7, 10, 2, 0, 8, -1，則程式印出
	黃色  5
	綠色  1
	藍色  7
	黃色  10
	綠色  2
	藍色  0
	黃色  8
 */
public class Q04_15 {
	public static void main(String[] args) {
		int x=(int)(Math.random()*12)-1;	//產生-1~10之變數
		int count=0;                    	//儲存迴圈執行的次數
		while(x!=-1){                   	//while條件式
			count++;                    	//進入迴圈後加一次
			switch(count%3){            	//計算循環
			case 1:
				System.out.println("黃色  "+x);
				break;
			case 2:
				System.out.println("綠色  "+x);
				break;
			default:
				System.out.println("藍色  "+x);
			}
			x=(int)(Math.random()*12)-1;  //再產生-1~10之隨機變數
		}	   
		System.out.println("程式結束, x=" + x);
	}
}
