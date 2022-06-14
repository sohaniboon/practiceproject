package Pages;

import common.browserini;
import common.commonfunction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class menupage extends browserini {
    @FindBy(xpath = "//a[text()=\"Main Item 2\"]") WebElement mainitem2;

public menupage(){
    PageFactory.initElements(driver,this);
}
public void mainmenupage(){
  Actions act=new Actions(driver);
  act.clickAndHold(mainitem2).perform();
}

}
