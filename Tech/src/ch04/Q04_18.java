package ch04;
/*
Q04_18.寫一個程式，它能印出字串 "金黃色、淺綠色、藍色、橙色，色色分明"中，
                所有『色』出現的位置。(提示，利用String類別的indexOf方法)

 */
public class Q04_18 {
	public static void main(String[] args) {
		String s = "金黃色、淺綠色、藍色、橙色，色色分明";
        char c = '色';
        int x = 0;                             //迴圈用紀錄字元位置
// 解法一:
        int idx = -1;
        while (true){
        	idx = s.indexOf("色", idx+1);  // 由某個位置(idx+1)開始往後找
        	if (idx == -1){  // 表示沒有"色"了
        		break;
        	}
        	System.out.println(idx + " " + s.charAt(idx));
        }
// 解法二:        
//        System.out.print("字串中所有色出現之位置:");
//        for(x=0;x<s.length();x++){           //字串內每一個字去分析
//        	if(c==s.charAt(x)){              //發現有"色"時
//        		System.out.print(x+" ");     //印出位置
//        	}
//        }
	}
}
