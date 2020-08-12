package framework.steps;

import framework.managers.PagesManager;
import io.cucumber.java.en.When;

public class StartStep{

    @When("^выбран товар: \"(iphone|samsung)\"$")
    public void searchProduct(String message) {
        PagesManager.getPagesManager().getStartPage().searchProduct(message);;
    }
}
