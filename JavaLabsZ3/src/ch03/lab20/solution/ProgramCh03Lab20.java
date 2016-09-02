package ch03.lab20.solution;
// 字串的方法練習：indexOf()、lastIndexOf()與substring() 
public class ProgramCh03Lab20 {
	public static void main(String[] args) {
		System.out.println("請取出字串 url中的子字串 \"2.gif\"，放入變數 fileName中 ");
		String url = "http://tw.news.yimg.com/comics/comics_whatthehell/2.gif";
		int lastIndex = url.lastIndexOf("/");
		String fileName = url.substring(lastIndex + 1);
		System.out.println("FileName=" + fileName);
	}
}
