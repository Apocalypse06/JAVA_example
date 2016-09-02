package ch09.lab01.solution;
/*
�Ч�g���{���A�ХH��²�䪺�覡�ӧ����e�@
�ӽd�ҬۦP���\��
 */
public class WrapperDemo {
	public static void main(String[] args) {
		Object[] oa = { new Integer(100), new Double(3.14), 
				new Float(10.0F), 	"Kitty", 
				new Object(), new Long(250), 
				new Short("20") 
		};
		double total = 0;
		for (int n = 0; n < oa.length; n++) {
			Object o = oa[n];
			if (o instanceof Number) {
				Number num = (Number) o;
				total += num.doubleValue();
			} 
		}
		System.out.println("�`�M=" + total);
	}
}
