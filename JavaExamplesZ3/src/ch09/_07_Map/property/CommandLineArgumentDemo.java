package ch09._07_Map.property;

public class CommandLineArgumentDemo {
	// ���{���ܽd�R�O�C�Ѽ�
	// MM->Run->Run Configurations->Arguments
	// java -classpath c:\temp ch09._07_Map.property.CommandLineArgumentDemo Mary John "Bill Clinton"
	public static void main(String[] args) {
		
		System.out.println("���{����" + args.length + "�өR�O�C");
		
		for (int n = 0; n < args.length; n++) {
			System.out.println(args[n]);
		}

	}

}
