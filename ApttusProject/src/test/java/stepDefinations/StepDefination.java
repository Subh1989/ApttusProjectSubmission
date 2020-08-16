package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductValidation;
import resources.Base;

public class StepDefination extends Base{

	LoginPage lp;
	HomePage hp;
	ProductValidation pv;
	
    @Given("^user has invoked the browser$")
    public void user_has_invoked_the_browser() throws Throwable {
        
    	driver=invokeBrowser();
    }

    @When("^user clicks on sign in$")
    public void user_clicks_on_sign_in() throws Throwable {
        
    	lp = new LoginPage(driver);
    	lp.validateLoginPage();
    	lp.clickLoginPage();
    }

    @Then("^user should log in successfully$")
    public void user_should_log_in_successfully() throws Throwable {
        
    	lp.validatePageAfterLogin();
    }

    @And("^user opens the required url$")
    public void user_opens_the_required_url() throws Throwable {
     
    	driver.get(prop.getProperty("url"));
    }

    @And("^user enters (.+) and (.+) and click login button$")
    public void user_enters_and_and_click_login_button(String username, String password) throws Throwable {
        
    	lp.userDetails(username, password);
    	
    }

    @And("^user selects the category as TShirts$")
    public void user_selects_the_category_as_tshirts() throws Throwable {
       
    	hp = new HomePage(driver);
    	hp.selectProduct();
    }

    @And("^user validates the required product is displayed$")
    public void user_validates_the_required_product_is_displayed() throws Throwable {
       
    	hp.productDisplay();
    }

    @And("^user clicks on the product$")
    public void user_clicks_on_the_product() throws Throwable {
       
    	hp.clickProduct();
    }

    @And("^user clicks on ADD to Cart$")
    public void user_clicks_on_add_to_cart() throws Throwable {
        
    	hp.clickAddtoCart();
    }

    @And("^user validates that the product is successfully added to the cart and clicks on proceed to checkout$")
    public void user_validates_that_the_product_is_successfully_added_to_the_cart_and_clicks_on_proceed_to_checkout() throws Throwable {
     
    	pv = new ProductValidation(driver);
    	pv.productValidation();
    	pv.clickProceedToCheckout();
    }

    @After
    public void endTest(Scenario scenario) {
     
    try {
    if (scenario.isFailed()) {
         final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
         scenario.embed(screenshot, "image/png");
       }
    } catch (WebDriverException e) {
    e.printStackTrace();
    }
    driver.manage().deleteAllCookies();
    driver.quit();
    }
    
}
