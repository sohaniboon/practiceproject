package common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;

public class commonfunction extends browserini{


    public static void select(WebElement c,String d){
        Select s=new Select(c);
        s.selectByVisibleText(d);
    }



public static void alertcommon(String q){
        Alert alt=driver.switchTo().alert();
        if(q.equalsIgnoreCase("ok")){
            alt.accept();
        }else if(q.equalsIgnoreCase("cancel")){
            alt.dismiss();
        }else{
            alt.getText();
        }
}

public static void browsertab(String y){
        Set<String> handle=driver.getWindowHandles();
    Iterator itr=handle.iterator();
    while(itr.hasNext()){
        String b=itr.next().toString();
        if(y.equalsIgnoreCase(b)){
            driver.switchTo().window(y);
        }
    }
}

/*public static void actions(String g,WebElement z){
        Actions act=new Actions(driver);
        if(g.equalsIgnoreCase("click")){
            act.click().perform();
        }if (g.equalsIgnoreCase("clickandhold")){
            act.clickAndHold().perform();
        }if (g.equalsIgnoreCase("doubleclick")){
            act.doubleClick();
        }if(g.equalsIgnoreCase("movetoelement")){
            act.moveToElement(z);
        }if(g.equalsIgnoreCase("clickandhold")){
            act.clickAndHold();
    }
}*/


}
