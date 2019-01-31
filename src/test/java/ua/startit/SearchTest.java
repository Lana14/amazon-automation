package ua.startit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;

public class SearchTest extends BaseTest {

    @DataProvider(name = "search queries for amazon")
    public static Object[][] searchQueries() {
        return new Object[][]{
//                {"#search query", "#expected result"},
                {"kettle amazon basics", "Gienar Travel Foldable Electric Kettle Food"},
                {"red dead redemption 2", "PS4 - Red Dead Redemption 2 - Ultimate Edition"}
        };
    }

    @Test(dataProvider = "search queries for amazon", groups = {"p0", "smoke"})
    public void testKettle(String searchQueries, String expectedResult) {
        HomePage homePage = new HomePage(driver);
        homePage.search(searchQueries);

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.enableFilterNew();
        searchResultPage.enableFourStarsFilter();
        searchResultPage.getExpectedResult();

        Assert.assertEquals(searchResultPage.getExpectedResult(), expectedResult);
    }

    @Test(dataProvider = "search queries for amazon", groups = "p1")
    public void testKettle2(String searchQueries, String expectedResult) {
        HomePage homePage = new HomePage(driver);
        homePage.search(searchQueries);

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.enableFilterNew();
        searchResultPage.enableFourStarsFilter();
        searchResultPage.getExpectedResult();

        Assert.assertEquals(searchResultPage.getExpectedResult(), expectedResult);
    }
}


