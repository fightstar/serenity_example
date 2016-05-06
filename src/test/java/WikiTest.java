import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.UserSteps;import java.lang.String;

/**
 * Created by vshevchenko on 28/04/2016.
 */
@Narrative(text={"In order to check the first heading text after searh",
        "As a user",
        "I want to be able to search and get expected text"})
@RunWith(SerenityRunner.class)
public class WikiTest {

    String expected = "Google";

    @Managed
    public WebDriver webDriver;


    @ManagedPages
    public Pages pages;

    @Steps
    public UserSteps userSteps;


    @Test
    public void findGoogleInWiki(){
        userSteps.openWikiPage();
        userSteps.searchWiki(expected);
        userSteps.checkThatFirstHeadingHasExpectedText(expected);
    }
}
