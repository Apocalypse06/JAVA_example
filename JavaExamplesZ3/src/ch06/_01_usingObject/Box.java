package ch06._01_usingObject;

//modifiers class classname
public class Box {

	// �ܼƫ��A �ܼƦW�� = ��� ;
	int width;
	int depth;
	int height;

	// �Ǧ^�Ȫ����A ��k�W��(�ѼƦC) {
	// type local-variable1 ;
	// type local-variable2 ;
	// statements ;
	// }
	public double getSurfaceArea() {
		return 2 * (width * depth + depth * height + width * height);
	}
	public double getVolume() {
		return width * depth * height;
	}
}