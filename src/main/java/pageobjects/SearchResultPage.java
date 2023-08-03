package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class SearchResultPage extends BaseCode  {
    private static Select se;
    public static String getTextIphone()
    {
        String actualValue = driver.findElement(By.cssSelector("span[class='a-color-state a-text-bold']")).getText();
        return actualValue;
    }

    public static void clickSortByDropdown()
    {
       WebElement sortBy = driver.findElement(By.id("s-result-sort-select"));
        se = new Select(sortBy);


    }
    public static void selectByValue(String value)
    {
        clickSortByDropdown();
        //se.selectByVisibleText(value);
        se.selectByValue(value);
    }

    public static void clickSelectedIphone(int index) throws InterruptedException {
        Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']")).click();

    }

}