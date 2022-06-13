package common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.Date;

public class reports extends browserini {
    @BeforeTest(alwaysRun = true)
    public static void report  (){
       Date date = new Date();
       String time = date.toString().replace(":","-");
        File file=new File("result/"+time);
        file.mkdir();
        filepath =file.getPath();
        report =new ExtentReports(file.getPath()+"/result.html",true);

    }
  public static void starttest(String testcase){
        test = report.startTest(testcase);
  }

public static void passtest(String pass){
        test.log(LogStatus.PASS,pass);

}
public static void failtest(String fail){
        test.log(LogStatus.FAIL,fail,test.addScreenCapture(utility.capturescreen()));
}
@AfterTest(alwaysRun = true)
public static void endtest(){
        report.endTest(test);
    report.flush();
}
}
