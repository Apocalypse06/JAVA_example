package ch06._03_method.rv1;

public class ExecutionSequence {
	// ����k�|���ͤ@��-7��+7���H����ƶü�num�A�M��p��
	// 1+2+..+num(�`�M)�P1*2*..*num(����)
	// �ѩ�t�ƨS�������A�]���p�G�ü�num�p��s�A���p���`�M�P����
	// �p�G�ü�num����s�A�`�M��s�A������1�C
	// �p�G�ü�num�j��s�A�p��1+2+...+num���`�M�Pnum�������C
    public int[] sum_factorial() {
    	// �}�C���Ĥ@�Ӥ����N�s��ü�num,
    	// �}�C���ĤG�Ӥ����N�s���`�M, 
    	// �}�C���ĤT�Ӥ����N�s�񶥭��C    	
    	int[] result = new int[3];    
    	int num = (int)(Math.random() * 15) - 7; // ���ͤ@��-7��+7���H����ƶü�  
    	if (num < 0) { // �t�ƨS������
    		result[0] = num;  
    		return result;    // ���榹�ԭz��A����k���Ѿl���ԭz�N���|�A����A
    	}                     // �{�������涶�ǱN�^���I�s�ԭz�C
    	if (num == 0) {
    		result[0] = 0; 
    		result[1] = 0;
    		result[2] = 1;
    		return result;
    	} else {
    		int sum  = 0;
    		int prod = 1;
    		for (int n=1; n <= num; n++) {
    			sum  += n;
    			prod *= n;
    		}
    		result[0] = num ;
    		result[1] = sum;
    		result[2] = prod;
    		return result;
    	} 
    }  
}
