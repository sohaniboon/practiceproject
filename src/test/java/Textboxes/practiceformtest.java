package Textboxes;

import Pages.Homepage;
import Pages.practiceform;
import common.reports;
import org.testng.annotations.Test;

public class practiceformtest extends reports {
    public Homepage home;
    public practiceform prac;

    @Test(description="verify form test is right")
    public  void TC3(){
        try {
            reports.starttest("verify form test is right");
            home = new Homepage();
            prac = new practiceform();
            home.leftmenu("form");
            prac.practiceform1();
            reports.passtest("pass");
        }catch (Exception e){
            reports.failtest("fail");
        }



    }}
