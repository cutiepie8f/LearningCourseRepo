package stepdefinition;

import SalesforcePageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SalesforceStep {

    @Given("user navigates to salesforce {string}")
    public void salesforceLogin(String url)
    {
       //driver = new ChromeDriver();
        //driver.get(url);
    }

    @When("user enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String username, String password) throws IOException {

        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abgh");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
        LoginPage.enterUserNameAndPassword(username,password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {

        //driver.findElement(By.xpath("//input[@name='Login']")).click();
        LoginPage.clickLoginButton();
    }

    @Then("user validates the error message")
    public void userValidatesTheErrorMessage() {
        String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

        Assert.assertEquals(expectedError,LoginPage.actualerror());

       /*
        if(actualError.equals(expectedError))
            System.out.println("pass");
        else
            System.out.println("fail");
*/
        /*
        if(actualError.contains(expectedError))
            Assert.assertTrue(true);
        else
            Assert.assertTrue(false);
        //driver.findElement(By.id("forgot_password_link")).click();
        driver.findElement(By.linkText("Forgot Your Password?")).click();

         */

    }

    @Then("user navigates to the home page of the application")
    public void userNavigatesToTheHomePageOfTheApplication() {
        LoginPage.clickForgotPassword();

    }
}
