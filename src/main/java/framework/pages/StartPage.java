package framework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Page{

    @FindBy(xpath = "//input[@name = 'search']")
    private WebElement searchLabel;//Поле поиска

    /**
     * Поиск
     *
     */

    public SearchResultPage searchProduct(String name) {

        elementToBeClickable(searchLabel).sendKeys(name);
        searchLabel.sendKeys(Keys.ENTER);
        return app.getSearchResultPage();
    }
}
