package academy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;



public class launch extends Base
{


    public static Logger log = LogManager.getLogger(launch.class.getName());
    @BeforeTest
    public void open() throws Exception
    {
        driver=initializedriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @Test
    public void launchBrowser() throws Exception
    {
        HomePage hp=new HomePage(driver);
        hp.enter().sendKeys("Ravikant");
        String title = driver.getTitle();
        Thread.sleep(2000);
        log.info("logging..............");
       // Assert.assertEquals(title,"title");
        System.out.println("Ravi's git");
        System.out.println("this is last");

    }
}
