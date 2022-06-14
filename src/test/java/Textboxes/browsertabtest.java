package Textboxes;

import Pages.Homepage;
import Pages.browserwindowswitch;
import common.reports;
import org.testng.annotations.Test;

public class browsertabtest extends reports {

    public Homepage home;
    public browserwindowswitch tab;


    @Test
    public void TC5(){
        try {
            reports.starttest("check windows handle");
            home = new Homepage();
            tab = new browserwindowswitch();
            home.leftmenu("BrowserWindows");
            tab.Browserwindowswitchpage();
            reports.passtest("pass");
        }catch (Exception e){
            reports.failtest("fail");
        }


    }









}
