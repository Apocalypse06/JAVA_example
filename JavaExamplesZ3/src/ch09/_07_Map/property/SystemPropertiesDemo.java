package ch09._07_Map.property;
import java.util.Enumeration;
import java.util.Properties;
public class SystemPropertiesDemo {
	public static void main(String[] args) {
	    Properties prop = System.getProperties();
		Enumeration<String> en  = (Enumeration<String>) prop.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			System.out.println(key + "-->" + prop.getProperty(key));
		}
		System.out.println("-------------");
		System.out.println("�d�߯S�w�������ܼ�: user.dir=" +  System.getProperty("user.dir"));
		System.out.println("�d�߯S�w�������ܼ�: user.dirA=" +  System.getProperty("user.dirA","�L���ܼ�"));
	}
}
