package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtility {
	
	public String getDataFromPropertiesFile(String key) throws Exception {
		
		FileInputStream fis = new FileInputStream(IPathConstant.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
				
	}

}
