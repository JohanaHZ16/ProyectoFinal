package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.time.Duration;

import static utils.Helper.driver;
import static utils.Helper.waitForElement;


public class AppointmentPage {
    @FindBy(xpath = "//section[@class='section bg-primary']")
    public WebElement sectionAppointment;

    @FindBy(id = "txt_visit_date")
    public WebElement datetxt;

    @FindBy(id = "txt_comment")
    public WebElement comentariotxt;

    @FindBy(id = "btn-book-appointment")
    public WebElement appointmentButton;

    @FindBy(xpath = "//p[@class='lead']")
    public WebElement confirmacion;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    public WebElement homeButton;

    @FindBy(id = "radio_program_medicaid")
    public WebElement program;

    public AppointmentPage() {
        PageFactory.initElements(Helper.getDriver(), this);
    }



    public void makeAppointment() {
        waitForElement(sectionAppointment);
        Select facility =new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByValue("Seoul CURA Healthcare Center");
        program.click();
        datetxt.sendKeys("25/04/2024");
        comentariotxt.sendKeys("Lectura de examenes de Sangre");
        appointmentButton.click();

    }

    public void appointmentConfirmation(){
        waitForElement(confirmacion);
        confirmacion.getText().equals("Please be informed that your appointment has been booked as following:");
        homeButton.click();
    }


}
