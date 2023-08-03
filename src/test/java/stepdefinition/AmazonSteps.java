package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.*;
import reusable.BaseCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AmazonSteps  extends BaseCode {

    @Given("user navigates to {string}")
    public void login(String url) throws IOException {
        //driver = new ChromeDriver();
        //driver.get(url);
        //BaseCode.browserInvocation();
    }

    @When("user enters the {string} in search bar")
    public void enterSearchKeyword(String product)
    {

        //driver.findElement(By.name("field-keywords")).sendKeys(product);
        HomePage.enterProduct(product);
    }

    @And("user clicks on search icon")
    public void clickSearchIcon()
    {

       // driver.findElement(By.id("nav-search-submit-button")).click();
        HomePage.clickSearchIcon();
    }

    @Then("user validates the search result")
    public void verifySearchResult() {
       // String actualValue = driver.findElement(By.cssSelector("span[class='a-color-state a-text-bold']")).getText(); // css selector (way-2)
        String expectedValue = "iphone";

        /*
        if(actualValue.contains(expectedValue))
            System.out.println("pass");
        else
            System.out.println("fail");
*/
        if (SearchResultPage.getTextIphone().contains(expectedValue))
            Assert.assertTrue(true);
        else
            Assert.assertTrue(false);
    }


    @Given("user search the product {string} and navigate to search result page")
    public void searchProduct(String product) throws IOException {
        //BaseCode.browserInvocation();
        HomePage.enterProduct(product);
        HomePage.clickSearchIcon();
    }

    @When("user sort by newest arrival")
    public void userSortByNewestArrival() {
       // SearchResultPage.selectByText("Newest Arrivals");
        SearchResultPage.selectByValue("date-desc-rank");
        
    }

    @Then("validate whether the newest arrival is selected")
    public void validateWhetherTheNewestArrivalIsSelected() {
    }

    @Given("user navigates to signin page")
    public void navigateToLogin() throws IOException {
       // BaseCode.browserInvocation();
        HomePage.clickLoginButton();
    }

    @When("user enters the username and password")
    public void enterCredit() {
        LoginPage.enterMailId();
        LoginPage.clickContinueButton();
        LoginPage.enterPassword();
        LoginPage.clickSigninButton();
        
    }

    @Then("validate error message")
    public void validateLoginPage() {

        Assert.assertEquals("There was a problem\n" +
                "Your password is incorrect",LoginPage.validateErrorMessage());


    }

    @Given("user selects the value from the static dropdown")
    public void userSelectsTheValueFromTheStaticDropdown() {
      //  WebElement currencyElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
       // Select currencyDropdown = new Select(currencyElement);
        //currencyDropdown.selectByIndex(2);
       // currencyDropdown.selectByValue("search-alias=automotive-intl-ship");
        //currencyDropdown.selectByVisibleText("Automotive");

        //HomePage.selectByIndex(4);
        HomePage.selectByValue("search-alias=stripbooks-intl-ship");
        //HomePage.selectByText("Books");
         // List<String> currencyValue = new ArrayList<String>();
         // int currencySize =   currencyElement.findElements(By.tagName("option")).size();
        //for(int i=0;i<currencySize;i++)

        //{
         //  String value =  currencyElement.findElements(By.tagName("option")).get(i).getText();
          //  System.out.println(value);
        //currencyValue.add(currencyElement.findElements(By.tagName("option")).get(i).getText());


        //}
       // System.out.println(  currencyValue);




    }

    @Given("User handles the mouse action")
    public void signInMouseAction() throws InterruptedException {
          HomePage.hoverSignIn();
          Thread.sleep(2000);
          HomePage.clickCreateList();;
    }


    @Then("validate whether the user navigates to create List page")
    public void validateCreateListPage() {
        Assert.assertEquals("Wish List",CreateListPage.getCreateListTitle());
    }

    @And("user extract all the attributes list of static dropdown")
    public void extractStaticDropdown() {

        Assert.assertTrue(HomePage.staticDropDownList());
    }

    @Given("user search the product {string} and navigate to search result page and user sort by newest arrival")
    public void userSearchTheProductAndNavigateToSearchResultPageAndUserSortByNewestArrival(String product) {
        HomePage.enterProduct(product);
        HomePage.clickSearchIcon();
        SearchResultPage.selectByValue("date-desc-rank");

    }

    @When("user clicks on selected iphone")
    public void userClicksOnSelectedIphone() throws InterruptedException {
SearchResultPage.clickSelectedIphone(4);
    }

    @Then("user navigates to selected iphone page")
    public void userNavigatesToSelectedIphonePage() {

        String expectedTitle = "5s 16GB Original Smartphones Compatible Apple iPhone (Grey) : Amazon.in: Electronics";
        Assert.assertEquals(expectedTitle, SelectedIphonePage.getTitle());
    }
}
