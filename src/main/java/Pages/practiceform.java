package Pages;


import common.commonfunction;
import common.reports;
import common.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class practiceform extends reports {

    @FindBy(id = "firstName")
    WebElement firstname;
    @FindBy(id = "lastName")
    WebElement lastname;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(xpath = "//label[@for=\"gender-radio-1\"]")
    WebElement male;
    @FindBy(id = "userNumber")
    WebElement usernumber;
    @FindBy(id = "dateOfBirthInput")
    WebElement date;
    @FindBy(xpath = "//select[@class=\"react-datepicker__month-select\"]")
    WebElement month;
    @FindBy(xpath = "//select[@class=\"react-datepicker__year-select\"]")
    WebElement year;
    @FindBy(xpath = "//div[@aria-label=\"Choose Thursday, February 13th, 1997\"]")
    WebElement day;
    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-1\"]")
    WebElement hobbies;
    @FindBy(id = "currentAddress")
    WebElement address;
    @FindBy(xpath = "//input[@id=\"uploadPicture\"]")
    WebElement upload;
    @FindBy(id = "submit")
    WebElement submitbtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")
    WebElement alert;


    public practiceform() {

        PageFactory.initElements(driver, this);
    }

    public void practiceform1() {

            String p = driver.getCurrentUrl();
            if (p.equalsIgnoreCase(property.getProperty("practiceformurl"))) {
                if (firstname.isDisplayed()) {
                    firstname.sendKeys("Sohan");
                }

                if (lastname.isDisplayed()) {
                    lastname.sendKeys("Sarode");

                }
                if (email.isDisplayed()) {
                    email.sendKeys("sohan.iboon@gmail.com");

                }
                utility.scroll(male);
                if (male.isEnabled()) {
                    male.click();

                }
                utility.scroll(usernumber);
                if (usernumber.isDisplayed()) {
                    usernumber.sendKeys("1234567890");

                }

                if (date.isDisplayed()) {
                    date.click();
                    month.click();
                    commonfunction.select(month, "February");
                    year.click();
                    commonfunction.select(year, "1997");
                    day.click();

                }

                utility.scroll(hobbies);
                if (hobbies.isEnabled()) {
                    hobbies.click();


                }
                utility.scroll(address);
                if (address.isDisplayed()) {
                    address.sendKeys("okokokok");
                }
                if (upload.isDisplayed()) {
                    upload.sendKeys("C:\\Users\\iBoon Technologies\\Pictures\\Screenshots");
                }


                if (alert.isDisplayed()) {
                    alert.click();
                }


                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                utility.scroll(submitbtn);
                if (submitbtn.isDisplayed()) {
                    utility.scroll1();
                    submitbtn.click();
                }
              reports.passtest("pass");
            }else{
                reports.failtest("test fail");
            }







    }

}



