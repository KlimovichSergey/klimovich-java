package by.myfin;

import by.belavia.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestMyFin {
   /* @Test
    public void test1() {
        String url = "https://myfin.by/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        final String BUTTON_DISALLOW_COOKIES = "//button[@class='btn btn-big btn_more btn--full cookie__btn-deny']";
        WebElement buttonDisallowCookies = driver.findElement(By.xpath(BUTTON_DISALLOW_COOKIES));
        buttonDisallowCookies.click();

        final String BUTTON_SIGN = "//span[@class='sign-btn']";
        WebElement buttonSign = driver.findElement(By.xpath(BUTTON_SIGN));
        buttonSign.click();

        final String TITLE_LOGIN_FORM = "//div[@class='login-form__title']";
        WebElement titleLoginForm = driver.findElement(By.xpath(TITLE_LOGIN_FORM));
        String titleLoginFormText = titleLoginForm.getText();

        final String INPUT_LOGIN_FORM_PHONE= "//input[@id='login_form_phone']";
        WebElement inputLoginFormPhone = driver.findElement(By.xpath(INPUT_LOGIN_FORM_PHONE));
        inputLoginFormPhone.sendKeys("123456789");

        Assertions.assertEquals("Вход и регистрация",titleLoginFormText);
        Assertions.assertEquals(123456789,inputLoginFormPhone);

        driver.quit();
    }*/

    @Test
    public void test2 (){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

       LoginPageMyFin loginPage = new LoginPageMyFin(driver);
       loginPage.openSite();
       loginPage.clickDisallowCookies();
       loginPage.clickButtonSing();
       loginPage.getTitleLoginForm();
       loginPage.getInputLoginFormPhone();

        Assertions.assertEquals("Вход и регистрация",loginPage.getTitleLoginForm());
        Assertions.assertEquals(123456789,loginPage.getInputLoginFormPhone());

        driver.quit();
    }
}
