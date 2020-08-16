package pageObjects;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends TestPage{

	private boolean bElementsInitiated = false;
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	   this.wait = new WebDriverWait(driver,60);

	}

	
	@FindBy(css = "[title*='Log in']")
	private  WebElement loginButton;
	
	@FindBy(id = "email")
	private  WebElement userName;
	
	@FindBy(id = "passwd")
	private  WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private  WebElement signIn;
	
	@FindBy(css = "[id='center_column'] h1")
	private  WebElement pageValidate;
	

	public void validateLoginPage()
	{
		initPageElements();
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		Assert.assertTrue(loginButton.isDisplayed());
		
	}
	
	public void clickLoginPage()
	{
		initPageElements();
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
	}
	
	public void userDetails(String username, String Password)
	{
		initPageElements();
		wait.until(ExpectedConditions.elementToBeClickable(userName));
		userName.sendKeys(username);
		password.sendKeys(Password);
		signIn.click();
	}
	
	public void validatePageAfterLogin()
	{
		initPageElements();
		Assert.assertTrue(pageValidate.isDisplayed());
	}
	

	protected void initPageElements() {
		if (!bElementsInitiated) {
			PageFactory.initElements(driver, this);
			bElementsInitiated = true;
		}
	}
	
}
