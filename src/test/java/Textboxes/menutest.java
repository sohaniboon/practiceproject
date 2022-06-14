package Textboxes;

import Pages.Homepage;
import Pages.menupage;
import common.reports;
import org.testng.annotations.Test;

public class menutest extends reports {
    public Homepage home;
    public menupage men;

    @Test
    public void TC6(){
        home =new Homepage();
        men=new menupage();
        home.leftmenu("Widgets");
        men.mainmenupage();
    }



}
