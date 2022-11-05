package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

	public static String getConfigValue(String key) {
		Properties pro = new Properties();
		File file = new File("config.properties");
		
		try {
			FileInputStream fileInput = new FileInputStream(file);
			pro.load(fileInput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String value = pro.get(key).toString();
		return value;
	}
}
