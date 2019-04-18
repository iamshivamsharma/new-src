package com.TestSetup;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;

import testUtil.ConfigProperties;

public class TestSetup {
	
	public ConfigProperties configproperties=null;
	//public ExcelReader excelReader=new Excelreader(System.getProperties());
	//protected static ExtentReports extent;
	protected static ThreadLocal<ExtentTest> classlevellogger=new ThreadLocal<ExtentTest>();
	protected static ThreadLocal<ExtentTest> Testlevellogger=new ThreadLocal<ExtentTest>();
	
	@BeforeSuite
	public void setup() {
		ConfigFactory.setProperty("environment","dev");
		
	}

}
