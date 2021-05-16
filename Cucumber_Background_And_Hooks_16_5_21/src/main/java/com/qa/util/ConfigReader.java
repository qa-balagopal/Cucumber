package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	//encapsulation
	public Properties initi_prop() {
		prop=new Properties();
		
		try {
	        String path = System.getProperty("user.dir");
			FileInputStream ip =new FileInputStream(path+"\\src\\test\\resources\\config\\config.properties");
            prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
