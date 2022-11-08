package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {

	/**
	 * This class will read data from property file for the key and return the value
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathInterface.filePath);
		Properties pLib=new Properties();
		pLib.load(fis);
		String value = pLib.getProperty(key);
		return value;
	}

}

