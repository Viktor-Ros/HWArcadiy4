package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends Page{


    @FindBy(xpath = "//div[contains(text(), 'Цена')]/..//input[@qa-id='range-to']")
    private WebElement priceTo;//цена ДО

    @FindBy(xpath = "//div[contains(text(), 'Цена')]/..//input[@qa-id='range-from']")
    private WebElement priceFrom;//цена ПОСЛЕ


    public SearchResultPage configurationPrice(String name, String value) {


        switch (name) {
            case "от":
                elementToBeClickable(priceFrom).sendKeys(value);
                return this;

            case "до":
                elementToBeClickable(priceTo).sendKeys(value);
                return this;
        }

        Assert.fail("Такого параметра <" + name + "> существует");

        return this;
    }








	/*public SearchResultPage configurationPrice(String nameFrom, String valueFrom, String nameTo, String valueTo) {
		configurationPrice(nameFrom, valueFrom);
		configurationPrice(nameTo, valueTo);
		return this;
	}*/


}
