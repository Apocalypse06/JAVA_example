package ch06._09_object.equalsA;
public class Rectangle extends Object {
    int height;
    int width;
    double ratio;
    String code ;
    public Rectangle(int height, int width, double ratio, String code) {
        //super();
        this.height = height;
        this.width = width;
        this.ratio = ratio;
        this.code = code;
    }
    public int hashCode() {
        //��ĳ�N�ѻPequals()������Ҧ��ݩʳ��i�椬���ιB��A�p�G���O��ơA�������ݩʶi��
        //�����ιB��A�p�G���䥦�򥻫��A(�pdouble,boolean)���ݩʫh�N�o���ݩʥ]�ˬ�����C
        //�K�j�򥻫��O�����������]�����O�A�C�ӥ]�����O������i�H�]�@����ưѻPequals()
        //������ݩʦp�G�O����h�I�s�Ӫ���hashCode()�A��Ǧ^����ƶi�椬���ιB��C
        return height ^ width ^ new Double(ratio).hashCode() ^ code.hashCode() ;
    }
    public boolean equals(Object obj) {
  	  // ���P��ǤJ������O�_�O�����O������A�]�����P���O���������ӵ������۵�
      if (obj != null && obj instanceof Rectangle) {
          Rectangle re = (Rectangle) obj;    
          if (this.height == re.height 
                  && this.width == re.width 
                  && this.ratio == re.ratio
                  && this.code.equals(re.code) ) {
              return true;
          }else { // ���P���O�����󨫳o��
              return false;
          }
      }else{
          return false;
      }
  }
  // �`�N�A�ѩ�ѼƦC���˦��P���N��equals()��k���@�P�A�ҥH�U������k�L�k
  // Override���N��k�C
  public boolean equals(Rectangle  obj) {
       boolean same = true;
       //...
	    return same;
  }
}
