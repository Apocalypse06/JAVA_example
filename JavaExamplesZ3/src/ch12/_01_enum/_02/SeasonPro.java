package ch12._01_enum._02;
//���d�Ҩϥθ��������C�|�A���C�|���|�ӦC�|�`�ơA�@�Ӧ��Ѽƪ��غc�l
//����ݩʻP��Ӥ�k�A�䤤�@��Override�FtoString()�C
public enum SeasonPro {
	SPRING("�K�����A", 1), SUMMER("�����L��", 2), 
	AUTUMN("���n", 3), WINTER("�ѴH�a��", 4);
	public int index = 0;
	String comment;

	private SeasonPro(String comment, int index) {
		System.out.println("�[��C�|:" + index);
		this.comment = comment;
		this.index = index;
	}
	public String getComment() {
		String msg; 
		msg = "��" + index + "�u, " + comment; 
		return msg;
	}
	@Override
	public String toString() {
		String msg; 
		msg = "��" + index + "�u, " + comment; 
		return msg;
	}
}
