package Pages;

import common.browserini;
import common.commonfunction;
import common.reports;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class browserwindowswitch extends browserini {
    @FindBy(xpath = "//button[@id=\"tabButton\"]") WebElement tabbtn;

    public browserwindowswitch(){
        PageFactory.initElements(driver,this);

    }
    public void Browserwindowswitchpage(){
        if(tabbtn.isDisplayed()){
            tabbtn.click();
           String u=driver.getWindowHandle();
           commonfunction.browsertab(u);
            reports.passtest("test is pass");
        }else {
            reports.failtest("test is fail");
        }
    }


}
