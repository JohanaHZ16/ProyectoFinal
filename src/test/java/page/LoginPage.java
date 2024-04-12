package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.time.Duration;

public class LoginPage {
    @FindBy(xpath = "//div[@class='container']")
    public WebElement container;
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
        waitForElement(container);
      username.sendKeys("John Doe");
      password.sendKeys("ThisIsNotAPassword");
      loginButton.click();

    }

    private void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
