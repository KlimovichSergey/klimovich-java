package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestForgotPassword  extends BaseTest{
    @BeforeEach
    public void openHomePageClickCookieButtonLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();
    }

    @Test
    public void test1(){
        ForgotPassword forgotPassword = new ForgotPassword(driver);

        Assertions.assertEquals("E-Mail:",forgotPassword.getLabelMailText());
    }

     @Test
    public  void test2(){
        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.sendInputUserEmail("Test_UserEmailErrorText");
        forgotPassword.clickButtonSendAccount();

        Assertions.assertEquals("Неверный формат",forgotPassword.getUserEmailErrorText());
    }
}
