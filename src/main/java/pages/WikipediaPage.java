package pages;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.String;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vshevchenko on 28/04/2016.
 */
@DefaultUrl("https://uk.wikipedia.org/")
public class WikipediaPage extends PageObject{

    @FindBy(xpath = ".//div[@id = 'content']//h1[@id='firstHeading']")
    private WebElement firstHeading;

    @FindBy(xpath = ".//*[@id='searchInput']")
    private WebElement searchInput;


    public void search(String s) {
        searchInput.sendKeys(s);
        searchInput.submit();
    }

    private String getFirstHeadingText() {
        return firstHeading.getText();
    }

    public void checkFirstHeading(String expected) {
        assertTrue(getFirstHeadingText().contains(expected));
    }


}
