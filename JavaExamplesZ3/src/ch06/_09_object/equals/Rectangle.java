package ch06._09_object.equals;

public class Rectangle extends Object {
	int height;
	int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int hashCode() {
		//��ĳ�N�ѻPequals()������Ҧ��ݩʳ��i�椬���ιB��A�p�G���O��ơA������
        //�ݩʶi�椬���ιB��A�p�G���䥦�򥻫��A(�pdouble,boolean)���ݩʡA
        //�h�N�o���ݩʥ]�ˬ�����C�K�j�򥻫��O�����������]�����O�A
        //�C�ӥ]�����O������i�H�]�@�����
        //�ѻPequals()������ݩʦp�G�O����h�I�s�Ӫ���hashCode()�A
        //��Ǧ^����ƶi�椬���ιB��C
        //return height ^ width ;
		return new Integer(height).hashCode() ^ 
				new Integer(width).hashCode();
	}

	public boolean equals(Object obj) {
		// ���P��ǤJ������O�_�O�����O������A�]�����P���O���������ӵ������۵�
		if (obj != null && obj instanceof Rectangle) {
			Rectangle re = (Rectangle) obj;
			if (this.height == re.height && this.width == re.width) {
				return true;
			} else {
				return false;
			}
		} else { // ���P���O�����󨫳o��
			return false;
		}
	}
}
