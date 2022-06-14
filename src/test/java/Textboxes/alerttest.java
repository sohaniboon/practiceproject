package Textboxes;

import Pages.Homepage;
import Pages.alertpopup;
import common.reports;
import org.testng.annotations.Test;

public class alerttest extends reports {
    public alertpopup al;
    public Homepage home;

    @Test
    public void Tc4() {
        try {
            reports.starttest("alert test");
            al = new alertpopup();
            home = new Homepage();
            home.leftmenu("Alerts,Frame&Windows");
            al.alertpage();
            reports.passtest("pass");
        }catch(Exception e){
            reports.failtest("fail");
        }
    }
}
