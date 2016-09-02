package ch06.lab18.solution;
/*
1. ch06.lab17���ӯ��I�G�ѩ�C�Ӥl���O���~��Shape���O�A�o�����O������ �p��
        ���n����k���ϥ��~�ӨӪ�getShapeArea()�A�]���o�쪺���׳��@��(100)�A��
        �m�߭n�勵�o�ӯ��I�C
2. �b�M��ch06.lab18����Circle���O�BRectangle���O�PTriangle���O���O
   Shape���O���l���O�A�ӥB�U���@�ӫغc�l�A�|�ǤJ�����ݩʪ����:
     Circle���O: �ǤJ�ꪺ�b�|(radius)
     Rectangle���O: �ǤJ�x�Ϊ��e(width) �B��(height)
     Triangle���O: �ǤJ�T���Ϊ���(side) �B��(height)
       �C�Ӥl���O���|�۰ʾ֦������O�Ҿ֦����Ҧ���k�A���O�o�Ǥ�k�p�G���A�X�l���O�A�l
       ���O�i�HOverride�~�ӨӪ���k�C
   Shape���O���@�ӷs����k�p�U�G
      public double getArea() {
	     return 0; 
      }
      ����k�t�d�p��Shape�a�����O�����n�C
      
3. �C��Shape�a�ڪ��l���O������Override�o���~�ӨӪ���k�A�b����k���p��ۤv�����n: 
     Circle���O�����n: Math.PI * radius * radius
     Rectangle���O�����n: width * height
     Triangle���O�����n: 0.5 * side* height  

4. �ק�T�Ӥl���O�����ShapeMain���O��main()��k�Ӵ��էA���{���C
 
*/
public class ShapeMain {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println("c1�����n=" + c1.getArea());

		Rectangle r1 = new Rectangle(10,20);
		System.out.println("r1�����n=" + r1.getArea());

		Triangle t1 = new Triangle(10, 5);
		System.out.println("t1�����n=" + t1.getArea());	
	}
}