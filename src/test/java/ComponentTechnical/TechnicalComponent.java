package ComponentTechnical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TechnicalComponent {
    public WebDriver driver;

    @FindBy(xpath = "//button[@class='login-button']")
    public WebElement Verify_login;

    @FindBy(xpath="//p[@class='error-message-text']")
    public WebElement Verify_get_error_message;

    @FindBy(xpath = "//input[@id='pinInput']")
    public WebElement Verify_Enter_pin;

    @FindBy(xpath="//input[@id='userIdInput']")
    public WebElement Verify_Enter_userid;

    @FindBy(xpath = "//button[@class='logout-button']")
    public WebElement Verify_Logout_button;

    public TechnicalComponent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void Verify_login_button(){
        Verify_login.click();
    }
    public void Verify_message_error(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message-text']")));
        String str1=Verify_get_error_message.getText();
        String str2="Invalid user ID";
        Assert.assertEquals(str1,str2,"Text is Mismatched");
    }
    public void Verify_Enter_pin_number(){
        Verify_Enter_pin.sendKeys("231225");
    }
    public void Verify_Invlid_user_id(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message-text']")));
        String str1=Verify_get_error_message.getText();
        String str2="Invalid user ID";
        Assert.assertEquals(str1,str2,"Text is Mismatched");
    }
    public void Verify_Enter_userid(){
        Verify_Enter_userid.sendKeys("142420");
    }
    public void Verify_Invalid_user_eeror_meassge(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message-text']")));
        String str1=Verify_get_error_message.getText();
        String str2="Invalid PIN";
        Assert.assertEquals(str1,str2,"Text is Mismatched");
    }
    public void Verify_enter_invlid_user_id(){
        Verify_Enter_userid.sendKeys("142420");
    }
    public void Verify_enter_invalid_pin_id(){
        Verify_Enter_pin.sendKeys("123456");
    }
    public void Verify_message_error_text(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message-text']")));
        String str1=Verify_get_error_message.getText();
        String str2="User ID and PIN didn't match";
        Assert.assertEquals(str1,str2,"Text is Mismatched");
    }
    public void Verify_Enter_Valid_user_id(){
        Verify_Enter_userid.sendKeys("142420");
    }
    public void Verify_Enter_Valid_pin_id(){
        Verify_Enter_pin.sendKeys("231225");
    }

   public void Verify_redirected_url(){
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       wait.until(ExpectedConditions.urlToBe("https://qaebank.ccbp.tech/"));
        String str1="https://qaebank.ccbp.tech/";
        String str2=driver.getCurrentUrl();
        Assert.assertEquals(str1,str2,"Url is Mismatched");
   }
public void Verify_wait_new_url(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlToBe("https://qaebank.ccbp.tech/"));
}
public void Verify_button_logout(){
    Verify_Logout_button.click();
}
public void Verify_previous_url(){
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.urlToBe("https://qaebank.ccbp.tech/ebank/login"));
    String str1="https://qaebank.ccbp.tech/ebank/login";
    String str2= driver.getCurrentUrl();
    Assert.assertEquals(str1,str2,"Url is Mismatched");
}
}
