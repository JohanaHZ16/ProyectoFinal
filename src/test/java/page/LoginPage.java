package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Helper;

import java.time.Duration;

public class LoginPage {
    @FindBy(xpath = "//input[@id='txt-username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='txt-password']")
    public WebElement password;

    @FindBy(id="btn-login")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(Helper.getDriver(), this);
    }

    public void enterLogin(){
      username.sendKeys("John Doe");
      password.sendKeys("ThisIsNotAPassword");
      loginButton.click();

    }

}
