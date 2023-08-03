package SalesforcePageObject;

import org.openqa.selenium.By;
import reusable.BaseCode;
import reusable.ExcelHandling;

import java.io.IOException;

public class LoginPage extends BaseCode {

    public static void enterUserNameAndPassword(String username,String password) throws IOException {
       // driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prob.getProperty("username"));// fetching data from property file
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(ExcelHandling.readexcel("credentials",0,0));// fetching data from xl sheet
       // driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);  //   for scaenario outline




       //  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prob.getProperty("password"));//fetching data from property file
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ExcelHandling.readexcel("credentials",1,0));  // fetching data from xl sheet
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);  //  for scaenario outline
    }


    public static void clickLoginButton()
    {

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    //public static void validateErrorMessaage()
    //{
       // String actualError = driver.findElement(By.id("error")).getText();
        //String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

   // }

    public static void clickForgotPassword()
    {

        driver.findElement(By.id("forgot_password_link")).click();
    }

    public static String actualerror()
    {
        String actualError = driver.findElement(By.id("error")).getText();
        return actualError;

    }
}
