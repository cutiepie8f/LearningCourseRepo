package TableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TableHandling extends BaseCode {
    public static void coloumValues()
    {
        WebElement eyElement = driver.findElement(By.cssSelector(".infobox.vcard"));
        List<WebElement> coloumnOneElement = eyElement.findElements(By.tagName("th"));
        List<String>  coloumnOneValues = new ArrayList<>();
        for(WebElement e:coloumnOneElement)
        {
            coloumnOneValues.add(e.getText());
        }
        System.out.println(coloumnOneValues);


        List<WebElement> coloumnTwoElement = eyElement.findElements(By.tagName("td"));
        List<String>  coloumnTwoValues = new ArrayList<>();
//        for(WebElement y:coloumnTwoElement)
//        {
//            coloumnTwoValues.add(y.getText());
//        }
        for(int i =1;i<eyElement.findElements(By.tagName("td")).size();i++)
        {
            coloumnTwoValues.add(eyElement.findElements(By.tagName("td")).get(i).getText());
        }
        System.out.println(coloumnTwoValues);

    }

    public static void revenueTable()
    {
        System.out.println("...........FY19...........");
        WebElement revenueElement = driver.findElement(By.className("wikitable"));
        List<WebElement>  fy19Element = driver.findElements(By.xpath("//table[@class='wikitable']//tr//td[4]"));
        List<String> fy19ElementValues = new ArrayList<>();
        for(WebElement a :fy19Element)
        {
            fy19ElementValues.add(a.getText());
        }
        System.out.println(fy19ElementValues);

        System.out.println("...........FY18...........");

        List<WebElement> fy18Element = driver.findElements(By.xpath("//table[@class='wikitable']//tr//td[5]"));
        List<String> fy18ElementValues = new ArrayList<>();
        for (WebElement b: fy18Element)
        {
            fy18ElementValues.add(b.getText());
        }
        System.out.println(fy18ElementValues);

    }

    public static void hyperLink() throws InterruptedException {
        Thread.sleep(4000);
        WebElement gotToKnowElement = driver.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][1]"));

        List<WebElement> hyperLink = driver.findElements(By.xpath("//li/a"));
//        for(WebElement e:hyperLink )
//        {
//            String ac = Keys.chord(Keys.CONTROL,Keys.ENTER);
//            e.sendKeys(ac);
//        }

        for(int i=0;i<gotToKnowElement.findElements(By.xpath("//li/a")).size();i++)
        {
            String ac = Keys.chord(Keys.CONTROL,Keys.ENTER);
         gotToKnowElement.findElements(By.xpath("//li/a")).get(i).sendKeys(ac);
        }
    }

}
