package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin 
{
  public static WebDriver rdriver;
  public AdactinLogin(WebDriver ldriver)
  {
	  rdriver=ldriver;  //this.driver=driver;
	  PageFactory.initElements(ldriver,this);
  }
  @FindBy(id="username")
  WebElement user;
  @FindBy(id="password")
  WebElement pwd;
  @FindBy(id="login")
  WebElement login;
  
  public void SetUsername()
  {
	  user.sendKeys("BhavanaReddy");
  }
  public void SetPassword()
  {
	  pwd.sendKeys("Bhavana@4");
  }
  public void ClickLogin()
  {
	  login.click();
  }
}
