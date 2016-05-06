package steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.GooglePage;
import pages.WikipediaPage;

/**
 * Created by vshevchenko on 27/04/2016.
 */
public class UserSteps extends ScenarioSteps {

    private GooglePage googlePage() {
        return getPages().currentPageAt(GooglePage.class);
    }

    private WikipediaPage wikiPage() {
        return getPages().currentPageAt(WikipediaPage.class);
    }

    @Step("Check page title")
    public void checkPageTitle(String expectedTitle){
        googlePage().checkPageTitle(expectedTitle);
    }

    @Step("Open google page")
    public void openGooglePage() {
        googlePage().open();
    }

    @Step("search in Google")
    public void search(String text){
        googlePage().search(text);
    }

    @Step("open Wiki")
    public void openWikiPage() {
        wikiPage().open();
    }

    @Step("search in Wiki")
    public void searchWiki(String s){
        wikiPage().search(s);
    }

    @Step("check that first heading has expected text ")
    public void checkThatFirstHeadingHasExpectedText(String text){
        wikiPage().checkFirstHeading(text);
    }





}
