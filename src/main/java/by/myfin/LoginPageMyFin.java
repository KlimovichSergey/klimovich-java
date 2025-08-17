package by.myfin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageMyFin {
    private String URL = "https://myfin.by/";
    private String BUTTON_DISALLOW_COOKIES = "//button[@class='btn btn-big btn_more btn--full cookie__btn-deny']";
    private String BUTTON_SIGN = "//span[@class='sign-btn']";
    private String TITLE_LOGIN_FORM = "//div[@class='login-form__title']";
    private String INPUT_LOGIN_FORM_PHONE= "//input[@id='login_form_phone']";
    private WebDriver driver;

    LoginPageMyFin(WebDriver webDriver){
        driver = webDriver;
    }
    public void clickDisallowCookies(){
        WebElement buttonDisallowCookies = driver.findElement(By.xpath(BUTTON_DISALLOW_COOKIES));
        buttonDisallowCookies.click();
    }

    public void clickButtonSing(){
        WebElement buttonSign = driver.findElement(By.xpath(BUTTON_SIGN));
        buttonSign.click();
    }

    public String getTitleLoginForm(){
        WebElement titleLoginForm = driver.findElement(By.xpath(TITLE_LOGIN_FORM));
        String titleLoginFormText = titleLoginForm.getText();
        return titleLoginFormText;
    }

    public WebElement  getInputLoginFormPhone(){
        WebElement inputLoginFormPhone = driver.findElement(By.xpath(INPUT_LOGIN_FORM_PHONE));
        inputLoginFormPhone.sendKeys("123456789");
        return inputLoginFormPhone;
    }

    public void openSite(){
        driver.get(URL);
    }
}
