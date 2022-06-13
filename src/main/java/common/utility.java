package common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utility extends reports{


    public static void scroll(WebElement element){
        JavascriptExecutor j= (JavascriptExecutor)driver;
        j.executeScript("arguments[0].scrollIntoView();",element);

    }

    public static void scroll1(){
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");

    }

    public static String capturescreen(){
        String datename =new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot scrshot= ((TakesScreenshot) driver);
        File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
        String destinationpath=filepath+"/"+datename+".png";
        File destfile =new File(destinationpath);
        try{
            FileUtils.copyFile(srcfile,destfile);
        }catch (Exception e){
            e.printStackTrace();
        }
return datename+"png";


    }




}
