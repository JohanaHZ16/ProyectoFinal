package page;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.time.Duration;

public class HomePage  {
    @FindBy(xpath = "//a[@id='menu-toggle']")
    public WebElement menu;

    @FindBy(xpath = "//a[@href='profile.php#login']")
    public WebElement loginOption;

    public HomePage() {
        PageFactory.initElements(Helper.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(10));
    public void selectMenu() {
        waitForElement(menu);
        menu.click();
    }
    

    public void selectLoginOption() {
        waitForElement(loginOption);
        loginOption.click();
    }

    private void waitForElement(WebElement element) {
    WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
