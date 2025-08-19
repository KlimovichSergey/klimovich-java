package by.nsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CabinetPage {

    private final String HEAD_FORM_TITLE = "//div[@class='form_head']//h2";
    private final String USER_LOGIN_POPUP = "USER_LOGIN_POPUP";
    private final String USER_PASSWORD_POPUP = "USER_PASSWORD_POPUP";
    private final String BUTTON_LOGIN = "Login";
    private final String USER_LOGIN_POPUP_ERROR_ID ="USER_LOGIN_POPUP-error";
    private final String USER_PASSWORD_POPUP_ERROR_ID ="USER_PASSWORD_POPUP-error";
    private final String USER_ALERT_LOGIN_XPATH ="//div[@id='ajax_auth']//p";
    private final String USER_FORGOT_PASSWORD_XPATH = "//a[@class='forgot pull-right']";
    private WebDriver driver;

    public CabinetPage(WebDriver driver){
        this.driver = driver;
    }

    public String getHeadFormTitleText() {
        return driver.findElement(By.xpath(HEAD_FORM_TITLE)).getText();
    }

    public void sendKeysLogin(String login){
        driver.findElement(By.id(USER_LOGIN_POPUP)).sendKeys(login);
    }

    public  void sendKeysPassword(String password){
        driver.findElement(By.id(USER_PASSWORD_POPUP)).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(By.name(BUTTON_LOGIN)).click();
    }

    public  String getUserLoginPopupErrorText(){
        return driver.findElement(By.id(USER_LOGIN_POPUP_ERROR_ID)).getText();
    }

    public String getUserPasswordPopupErrorText(){
        return driver.findElement(By.id(USER_PASSWORD_POPUP_ERROR_ID)).getText();
    }

    public  String getAuthAlertLoginLogin(){
        return driver.findElement(By.xpath(USER_ALERT_LOGIN_XPATH)).getText();
    }

    public void clickButtonForgotPassword(){
        driver.findElement(By.xpath(USER_FORGOT_PASSWORD_XPATH)).click();
    }
}
