package Textboxes;

import Pages.Homepage;
import Pages.Textbox;
import common.browserini;
import org.testng.annotations.Test;

public class Textboxtest1 extends browserini {

    public Homepage home;
    public Textbox t;
    @Test(enabled = false)
    public void TC1(){
        home=new Homepage();
        home.leftmenu("Textbox");
        t=new Textbox();
        t.text();


    }


}
