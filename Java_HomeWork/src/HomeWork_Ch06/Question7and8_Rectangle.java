package HomeWork_Ch06;

public class Question7and8_Rectangle{
	
}

class MyRectangle {
	private double _width;
	private double _depth;
	
	public MyRectangle() { }
	public MyRectangle(double width, double depth) {
		this._width = width;
		this._depth = depth;
	}
	
	public Integer _getWidth() {
        return (int)_width;
    }
	
	public Integer _getDepth() {
        return (int)_depth;
    }
	
	public void _setWidth(double width) {
		this._width = width;
	}
	
	public void _setDepth(double depth) {
		this._depth = depth;
	}
	//­pºâ­±¿n
	public double _getArea(){
		return _width * _depth;
	}
	//Override equals
	public boolean equals(MyRectangle R){
		if(this._depth == R._depth && this._width == R._width)
			return true;
		else return false;
	}
	//Override hash
	public int hashCode(){
		final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + this._getWidth() + this._getDepth();
	    return result;
	}
}


