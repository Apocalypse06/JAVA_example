package ch03.lab19.solution;
// �r�ꪺ��k�m�� indexOf()�PlastIndexOf()
public class ProgramCh03Lab19 {
    public static void main(String[] args) {
    	System.out.println("����ܦr�� url ���A�Ĥ@���X�{ com �P�̫�@���X�{ com ����m(index) ");
		String url = "http://tw.news.yimg.com/comics/comics_whatthehell/2.gif";
		int firstIndex = url.indexOf("com"); // �n�ק糧�ԭz�P�U�@�C�ԭz
		int lastIndex  = url.lastIndexOf("com");
		System.out.println("�r�� url�A�Ĥ@���X�{ com ����m(index) �� " + firstIndex);
		System.out.println("�r�� url�A�̫�@���X�{ com ����m(index) �� " + lastIndex);
    }
}
