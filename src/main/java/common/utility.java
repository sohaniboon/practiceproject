package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class utility extends browserini{


    public static void scroll(WebElement element){
        JavascriptExecutor j= (JavascriptExecutor)driver;
        j.executeScript("arguments[0].scrollIntoView();",element);

    }



}
