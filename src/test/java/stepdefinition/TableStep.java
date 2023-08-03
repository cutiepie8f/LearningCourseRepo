package stepdefinition;

import TableHandling.TableHandling;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

public class TableStep {
    @Given("user iterates the coloumn values")
    public void userIteratesColoumnValues()
    {
        TableHandling.coloumValues();
        TableHandling.revenueTable();
    }

    @When("user clicks on hyperLink")
    public void userClicksOnHyperLink() throws InterruptedException {
        TableHandling.hyperLink();
    }

    @Then("user navigates to that page")
    public void userNavigatesToThatPage() {
    }
}
