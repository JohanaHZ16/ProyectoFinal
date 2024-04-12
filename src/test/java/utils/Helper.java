package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    public static Helper helper;
    public static WebDriver driver;

    public Helper(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void openPage(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setUp(){
        helper = new Helper();
    }

    public static void tearDown(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
