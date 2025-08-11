package by.dodopizza;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://dodopizza.by/");
        driver.manage().window().maximize();

        String inputLogin = "//button[@class='sc-qlzmyl-0 cva-Df']";
        By inputPasswordByXpath = By.xpath(inputLogin);
        WebElement element = driver.findElement(By.xpath(inputLogin));
        element.click();

        String inputNumberXpath= "//input[@id='phn-input']";
        WebElement element1 = driver.findElement(By.xpath(inputNumberXpath));
        element1.sendKeys("123456789");
        driver.quit();
    }
}
