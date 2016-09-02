package ch22._03_s2t;
import java.io.*;
import java.util.*;
/*æ³¨æ?:
  1.?·è?æ­¤ç?å¼æ?ï¼Œè??‰ä??—æ?æ¡ˆï?
    (1)c:\\Data\\CharsBank.txt
    (2)d:\\Source.txt
          ?¬å?æ¡ˆç?dataè³‡æ?å¤¾é??‰ä??—å…©?‹æ?æ¡?
  2.?¨Eclipse?§è?å°‡æœ¬ç¨‹å??„ç·¨ç¢¼è¨­?UTF-8 
*/
public class Sim2Tra {
	Map<String, String> base = new TreeMap<String, String>();
    /**
	   init():?±æ?å­—æ?c:\\Data\\CharsBank.txtè®?…¥ç°¡ã?æ­??ä¸­æ?å­—å??§è¡¨ï¼?
	        ä¸¦å»ºç«‹ä???Map?©ä»¶:base?‚è©²?‡å?æª”ç??¼å?å¦‚ä?ï¼?
å¸¼|å¹?
å¹‚|??
å¹²|ä¹?å¹?
å¹¶|ä¸?ä½?
å¹¿|å»?
åº„|??
             ?é?Stringé¡åˆ¥?„split()?¹æ?ï¼Œä»¥'|'?ºå??Œç¬¦?Ÿï??‡æ??©å?å­å?ä¸²ï??†åˆ¥?šç‚º
     Key?‡Valueå­˜å…¥Map?©ä»¶:baseä¸­ã?
    */
	private void init() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("c:\\Data\\CharsBank.txt"), "UTF-8"));
		String line = null;

		int count = 0;
		int dup = 0;
		while ((line = br.readLine()) != null) {
			count++;
			String[] sa = line.split("\\|");
			String simChar = sa[0];
			String traChar = sa[1];
			base.put(simChar, traChar);  
		}
		System.out.println("?±å?åº«æ?è®?…¥ç­†æ•¸:" + count);
	}	
	// convert():?¬æ–¹æ³•é?è¡Œè?ç¢?å®Œæ?å¾Œç?æª”å????Ÿä¸»æª”å?+"big5"+"." + ?Ÿå‰¯æª”å? 
    public void convert(String filePath) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(filePath), "UTF-8"));
    	int pos = filePath.lastIndexOf(".");
    	String outFile = filePath.substring(0, pos) + "BIG5" + filePath.substring(pos);
    	PrintWriter out = new PrintWriter(outFile);
    	String line = "";
    	//?è?è®?…¥ç°¡é?ç¶²é?æª”ï?ä¸??ä¸??è½‰æ?
    	while ((line = br.readLine()) != null) { 
    	   //?ˆæ??™å??¾è??›ç??œç?StringBuffer?©ä»¶
    	   StringBuffer sb = new StringBuffer(); 
    	   for(int n=0; n< line.length(); n++){  
    		   //ä¾å??–å‡ºè©²è??§ç?æ¯å?å­—å?
    		   char ch = line.charAt(n);         
               //å­—å?è½‰æ??ºå?ä¸?
    		   String token = String.valueOf(ch);  
    		   // ***********?¸å?æ¼”ç?æ³•ç”±æ­¤é?å§?***********
    		 //å°‡tmp?„å…§ç¢¼ç”±Unicodeè½‰æ?UTF-8ï¼Œå‚³?å??ºä??ƒç????byte[]
    		   byte[] b = token.getBytes("UTF-8");
     		// å¦‚æ??·åº¦ç­‰æ–¼3,? ç‚ºç°¡é?å­—ç?UTF-8ç·¨ç¢¼???‹ä??ƒç???æ­??å­—ä???
    		   if (b.length == 3) {   
    			   // è¦è??†ç?ç°¡é?å­—ï?ä»¥æ­¤token(ç°¡é?å­??ºKey,
    			   // ?°baseä¸­å??¾å??‰ç?(æ­??å­?
    			   String tra =  base.get(token);
    			   // ?¾åˆ°å°æ??„æ­£é«”ä¸­??
    			   if (tra != null) {        
    				   //å¦‚æ??ªå??‰ä??‹æ­£é«”å?
    				   if (tra.length()==1){ 
    		               sb.append(tra);
    				   } else {
    					   //?ä?ç°¡é?å­—å??‰å??‹æ­£é«”å???
    					   sb.append("{"+tra+"}");     					   
    				   }
    			   } else {
    				   //sb.append("["+ch+"]");     // ?¾ä??°å??‰ç?æ­??ä¸­æ?ï¼Œå?è¨»è??Ÿ[]ï¼Œç”±äººå·¥ä¾†è???
    				   sb.append(ch);               // ?–è??´æ¥å¯«å‡º
    			   }
    		   } else {  
    			   // ?‰è©²çµ•å¤§å¤šæ•¸?ºASCIIå­—å??‚ä??¯èƒ½?‰ISO-8859-1
    			   sb.append(ch);
    		   }
    		   // ************?¸å?æ¼”ç?æ³•åˆ°æ­¤ç‚ºæ­?************
    	   }
    	   out.println(sb.toString());
    	   
    	}
    	out.close();
    }
	public static void main(String[] args) throws IOException {
		Sim2Tra st = new Sim2Tra();
		st.init();
		st.convert("c:\\data\\Source.txt");
	}

//	private void writeTo(String outFile) throws IOException {
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(
//				new FileOutputStream(outFile), "UTF-8"));
//		Set<Map.Entry<String, String>> set = base.entrySet();
//		for(Map.Entry<String, String> me: set){
//			String k = me.getKey();
//			String v = me.getValue();
//			out.println(k+"|" + v);
//		}
//		out.close();
//	}	
}
/* ä»¥ä?æ²’æ??¨åˆ°
public void listCharacterBase() {
		Set<String> set = base.keySet();
		for (String key : set) {
			System.out.println("key=" + key + " value=" + base.get(key));
		}
	}
private void init() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("c:\\Data\\TraSimZh.txt"), "UTF-8"));
		String line = null;

		int count = 0;
		int dup = 0;
		while ((line = br.readLine()) != null) {
			count++;
			if (line.length() == 28) {
				char traChar = line.charAt(11);
				char simChar = line.charAt(22);
				String value = base.get("" + simChar);
				if (value == null) {
					base.put("" + simChar, "" + traChar);
				} else {
				    //?™è£¡?é˜²?•ç?ç°¡é??‡æ­£é«”æ??‰ä??‹ç°¡é«”å?å°å??‹æ­£é«”å??„æ?å½¢ã?
					base.put("" + simChar, value + "," + traChar);
					dup++;
				}
			} else {
				// ?‰å??‹å?ï¼Œæ?å¾Œå??•ç?(?®å?æ²’æ??•ç?)
			}
		}	
	}
*/
