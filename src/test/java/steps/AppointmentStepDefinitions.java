package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import page.AppointmentPage;
import page.HomePage;
import page.LoginPage;
import utils.Helper;

import java.util.List;

public class AppointmentStepDefinitions {
         HomePage homepage = new HomePage();
         LoginPage loginpage = new LoginPage();
         AppointmentPage appointmentpage = new AppointmentPage();

    @Given("que el usuario se loguea con su usuario y contraseña")
    public void enterApplication(){
        Helper.openPage();
        homepage.selectMenu();
        homepage.selectLoginOption();
        loginpage.enterLogin();

    }

    @Y("usuario genera la cita seleccionando los datos correspondientes")
    public void usuarioGeneraLaCitaSeleccionandoLosDatosCorrespondientes() {
       appointmentpage.makeAppointment();
    }
    @Entonces("valido que se genero la cita correctamente")
    public void validoQueSeGeneroLaCitaCorrectamente( ) {
        appointmentpage.appointmentConfirmation();
    }
}
