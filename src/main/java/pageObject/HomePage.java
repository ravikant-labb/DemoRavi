package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
   public WebDriver driver;


   By login=By.cssSelector("input[placeholder='Enter your Email']");


   public HomePage(WebDriver driver)
   {
       this.driver=driver;
   }


    public WebElement enter()
    {
       return driver.findElement(login);

    }


}
