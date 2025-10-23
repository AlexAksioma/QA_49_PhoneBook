package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContactsPage extends BasePage{

    public ContactsPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 10), this);
    }
    @FindBy(xpath = "//a[@href='/contacts']")
    WebElement btnContactsHeader;
    @FindBy(xpath = "//div[@class='contact-page_message__2qafk']")
    WebElement divTextNoContacts;

    public boolean isTextContactsPresent(String text){
        return isTextInElementPresent(btnContactsHeader, text);
    }

    public boolean isTextNoContactsPresent(String text){
        System.out.println(divTextNoContacts.getText());
        return isTextInElementPresent(divTextNoContacts, text);
    }


}
