package by.av;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestAV {
   /* @Test
    public void test1(){
        String url = "https://av.by/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        final String BUTTON_SIGN = "//a[@href='/logout']";
        WebElement buttonSign = driver.findElement(By.xpath(BUTTON_SIGN));
        buttonSign.click();

        final String TITLE_LOGIN_FORM = "//div[@class='auth__title']";
        WebElement titleLoginForm = driver.findElement(By.xpath(TITLE_LOGIN_FORM));
        String titleLoginFormText = titleLoginForm.getText();

        final String INPUT_LOGIN_FORM_PHONE= "//input[@id='authPhone']";
        WebElement inputLoginFormPhone = driver.findElement(By.xpath(INPUT_LOGIN_FORM_PHONE));
        inputLoginFormPhone.sendKeys("123456789");

        Assertions.assertEquals("Вход",titleLoginFormText);
        Assertions.assertEquals(123456789,inputLoginFormPhone);

        driver.quit();
    }*/

    @Test
    public void test2 () {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        LoginPageAV loginPage = new LoginPageAV(driver);
        loginPage.openSite();
        loginPage.clickButtonSing();
        loginPage.getTitleLoginForm();
        loginPage.getInputLoginFormPhone();

        Assertions.assertEquals("Вход и регистрация", loginPage.getTitleLoginForm());
        Assertions.assertEquals(123456789, loginPage.getInputLoginFormPhone());

        driver.quit();
    }
}
