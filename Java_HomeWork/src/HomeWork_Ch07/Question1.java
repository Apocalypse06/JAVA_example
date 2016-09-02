package HomeWork_Ch07;
import HomeWork_Ch06.Question2;

//公用類別被編譯時，先執行靜態區塊
//印出"BlockA->B->C"，再執行main方法，
//Question1類別的物件被宣告，執行建構子，印出"Constructor"
//最後印出"Hahaha"

public class Question1 {
	
	static {
		System.out.println("BlockA!!!");
	}
	
	Question1() {
		System.out.println("Constructor!!!");
	}
	
	static {
		System.out.println("BlockB!!!");
	}
	
	public static void main(String[] args) {
		Question2 Q2 = new Question2();
		Q2.main(null);
		Question1 test = new Question1();
		System.out.println("Hahaha!!!");
		
	}
	
	static {
		System.out.println("BlockC!!!");
	}
}

