package jsoup._01_find_all_links;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
// 已測試網址: 
//   http://www.jsoup.org
/**
 * 執行本程式時必須加上VM參數: -Xmx1024m
 * @author 王憲春
 *
 */
public class RetrieveAllLinks {
	
	String mainSite ; 		// ex: http://www.iiiedu.org.tw
	String baseToken ;  	// ex: iiiedu.org.tw 
	Set<String> visitedUrls = new HashSet<>();
	Set<String> exclusiveUrls = new HashSet<>();
	PrintWriter out, logOK, logNG ;

	public static void main(String[] args) throws IOException {
		RetrieveAllLinks ra = new RetrieveAllLinks("http://www.mkyong.com");
		ra.linkTraversal(ra.mainSite);
	}
	public RetrieveAllLinks(String url) {
		mainSite = url;
		extractBaseToken();
		readExclusiveURL();
		try {
			out = new PrintWriter(new FileWriter("visitedURL.txt"));
			logOK = new PrintWriter(new FileWriter("visitedLogOK.txt"));
			logNG = new PrintWriter(new FileWriter("visitedLogNG.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void extractBaseToken() {
		// url=http://localhost:8080/example/index.jsp
		int start = mainSite.indexOf("//") + 2;
		String seg = mainSite.substring(start);
		int end = seg.indexOf("/") == -1 ? seg.length() : seg.indexOf("/") ;
	
		String url = seg.substring(0, end);
		String verifyToken = "www." ;
		if (url.startsWith(verifyToken)){
			baseToken = url.substring(verifyToken.length());
		} else {
			baseToken = url;
		}		
		System.out.println("baseToken=" + baseToken);
	}

	private void readExclusiveURL() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"ExclusiveURL.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				exclusiveUrls.add(line.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void linkTraversal(String url) throws IOException {
		int idx = 0 ;
        if ( (idx = url.indexOf("#")) != -1){
        	url = url.substring(0, idx);
        }
		if (needsToVisit(url)) { // 如果需要拜訪此網址
			logOK.println("需要拜訪------->" + url);
			logOK.flush();
			if (url.indexOf("java.sun.com")!=-1){
				    System.out.println("注意!!!");
					System.exit(0);
			}
			visitedUrls.add(url);
			
			try {
				out.println(url);
				out.flush();
				Document doc = Jsoup.connect(url).get(); // 連上此網站並取去對應的網頁

				/* ... 處理網頁內的資料 ... */
				Elements nextLinks = doc.select("a[href]");
				System.out.println("-->" + nextLinks.size());
				for (Element link : nextLinks) {
					linkTraversal(link.absUrl("href")); // Recursive call for
				}
			} catch (org.jsoup.HttpStatusException ex) {
				System.out.println("Http Status Exception:" + ex.getMessage()
						+ url);
			} catch (java.net.MalformedURLException ex) {
				System.out.println("MalformedURL Exception:" + ex.getMessage()
						+ url);
			} catch (java.io.IOException ex) {
				System.out.println("IO Exception:" + ex.getMessage()
						+ url);
			} catch (Exception ex) {
				System.out.println("Exception:" + ex.getMessage()
						+ url);
			} 
		} else {
			logNG.println("不需拜訪------->" + url);
			logNG.flush();
		}
	}

	private boolean  needsToVisit(String url) {
		if (visitedUrls.contains(url)) {
			return false;
		}
		if (url.indexOf(baseToken) != -1){
			//System.out.println("baseToken==>" + baseToken + ", url=" + url);
			return true;
		}
		for(String s: exclusiveUrls){
			if (url.indexOf(s) != -1){
				return false;
			}
		}
		System.out.println("NG------->" + baseToken + ", url=" + url);
		return false; 		
	}

//	private void savevisitedUrls() {
//	try {
//		PrintWriter out = new PrintWriter(new FileWriter("visitedURL.txt"));
//		for(String s :  visitedUrls){
//			out.println(s);
//		}
//		out.close();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//}
}
