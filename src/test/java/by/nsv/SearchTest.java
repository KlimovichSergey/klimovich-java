package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @BeforeEach
    public void openHomePageClickAcceptCookie() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.clickAcceptCookie();
    }

    @Test
    public void test1() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("Телефон Samsung S24 FE");
        searchPage.startSearch();

        Assertions.assertEquals("Телефон Samsung S24 FE", searchPage.getFirstSearchResulText());
    }

    @Test
    public void test2() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("мотоцикл");
        searchPage.startSearch();

        for (String elementTitle : searchPage.getFirstSearchResulText()) {
            Assertions.assertTrue(elementTitle.contains("мотоцикл"), "Не содержит: " + elementTitle);
        }
    }

    @Test
    public void test3() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("asaaweadad");
        searchPage.startSearch();

        Assertions.assertEquals("Ничего не найдено", searchPage.getSearchResultNotFound());
    }
}
