package Textboxes;

import Pages.Homepage;
import Pages.practiceform;
import com.sun.org.glassfish.gmbal.Description;
import common.browserini;
import common.reports;
import org.testng.annotations.Test;

public class practiceformtest extends reports {
    public Homepage home;
    public practiceform prac;

    @Test(description="verify form test is right")
    public  void TC3(){
        report.startTest("verify form test is right");
        home =new Homepage();
        prac =new practiceform();
        home.leftmenu("form");
        prac.practiceform1();




    }}
