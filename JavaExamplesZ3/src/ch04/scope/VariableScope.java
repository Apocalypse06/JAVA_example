package ch04.scope;

public class VariableScope {
	public static void main(String[] args) {
		int x = 0;
		{
			int y = 0;
			{
				int z = 100;
				{
					// �o�̤���A�w�q�ܼ� x, y, z
					int a = 10;
					System.out.println(x + y + z + a); // OK
				}
				// �o�̤���ϥ��ܼ�a

			}
			// �o�̤���ϥ��ܼ�z

		}
		// �o�̤���ϥ��ܼ�y
	}
}
