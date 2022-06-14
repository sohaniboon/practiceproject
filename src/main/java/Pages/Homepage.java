package Pages;

import common.browserini;
import common.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends browserini {

    @FindBy(xpath="//span[text()=\"Text Box\"]") WebElement Textbox;
    @FindBy(xpath="//span[text()=\"Radio Button\"]") WebElement radiobtn;
    @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]") WebElement form;
    @FindBy(xpath="//span[text()=\"Practice Form\"]") WebElement practiceform;
   @FindBy(xpath = "(//span[@class=\"pr-1\"])[3]") WebElement alertmenu;
   @FindBy(xpath = "//span[text()=\"Alerts\"]") WebElement alertinmenu;
    @FindBy(xpath="//span[text()=\"Browser Windows\"]") WebElement browserwindow;
    @FindBy(xpath = "(//span[@class=\"pr-1\"])[4]") WebElement widgetmenu;
    @FindBy(xpath = "//span[text()=\"Menu\"]") WebElement menu;

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
        } else if (a.equalsIgnoreCase("Alerts,Frame&Windows")) {
            utility.scroll(alertmenu);
            alertmenu.click();
            alertinmenu.click();
        }else if (a.equalsIgnoreCase("BrowserWindows")){
            utility.scroll(alertmenu);
            alertmenu.click();
            browserwindow.click();
        } else if (a.equalsIgnoreCase("Widgets")) {
            utility.scroll(widgetmenu);
            widgetmenu.click();
            utility.scroll(menu);
            menu.click();
        }
    }

}
