package framework.managers;

import framework.pages.SearchResultPage;
import framework.pages.StartPage;

public class PagesManager {

    private static PagesManager pagesManager;

    private StartPage sPage;
    private SearchResultPage srPage;

    private PagesManager() {
    }

    public static PagesManager getPagesManager() {
        if(pagesManager == null) {
            pagesManager = new PagesManager();
        }
        return pagesManager;
    }

    public StartPage getStartPage() {
        if(sPage == null) {
            sPage = new StartPage();
        }
        return sPage;
    }

    public SearchResultPage getSearchResultPage() {
        if(srPage == null) {
            srPage = new SearchResultPage();
        }
        return srPage;
    }
}
