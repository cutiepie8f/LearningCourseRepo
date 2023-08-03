package jquerydroppable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

import java.util.prefs.BackingStoreException;

public class DragAndDrop extends BaseCode {

    public static void dragAndDrop()
    {
        WebElement dragDropFrame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(dragDropFrame);
        Actions action = new Actions(driver);
        WebElement drag = driver.findElement(By.id("draggable"));
        //WebElement drag = driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
        //WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']"));
        WebElement drop = driver.findElement(By.id("droppable"));
        action.dragAndDrop(drag,drop).build().perform();
        driver.switchTo().defaultContent();
    }



}
