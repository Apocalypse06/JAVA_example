package HomeWork_Ch07;
import HomeWork_Ch06.Question2;

//�������O�Q�sĶ�ɡA�������R�A�϶�
//�L�X"BlockA->B->C"�A�A����main��k�A
//Question1���O������Q�ŧi�A����غc�l�A�L�X"Constructor"
//�̫�L�X"Hahaha"

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

