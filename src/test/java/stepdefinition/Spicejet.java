package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import reusable.BaseCode;
import spicejetpageobject.HomePage;

import java.util.List;

public class Spicejet extends BaseCode{

    @Given("user handles the dynamic dropdown")
    public void dynamicDropdown() throws InterruptedException {

        HomePage.fromDropdown();
        HomePage.toDropdown(" Coimbatore (CJB)");
        //HomePage.PassengerDropdown("4");
        //HomePage.currencyDropdown("EUR");
        //HomePage.radioButton();
        //HomePage.checkBox();
        //HomePage.dateDropdown("29");
        //HomePage.clickSearchButton();
    }

    @Given("user navigates to home page and select city from source and  destination dropdown")
    public void cityDropdown() throws InterruptedException {
        HomePage.fromDropdown();
        HomePage.toDropdown(" Coimbatore (CJB)");
    }

    @And("user select the number of passengers and select the currency")
    public void passengerAndCurrencyDropdown() throws InterruptedException {
        HomePage.PassengerDropdown("4");
        HomePage.currencyDropdown("EUR");
    }

    @And("user click on the radio button and checkbox")
    public void clickRadioButtonAndCheckbox() throws InterruptedException {
        HomePage.radioButton();
        HomePage.checkBox();
    }

    @When("user clicks on search button")
    public void ClicksOnSearchButton() {
        HomePage.clickSearchButton();
        HomePage.applyWait();

    }

    @Then("user navigates to the booking page of the application")
    public void userNavigatesToTheBookingPage() {
       String expectedTitle = "Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines";
        Assert.assertEquals(expectedTitle,HomePage.validateBookingPageTitle());

    }

    @And("click on nextday icon")
    public void clickOnNextdayIcon() {
        HomePage.clickNext();
    }

    public static void tryCatchExample()
    {
        try {
           driver.findElement(By.id("Button1")).click();
        }
        catch(NoSuchElementException i)
        {
            driver.findElement(By.id("Button2")).click();
        }
        catch (ElementClickInterceptedException y)
        {
            driver.findElement(By.id("Button2")).click();
        }
    }

}