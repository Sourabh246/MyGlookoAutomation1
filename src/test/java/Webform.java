import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Webform extends PageObject {


    private final String USERNAME = "sourabh.sharma+mh@glooko.com";
    private final String PASSWORD = "tester1!";

    @FindBy(id = "user_email")
    private WebElement user_name;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(xpath = "//input[@id=“sign-in-button”]")
    private WebElement login_button;

    //@FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
   // private WebElement alertSuccess;

    public Webform(WebDriver driver) {
        super(driver);
    }



    public void enteruserId(){
        this.user_name.sendKeys(USERNAME);
    }

    public void enterpassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressLoginButton(){
        this.login_button.click();
    }

   // public void verifyAlertSuccess(){
     //   this.alertSuccess.isDisplayed();
   // }
}

