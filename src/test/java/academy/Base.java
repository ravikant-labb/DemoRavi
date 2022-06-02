package academy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base
{
    public WebDriver driver;
    public Properties prop;

    public WebDriver initializedriver() throws FileNotFoundException, IOException
    {

        prop = new Properties();
        FileInputStream fl = new FileInputStream("S:\\final\\final\\src\\main\\resources\\global.properties");
        prop.load(fl);
       //String browserName = prop.getProperty("browser");
        String browserName = System.getProperty("browser");
        ChromeOptions option=new ChromeOptions();
        option.addArguments("headless");
        /*if (browserName.equalsIgnoreCase( "chrome"))
        {
            driver = WebDriverManager.chromedriver().create();
        }*/
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @BeforeTest
    public void open() throws Exception
    {
        driver=initializedriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void close()
    {
        driver.close();
    }


    public String screenShot(String testcaseName,WebDriver driver) throws IOException
    {
        TakesScreenshot take=(TakesScreenshot)driver;
        File source = take.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
        FileUtils.copyFile(source,new File(destination));
        return destination;
    }




}