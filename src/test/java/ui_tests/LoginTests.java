package ui_tests;

import dto.User;
import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends ApplicationManager {

    @Test
    public void loginPositiveTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnLoginHeader();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginForm("a@mail.ru", "Password123!");
        Assert.assertTrue(new ContactsPage(getDriver()).isTextContactsPresent("CONTACTS"));

    }

    @Test
    public void loginNegativeTest_wrongPassword(){
        User user = new User("a@mail.ru", "password123!");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnLoginHeader();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginFormWithUser(user);
        Assert.assertEquals(loginPage.closeAlertReturnText(), "Wrong email or password");
    }
}
