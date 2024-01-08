package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class AdactinLoginBase_Class 
{
	 public static WebDriver driver;
	 @BeforeClass
	 @Parameters({"browser","url"})
	 public void openapplication(String br,String url)
	 {
		 if(br.equals("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
	     else if(br.equals("edge")) 
	     {
	         driver=new EdgeDriver();
	     }
		 driver.get(url);
	 }
	 @AfterClass
	 public void closeApplication() 
	 {
		 driver.close();
	 }

}
