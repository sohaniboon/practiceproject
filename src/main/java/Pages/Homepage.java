package Pages;

import common.browserini;
import common.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends browserini {

    @FindBy(xpath="//span[text()=\"Text Box\"]")
    WebElement Textbox;

    @FindBy(xpath="//span[text()=\"Radio Button\"]")
    WebElement radiobtn;

    public Homepage(){
        PageFactory.initElements(driver,this);

    }



    public void leftmenu(String a){
        if(a.equalsIgnoreCase("Textbox")){
            Textbox.click();
        } else if (a.equalsIgnoreCase("radiobutton")) {
            utility.scroll(radiobtn);
            radiobtn.click();
        }
    }

}
