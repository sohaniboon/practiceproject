package Pages;

import common.browserini;
import common.commonfunction;
import common.reports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alertpopup extends browserini {

@FindBy(id="confirmButton") WebElement alertclick;

public alertpopup(){
    PageFactory.initElements(driver,this);
}
public void alertpage(){
    if(alertclick.isDisplayed()) {
        alertclick.click();
        commonfunction.alertcommon("ok");
        reports.passtest("pass");
    }else{
        reports.failtest("fail");
    }
}





}
