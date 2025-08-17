package by.av;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageAV {
    private String URL ="https://av.by/ ";
    private String BUTTON_SIGN = "//a[@href='/logout']";
    private String TITLE_LOGIN_FORM = "//div[@class='auth__title']";
    private String INPUT_LOGIN_FORM_PHONE= "//input[@id='authPhone']";
    private WebDriver driver;

    LoginPageAV(WebDriver driver){
        this.driver = driver;
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
