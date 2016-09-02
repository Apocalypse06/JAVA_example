package ch07.lab02.solution;

public class Utility {
	static String DEFAULT_FILE_NAME = "index.jsp" ;  
	public static String getFileName(String sURL) {
		String fileName = null;
		int idx = sURL.lastIndexOf("/") ; 
		if ( idx == -1) {
			return sURL;
		} else if (sURL.lastIndexOf("//") == idx - 1) {
			return DEFAULT_FILE_NAME;
		} else {
			return sURL.substring(idx + 1); 
		}
	} 
}