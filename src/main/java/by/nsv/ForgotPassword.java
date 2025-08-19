package by.nsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private final String LABEL_MAIL_TEXT_XPATH = "//div[@class='form-control']";
    private final String USER_INPUT_EMAIL_XPATH =  " //input[@name='USER_EMAIL']";
    private final String BUTTON_SEND_ACCOUNT_XPATH = "//button[@name='send_account_info']";
    private final String USER_EMAIL_ERROR_ID ="USER_EMAIL-error";
    private WebDriver driver;

    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }

    public String getLabelMailText(){
        return driver.findElement(By.xpath(LABEL_MAIL_TEXT_XPATH)).getText();
    }

    public void  sendInputUserEmail(String email){
        driver.findElement(By.xpath(USER_INPUT_EMAIL_XPATH)).sendKeys(email);
    }

    public  void clickButtonSendAccount(){
        driver.findElement(By.xpath(BUTTON_SEND_ACCOUNT_XPATH)).click();
    }
    public String getUserEmailErrorText(){
        return driver.findElement(By.id(USER_EMAIL_ERROR_ID)).getText();
    }

}

