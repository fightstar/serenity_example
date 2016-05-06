package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.String;import static org.junit.Assert.assertTrue;

/**
 * Created by vshevchenko on 27/04/2016.
 */

@DefaultUrl("https://www.google.com.ua/")
public class GooglePage extends PageObject {


    @FindBy(className = "gsfi")
    private WebElement searchInputField;

    @FindBy(xpath = "//div[@id = 'ires']//div[@class = 'g'][1]//h3/a")
    private WebElement firstLink;


    public void search(String s){
        searchInputField.sendKeys(s);
        searchInputField.submit();
    }

    public void checkPageTitle(String expectedTitle) {
        assertTrue(getTitle().contains(expectedTitle));
    }
    public void clickOnFirstLink() {
        firstLink.click();
    }

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public String getFirstLinkText() {
        return firstLink.getText();
    }
}
