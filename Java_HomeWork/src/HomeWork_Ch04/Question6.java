package HomeWork_Ch04;

/*
 * �L�X�D�ذT��
 */

public class Question6 {
	public static void main(String[] args) {
		//�C�@�C�������Ӷ}�Y10��
		//���[�j�p���C�@�C�}�Y
		for(int i = 1; i <= 10; i++){
			for(int j = i; j <= (i*10); j+=i){
				System.out.print(j + (j > 9 ? "  ":"   " ));
			}
			System.out.println(" ");
		}
	}
}
