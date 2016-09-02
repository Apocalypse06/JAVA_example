package HomeWork_Ch06;

/*
 * 撰寫一個長方形方法，可以用*印出實體圖形
 */

//長方形
class Rectangle {
	private int _width;
	private int _height;
	//建構
	Rectangle(int w, int h){
		this._height = h;
		this._width  = w;
	}
	//以*印出實體寬高
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
