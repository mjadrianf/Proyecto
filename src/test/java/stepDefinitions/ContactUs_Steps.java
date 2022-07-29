package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;
import utils.Global_Vars;

import static driver.DriverFactory.getDriver;

public class ContactUs_Steps extends Base_PO {
    ContactUs_PO contactUs = new ContactUs_PO();

    @Given("Yo acceso al formulario de Contact Us")
    public void yo_acceso_al_formulario_de_contact_us() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE + "/Contact-Us/contactus.html");
    }
    @When("Ingreso el nombre de {string}")
    public void ingreso_el_nombre_de(String string) {contactUs.setFirstName(string);}
    @And("Ingreso el apellido de {string}")
    public void ingreso_el_apellido_de(String string) {contactUs.setLastName(string);}
    @And("Ingreso el comentario de {string}")
    public void ingreso_el_comentario_de(String string) {
     contactUs.setComment(string);
    }
    @And("Ingreso el email de {string}")
    public void ingreso_el_email_de(String string) {
       contactUs.setEmailAddress(string);
    }
    @And("Hago Click en el boton submit")
    public void hago_click_en_el_boton_submit() {
      contactUs.clickOn_Submit_Button();
    }
    @Then("Yo espero que se prensente un mensaje de exito")
    public void yo_espero_que_se_prensente_un_mensaje_de_exito() {
      contactUs.validate_Successful_SubmissionMessage();
    }
    @Then("Yo espero que se prensente un mensaje de error")
    public void yoEsperoQueSePrensenteUnMensajeDeError() {
        contactUs.validate_NotSuccessful_SubmissionMessage();
    }
}
