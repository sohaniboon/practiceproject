package Pages;

import common.browserini;
import common.utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radiobuttons extends browserini {

   @FindBy(xpath="//label[@for='yesRadio']")
    WebElement yes;

   @FindBy(xpath="//input[@id=\"noRadio\"]")
   WebElement no;
public Radiobuttons(){
    PageFactory.initElements(driver,this);

}

   public void radiotest(){
    String r=driver.getCurrentUrl();
    if(r.equalsIgnoreCase(property.getProperty("radiobtnurl"))){
        if (yes.isEnabled()){
            yes.click();
        }
        if(no.isEnabled()){
            no.click();
        }else {
            System.out.println("not enabled");
        }
    }


    }





}
