package by.nsv;

import by.nsv.singleton.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    private final String INPUT_SEARCH_FORM_XPATH = "//input[@id='title-search-input_fixed']";
    private final String BUTTON_SUBSEARCH_XPATH = "//div[@class='col-md-4 search_wrap']//button[@id='subserch']";
    private final String FIRST_SEARCH_RESULT_XPATH = "//div[@data-inf='12']//span[@itemprop='name']";
    private final String SEARCH_RESULT_NOT_FOUND_XPATH = "//div[@class='not_found']";
    private WebDriver driver;

    public SearchPage() {
    }

    public void sendKeysSearch(String search) {
        driver.sendKeys(INPUT_SEARCH_FORM_XPATH, search);
    }

    public void startSearch() {
        WebDriver.clickElement(BUTTON_SUBSEARCH_XPATH);
    }

    public List<String> getFirstSearchResulText() {
        List<WebElement> listSearchResultElements = WebDriver.findElements(FIRST_SEARCH_RESULT_XPATH);
        List<String> listOfSearchResultTitles = new ArrayList<>();

        for (WebElement element : listSearchResultElements) {
            listOfSearchResultTitles.add(element.getText().toLowerCase());
        }
        return listOfSearchResultTitles;
    }

    public String getSearchResultNotFound() {
        return WebDriver.findElement(SEARCH_RESULT_NOT_FOUND_XPATH).getText().trim();
    }
}
