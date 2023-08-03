package stepdefinition;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode{

    @Before
    public void setup() throws IOException {
        System.out.println("....Browser Start.....");
        BaseCode.browserInvocation();
    }


    @After
    public void tearDown()
    {
        System.out.println("....Browser End.....");
        //driver.close();
    }


    @BeforeStep    //Beforer executing  each and every steps of test scenario.....
    public void takeScreenShot(Scenario sc)
    {
       byte[] screenshot =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       sc.attach(screenshot,"image/png",sc.getName());
    }



    @AfterStep         // After executing all the steps of test scenario.....
    public void a()
    {

    }

}
