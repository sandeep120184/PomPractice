package com.dc.rns.qa.TestCase;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportFactory {


	public static ExtentHtmlReporter htmlReporter;
	public  ExtentReports reports;
	public  ExtentTest test;


    @BeforeSuite
    public  void setup(){

		//creating date in a specfic date format
		String timestamp = new SimpleDateFormat("dd.mm.yyyy").format(new Date());


		//	Extent html Reporter -  creating report folder & defining path to save the report
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\INS_AUTOMATION\\INS_Reports"+timestamp+"\\Initiate_Inspection"+".html");

		//setting configuration in htmlreport
		htmlReporter.config().setDocumentTitle("Inspection Automation Test Execution Report");
		htmlReporter.config().setTheme(Theme.DARK);

		// initializing Extent Reports	
		reports = new ExtentReports();

		// attaching configuration in report
		reports.attachReporter(htmlReporter);
		// adding customized information in report 
		reports.setSystemInfo("Environment", "UAT1");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Host", "Local Host");
		reports.setSystemInfo("Tester Name", "Sandeep");
		reports.setSystemInfo("OS", "Windows 7");
		
		
	}


	
}
