package Textboxes;

import Pages.Homepage;
import Pages.Textbox;
import common.browserini;
import common.commonfunction;
import common.reports;
import org.testng.annotations.Test;

public class Textboxtest1 extends reports {

    public Homepage home;
    public Textbox t;
    @Test(enabled = true)
    public void TC1(){

        reports.starttest("textboxtest");
            home = new Homepage();
            home.leftmenu("Textbox");
            t = new Textbox();
            t.text();

    }


}
