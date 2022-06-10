package Textboxes;

import Pages.Homepage;
import Pages.Radiobuttons;
import common.browserini;
import org.testng.annotations.Test;

public class Radiobuttontest extends browserini {
   public Homepage home;
   public Radiobuttons rdbtn;
    @Test(enabled = false)
    public void TC2(){
        home=new Homepage();
       rdbtn=new Radiobuttons();
        home.leftmenu("radiobutton");
        rdbtn.radiotest();
    }


}
