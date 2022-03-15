package Utilities;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class DynamicTestRunner extends ExcelUtil{

	ExcelUtil testng = new ExcelUtil();
	public static Map<String,String> map;


	@Test
	public void Testng() throws IOException
	{
		map = new HashMap<String,String>();
		map.put("strbrowser","chrome");
		map.put("url","https://uatcms.dubaitrade.ae");
		map.put("path", "D:\\POMPracticeTestData.xlsx");
		map.put("Sheetname", "TestData");

		List<String> arr = testng.readExcel(map.get("path"),map.get("Sheetname"));

		int size = arr.size();

		TestNG testng = new TestNG();
		//creating xmlSuite
		XmlSuite xmlsuite = new XmlSuite();
		//adding xmlsuite name
		xmlsuite.setName("POMTestSuite");

		//creating xml test
		XmlTest xmltest = new XmlTest(xmlsuite);
		//adding xmltest
		xmltest.setName("POMTestCase");
		//adding parameters
		xmltest.setParameters(map);

		//creating list of classes
		List<XmlClass> xmlclass = new ArrayList<XmlClass>();
		for(int i=0;i<=size-1;i++) {

			xmlclass.add(new XmlClass("com.dc.rns.qa.TestCase."+arr.get(i)));
			System.out.println(xmlclass);
		}
 
		System.out.println(xmlclass);
		//xmlclass.add(new XmlClass("com.dc.qa.RestAPI.getListUsers"));
		xmltest.setClasses(xmlclass);
		List<XmlSuite> suits = new ArrayList<>();
		suits.add(xmlsuite);
		testng.setXmlSuites(suits);
		testng.run();
	}
}



