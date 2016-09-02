package ch06._09_object.toString;
class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(x, y) = (" + x + ", " + y + ")";
	}
}
public class ToStringDemo {
	public static void main(String[] args) {
		Point p = new Point(3, 4);
		System.out.println("toString()���T�إΪk�G\n(1)�����L�X����\n" +
				"(2)�I�s����toString()\n(3)�r��P����ۥ[\n");
		System.out.print("toString()���Ĥ@�إΪk�G"); 
		System.out.println(p);
		System.out.println("toString()���ĤG�إΪk�G" + p.toString());
		System.out.println("toString()���ĤT�إΪk�G" + p);
	}
}