package HomeWork_Ch06;

/*
 * ���g�@�Ӫ���Τ�k�A�i�H��*�L�X����ϧ�
 */

//�����
class Rectangle {
	private int _width;
	private int _height;
	//�غc
	Rectangle(int w, int h){
		this._height = h;
		this._width  = w;
	}
	//�H*�L�X����e��
	public void _starSquare(){
		for(int i = 0; i < _width; i++){
			for(int j = 0; j < _height; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

//main
public class Question1 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 10);
		r._starSquare();
	}
}
