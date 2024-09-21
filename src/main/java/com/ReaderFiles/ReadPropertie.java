package com.ReaderFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertie {

	FileInputStream input;
	
	private Properties getData() {
		File file = new File("\\Arunkumar\\Eclipse_Learning\\practiceSelenium\\src\\main\\java\\TestData.properties");
		
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pro = new Properties();
		try {
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;
	}
	
	public String getBrowserName()
	{
		String broswerName = getData().getProperty("browserName");
		return broswerName;
	}

}
