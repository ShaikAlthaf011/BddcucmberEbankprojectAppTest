package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import ComponentTechnical.TechnicalComponent;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest {
    public WebDriver driver;
    TechnicalComponent technicalComponent;
    @BeforeMethod
    public void Enviorment(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    }
    @Given("Navigate the Ebank Application")
    public void navigate_the_ebank_application() {
        driver=new ChromeDriver();
        driver.navigate().to("https://qaebank.ccbp.tech/ebank/login");
        driver.manage().window().maximize();
        technicalComponent=new TechnicalComponent(driver);
    }
    @When("Verify Ebank Click on the login button")
    public void verify_ebank_click_on_the_login_button() {
       technicalComponent.Verify_login_button();
    }
    @Then("Verify the Error Message")
    public void verify_the_error_message() {
       technicalComponent.Verify_message_error();
    }
    @Then("Close the Browser")
    public void close_the_browser() {
        driver.quit();
    }
    @When("Verify Enter The  pin number Ebank Funcationalities")
    public void verify_enter_the_pin_number_ebank_funcationalities() {
    technicalComponent.Verify_Enter_pin_number();
    }
    @Then("Verify Error Text message")
    public void verify_error_text_message() {
    technicalComponent.Verify_Invlid_user_id();
    }
    @When("Verify Enter the User Id Ebank Funcationalities")
    public void verify_enter_the_user_id_ebank_funcationalities() {
   technicalComponent.Verify_Enter_userid();
    }
    @Then("Verify Invalid Error message")
    public void verify_invalid_error_message() {
    technicalComponent.Verify_Invalid_user_eeror_meassge();
    }
    @When("Verify Enter Invalid user id Ebank Application")
    public void verify_enter_invalid_user_id_ebank_application() {
    technicalComponent.Verify_enter_invlid_user_id();
    }
    @Then("Verify Enter Invalid Pin id Ebank Application")
    public void verify_enter_invalid_pin_id_ebank_application() {
    technicalComponent.Verify_enter_invalid_pin_id();
    }
    @Then("Verify Error Message login Funcationalities")
    public void verify_error_message_login_funcationalities() {
    technicalComponent.Verify_message_error_text();
    }

    @When("Verify Enter Valid User id Ebank Application")
    public void verify_enter_valid_user_id_ebank_application() {
    technicalComponent.Verify_Enter_Valid_user_id();
    }

    @Then("Verify Enter Valid Pin id Ebank Application")
    public void verify_enter_valid_pin_id_ebank_application() {
    technicalComponent.Verify_Enter_Valid_pin_id();
    }
    @Then("Verify The Url")
    public void verify_the_url() {
    technicalComponent.Verify_redirected_url();
    }

    @Then("Verify The Url Wait previous")
    public void verify_the_url_wait_previous() {
    technicalComponent.Verify_wait_new_url();
    }
    @When("Verify The Logout Button")
    public void verify_the_logout_button() {
    technicalComponent.Verify_button_logout();
    }
    @Then("Verify The Logout Url")
    public void verify_the_logout_url() {
    technicalComponent.Verify_previous_url();
    }
}
