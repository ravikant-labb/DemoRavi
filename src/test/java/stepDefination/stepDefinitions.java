package stepDefination;

import academy.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;

@RunWith(Cucumber.class)
public class stepDefinitions extends Base {
    //public WebDriver driver;

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
       //driver=initializedriver();
    }

    @When("^User enters \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_logs_in(String strArg1) throws Throwable {
        driver=initializedriver();
        driver.get(strArg1);
        driver.manage().window().maximize();
    }

    @Then("^Verify that user is succesfully logged in$")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
        //HomePage hp=new HomePage(driver);

    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        HomePage hp=new HomePage(driver);
        hp.enter().sendKeys(strArg1);
        String title = driver.getTitle();
        Thread.sleep(2000);
    }

    @And("^Click on Login link in home page to land on Secure sign in Page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
        throw new PendingException();
    }

}
