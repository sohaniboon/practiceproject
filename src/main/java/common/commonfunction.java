package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonfunction extends browserini{


    public static void select(WebElement c,String d){
        Select s=new Select(c);
        s.selectByVisibleText(d);
    }



      public static void explicit(){
          WebDriverWait wait=new WebDriverWait(driver,5);
    }
}
