package ch12._01_enum._00;
// ���d�Ҫ��ت��b�����ϥξ�Ʊ`�ƨӥN��ֶq�i���(�p�K�L��V)�����I
// ���d�Ҩå��ϥΦC�|
public class SeasonNG {
	public final static int SPRING = 1;
	public final static int SUMMER = 2;
	public final static int AUTUMN = 3;
	public final static int WINTER = 4;
	public static String getComment(int season) {
		String comment = "?????";
		switch(season) {
		   case SPRING : 
			   comment = "�K�����A";
			   break;
		   case SUMMER : 
			   comment = "�����L��";
			   break;
		   case AUTUMN : 
			   comment = "���n";
			   break;
		   case WINTER : 
			   comment = "�ѴH�a��";
			   break;
		}
		return comment;
	}
}