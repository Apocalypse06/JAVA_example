package ch22._03_s2t;
import java.io.*;
import java.util.*;
/*注�?:
  1.?��?此�?式�?，�??��??��?案�?
    (1)c:\\Data\\CharsBank.txt
    (2)d:\\Source.txt
          ?��?案�?data資�?夾�??��??�兩?��?�?
  2.?�Eclipse?��?將本程�??�編碼設?�UTF-8 
*/
public class Sim2Tra {
	Map<String, String> base = new TreeMap<String, String>();
    /**
	   init():?��?字�?c:\\Data\\CharsBank.txt�?��簡�?�??中�?字�??�表�?
	        並建立�???Map?�件:base?�該?��?檔�??��?如�?�?
帼|�?
幂|??
干|�?�?
并|�?�?
广|�?
庄|??
             ?��?String類別?�split()?��?，以'|'?��??�符?��??��??��?子�?串�??�別?�為
     Key?�Value存入Map?�件:base中�?
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
		System.out.println("?��?庫�?�?��筆數:" + count);
	}	
	// convert():?�方法�?行�?�?完�?後�?檔�????�主檔�?+"big5"+"." + ?�副檔�? 
    public void convert(String filePath) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(filePath), "UTF-8"));
    	int pos = filePath.lastIndexOf(".");
    	String outFile = filePath.substring(0, pos) + "BIG5" + filePath.substring(pos);
    	PrintWriter out = new PrintWriter(outFile);
    	String line = "";
    	//?��?�?��簡�?網�?檔�?�??�??轉�?
    	while ((line = br.readLine()) != null) { 
    	   //?��??��??��??��??��?StringBuffer?�件
    	   StringBuffer sb = new StringBuffer(); 
    	   for(int n=0; n< line.length(); n++){  
    		   //依�??�出該�??��?每�?字�?
    		   char ch = line.charAt(n);         
               //字�?轉�??��?�?
    		   String token = String.valueOf(ch);  
    		   // ***********?��?演�?法由此�?�?***********
    		 //將tmp?�內碼由Unicode轉�?UTF-8，傳?��??��??��????byte[]
    		   byte[] b = token.getBytes("UTF-8");
     		// 如�??�度等於3,?�為簡�?字�?UTF-8編碼???��??��???�??字�???
    		   if (b.length == 3) {   
    			   // 要�??��?簡�?字�?以此token(簡�?�??�Key,
    			   // ?�base中�??��??��?(�??�?
    			   String tra =  base.get(token);
    			   // ?�到對�??�正體中??
    			   if (tra != null) {        
    				   //如�??��??��??�正體�?
    				   if (tra.length()==1){ 
    		               sb.append(tra);
    				   } else {
    					   //?��?簡�?字�??��??�正體�???
    					   sb.append("{"+tra+"}");     					   
    				   }
    			   } else {
    				   //sb.append("["+ch+"]");     // ?��??��??��?�??中�?，�?註�??�[]，由人工來�???
    				   sb.append(ch);               // ?��??�接寫出
    			   }
    		   } else {  
    			   // ?�該絕大多數?�ASCII字�??��??�能?�ISO-8859-1
    			   sb.append(ch);
    		   }
    		   // ************?��?演�?法到此為�?************
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
/* 以�?沒�??�到
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
				    //?�裡?�防?��?簡�??�正體�??��??�簡體�?對�??�正體�??��?形�?
					base.put("" + simChar, value + "," + traChar);
					dup++;
				}
			} else {
				// ?��??��?，�?後�??��?(?��?沒�??��?)
			}
		}	
	}
*/
