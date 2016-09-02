package ch04.lab03.solution;

// 絤策ヘ秆if痹瓃ノ猭
// 玻ネざ110繦诀睹计赣睹计
// 狦赣睹计案计玥"计案计"玥"计计"

public class ProgramCh04Lab03 {
    public static void main(String[] args) {
    	int n = (int)(Math.random() * 10) + 1 ;
    	System.out.println("繦诀睹计:" + n);
    	if (n % 2 == 0) {
    		System.out.println("计案计");
    	} else {
    		System.out.println("计计");
    	}
    }
}
