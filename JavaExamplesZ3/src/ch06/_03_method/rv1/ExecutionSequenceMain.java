package ch06._03_method.rv1;

public class ExecutionSequenceMain {

	public static void main(String[] args) {
        ExecutionSequence es = new ExecutionSequence();
        int [] ans = es.sum_factorial();
        if (ans[0] < 0) {
        	System.out.println("�t�Ƥ��p������ƾ�:" + ans[0]) ;
        } else {
        	System.out.println("1�[��" + ans[0] +  "���`�M��:" + ans[1]  
        			+ ", "+ ans[0] +"��������:" + ans[2]) ;
        }
	}
}
