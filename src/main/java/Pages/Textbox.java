package Pages;

import common.browserini;
import common.utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Textbox extends browserini {
    @FindBy(id="userName")
    WebElement fullname;

    @FindBy(id="userEmail")
    WebElement Mail;

    @FindBy(id="permanentAddress")
     WebElement Address;


  public Textbox(){
      PageFactory.initElements(driver,this);

  }
   public  void text(){
      String s=driver.getCurrentUrl();
      if(s.equalsIgnoreCase(property.getProperty("texturl"))) {


          fullname.sendKeys("sohan");
          Mail.sendKeys("sar@gmail.com");
          utility.scroll(Address);
          Address.sendKeys("abcd");
      }
   }
}