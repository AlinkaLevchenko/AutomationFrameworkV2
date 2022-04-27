package DubrovskiyVlad.Tests;

import DubrovskiyVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class PartnerWithUs extends TestInit {

    @Test
    public void CheckPartnerWithUs(){
        HomePage homePage = new HomePage(driver);
        homePage.openSiteEatstreet();
        fullscreen();
        homePage.clickPartnerWithUs();
        Assert.assertTrue(homePage.CheckPartnerwithUs().isDisplayed());
    }
}
