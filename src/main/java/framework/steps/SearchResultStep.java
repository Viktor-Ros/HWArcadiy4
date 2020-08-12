package framework.steps;

import framework.managers.PagesManager;
import io.cucumber.java.en.When;

public class SearchResultStep {

    @When("^когда ограничена цена: $")
    public void limitPrice(String name, String value) {
        PagesManager.getPagesManager().getSearchResultPage().configurationPrice(name, value);;
    }
}
