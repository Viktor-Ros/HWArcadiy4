package framework.pages;

import framework.managers.DriverManager;
import framework.managers.PagesManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    PagesManager app = PagesManager.getPagesManager();
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10, 2000);

    public Page(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    protected WebElement elementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
