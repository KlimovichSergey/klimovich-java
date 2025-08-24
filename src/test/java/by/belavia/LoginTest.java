package by.belavia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class LoginTest {
    Driver driver;

    @BeforeEach

    @Test
    public void test1() {
        String url = "https://belavia.by/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickLinkAccount();


        Assertions.assertEquals("Если у вас нет аккаунта — он создастся автоматически", loginPage.getTitleAccountFormText());

        driver.quit();
    }
}
