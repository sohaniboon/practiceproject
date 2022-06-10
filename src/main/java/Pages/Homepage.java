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

    @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]")
    WebElement form;

    @FindBy(xpath="//span[text()=\"Practice Form\"]")
    WebElement practiceform;

    public Homepage(){
        PageFactory.initElements(driver,this);

    }



    public void leftmenu(String a){
        if(a.equalsIgnoreCase("Textbox")){
            Textbox.click();
        } else if (a.equalsIgnoreCase("radiobutton")) {
            utility.scroll(radiobtn);
            radiobtn.click();
        } else if (a.equalsIgnoreCase("form")) {
            utility.scroll(form);
           form.click();
           practiceform.click();
        }
    }

}
