package spicejetpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import java.time.Duration;

public class HomePage extends BaseCode {
    public static void fromDropdown() {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
         //WebElement todrop = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
        // todrop.findElement(By.xpath("//a[@value='CJB']")).click();
        //driver.findElement(By.xpath("//div[@id='dropdownGroup1']//a[@value='CJB']")).click();
        //driver.findElement(By.xpath("//a[text()='" + city + "']")).click();

    }

    public static void toDropdown(String city) throws InterruptedException {

        driver.findElement(By.xpath("//a[text()='" + city + "']")).click();
    }

    public static void PassengerDropdown(String value) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='book']")).click();
        //Thread.sleep(2000);
           driver.findElement(By.id("divpaxinfo")).click();
       // driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")).click();
           WebElement element = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
           Select adult = new Select(element);
           adult.selectByValue(value);
    }

    public static void currencyDropdown(String value) throws InterruptedException {
        Thread.sleep(2000);
        //driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
        WebElement element = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select currency = new Select(element);
        currency.selectByValue(value);
    }

    public static void radioButton() throws InterruptedException {
        //Thread.sleep(2000);
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
    }

    public static void checkBox() throws InterruptedException {
       // Thread.sleep(2000);
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
    }

    public static void dateDropdown(String date)
    {
        //WebElement element = driver.findElement(By.xpath("//input[@id='custom_date_picker_id_1']"));
        //element.findElement(By.xpath("//a[text()='"+date+"']")).click();
    }
    public static void clickSearchButton()
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    public static void applyWait()
    {
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
        w.pollingEvery(Duration.ofSeconds(5));
        w.ignoring(NoSuchElementException.class);
        w.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")));
    }

    public  static void clickNext()
    {
        driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")).click();
    }

    public static String  validateBookingPageTitle()
    {
        String actualTitle = driver.getTitle();
        return actualTitle;

    }
}