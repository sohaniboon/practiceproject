package Textboxes;

import Pages.Homepage;
import Pages.practiceform;
import common.browserini;
import org.testng.annotations.Test;

public class practiceformtest extends browserini {
    public Homepage home;
    public practiceform prac;

    @Test
    public  void TC3(){
        home =new Homepage();
        prac =new practiceform();
        home.leftmenu("form");
        prac.practiceform1();




    }}
