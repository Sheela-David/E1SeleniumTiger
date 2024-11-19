package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataDrivenFromProperties {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\frame handling\\testData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("url");
		System.out.println(value);

	}

}
