package ch03.lab20.solution;
// �r�ꪺ��k�m�ߡGindexOf()�BlastIndexOf()�Psubstring() 
public class ProgramCh03Lab20 {
	public static void main(String[] args) {
		System.out.println("�Ш��X�r�� url�����l�r�� \"2.gif\"�A��J�ܼ� fileName�� ");
		String url = "http://tw.news.yimg.com/comics/comics_whatthehell/2.gif";
		int lastIndex = url.lastIndexOf("/");
		String fileName = url.substring(lastIndex + 1);
		System.out.println("FileName=" + fileName);
	}
}
