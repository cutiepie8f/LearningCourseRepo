package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;


public class HomePage extends BaseCode {
   private static Select currencyDropdown;

  private static By helloSigninSection = By.id("nav-link-accountList");
    public static void enterProduct(String productName)
    {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);
    }

    public static void clickSearchIcon()
    {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static void clickLoginButton()
    {
        driver.findElement(helloSigninSection).click();
    }

    public static void selectByIndex(int index)
    {
        initializeStaticDropdown();
        currencyDropdown.selectByIndex(index);
    }
    public static void selectByValue(String value)
    {
        initializeStaticDropdown();
        currencyDropdown.selectByValue(value);
    }
    public static void  selectByText(String value)
    {
        initializeStaticDropdown();
        currencyDropdown.selectByVisibleText(value);
    }

    public static void initializeStaticDropdown()
    {
        WebElement currencyElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        currencyDropdown = new Select(currencyElement );
    }

    public static void hoverSignIn() throws InterruptedException {

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(helloSigninSection)).build().perform();
    }

    public static void clickCreateList() throws InterruptedException {

        driver.findElement(By.partialLinkText("Create a Wish List")).click();
        //driver.findElement(By.xpath("//a[@class='nav-link nav-item']//span[@class='nav-text']")).click();


    }

    public static boolean staticDropDownList()
    {
        WebElement currencyElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        List<WebElement> element = currencyElement.findElements(By.tagName("option"));
        for (WebElement a : element)
        {
            System.out.println(a.getText());
        }
        List<String> l = new ArrayList<String>();

        for (WebElement b : element)
        {
            l.add(b.getText());
        }
        System.out.println(l);

        boolean flag = false;
        for(String c : l)
        {
            if(c.equals("Arts & Crafts")) {
                flag=true;
                break;
            }
        }
        return flag;
    }
}
