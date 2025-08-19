package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @BeforeEach
    public void openHomePageClickCookieButtonLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();
    }

    @Test
    public void test1() {
        CabinetPage cabinetPage = new CabinetPage(driver);

        Assertions.assertEquals("Личный кабинет", cabinetPage.getHeadFormTitleText());
    }

    @Test
    public void test2() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", cabinetPage.getUserLoginPopupErrorText());
        Assertions.assertEquals("Заполните это поле", cabinetPage.getUserPasswordPopupErrorText());

    }

    @Test
    public void test3() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.sendKeysLogin("John Black");
        cabinetPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", cabinetPage.getUserPasswordPopupErrorText());
    }

    @Test
    public void test4() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.sendKeysPassword("test_password");
        cabinetPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", cabinetPage.getUserLoginPopupErrorText());
    }

    @Test
    public void test5() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.sendKeysLogin("Test Login");
        cabinetPage.sendKeysPassword("1234567");
        cabinetPage.clickButtonLogin();

        Assertions.assertEquals("Неверный логин или пароль", cabinetPage.getAuthAlertLoginLogin());
    }

    @Test
    public void test6() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.sendKeysPassword("1234");
        cabinetPage.clickButtonLogin();

        Assertions.assertEquals("Минимум 6 символов", cabinetPage.getUserPasswordPopupErrorText());
    }

    @Test
    public void test7() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", cabinetPage.getUserLoginPopupErrorText());
        Assertions.assertEquals("Заполните это поле",cabinetPage.getUserPasswordPopupErrorText());

    }

    @Test
    public void test8() {
        CabinetPage cabinetPage = new CabinetPage(driver);
        cabinetPage.clickButtonForgotPassword();
    }
}
