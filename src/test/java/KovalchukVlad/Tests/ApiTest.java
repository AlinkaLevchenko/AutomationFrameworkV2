package KovalchukVlad.Tests;

import KovalchukVlad.Pages.ApiPage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import static pageobject.BasePage.driver;

public class ApiTest extends TestInit {

    @Test
    public void clickButtonApiTest() {
        HomePage homePage = new HomePage(driver);
        ApiPage apiPage = new ApiPage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickButtonApi();
        apiPage.goToIframe();
        Assert.assertTrue(apiPage.searchTextApi().isDisplayed());
    }
}
