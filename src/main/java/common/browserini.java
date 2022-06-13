package common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class browserini {
    public static WebDriver driver;
    public static Properties property;
    public static String filepath;
    public static ExtentReports report;
    public static ExtentTest test;

    public void readproperty(){
        try{
            property = new Properties();
            property.load(new FileInputStream("C:\\Users\\iBoon Technologies\\IdeaProjects\\practiceproject\\src\\main\\resources\\config.properties"));



        }catch (IOException e){
            System.out.println("browser does not launched");
        }


    }

    @BeforeSuite
    public void browserstart(){
        readproperty();
        String browsername= property.getProperty("browser");
        if(browsername.equalsIgnoreCase("edge")){
             System.setProperty("webdriver.edge.driver","C:\\Users\\iBoon Technologies\\IdeaProjects\\practiceproject\\src\\main\\resources\\msedgedriver.exe");
            driver =new EdgeDriver();
            driver.manage().window().maximize();

        }else{

            System.setProperty("webdriver.chrome.driver","C:\\Users\\iBoon Technologies\\IdeaProjects\\practiceproject\\src\\main\\resources\\chromedriver.exe");
        driver =new ChromeDriver();
            driver.manage().window().maximize();
        }


        driver.get(property.getProperty("url"));

    }

//@AfterSuite
public void quit(){
        driver.quit();
}


}
