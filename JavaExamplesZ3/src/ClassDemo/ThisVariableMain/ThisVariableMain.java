package ClassDemo.ThisVariableMain;

public class ThisVariableMain {
	public static void main(String[] args) {
		Cat kitty = new Cat("�͸���");
		// ��z�Lkitty�өI�ssmile()�ɡA
		// ���ɦbCat���O��smile()��k����this�ܼƭȡA
		// �N�Okitty����
		kitty.smile();  
		
//		// -----------------------------
//		Cat garfield = new Cat("�ŵ��");
//		// ��z�Lgarfield�өI�ssmile()�ɡA
//		// ���ɦbCat���O��smile()��k����this�ܼƭȡA
//		// �N�Ogarfield����
//		garfield.smile();
		
	}
}