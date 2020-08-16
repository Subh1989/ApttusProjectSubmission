package pageObjects;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends TestPage{

	private boolean bElementsInitiated = false;
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	   this.wait = new WebDriverWait(driver,60);

	}

	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[3]/a")
	private WebElement product;
	
	@FindBy(xpath = "//h5[@itemprop='name']/a")
	private WebElement displayProduct;
	
	@FindBy(css = "[class='product_img_link'] img")
	private WebElement itemSelect;
	
	@FindBy(xpath = "//p[@id='add_to_cart']/button/span")
	private WebElement addToCart;
	
	public void selectProduct()
	{
		initPageElements();
		product.click();
	}
	
	public void productDisplay()
	{
		initPageElements();
		Assert.assertTrue(displayProduct.isDisplayed());
	}
	
	public void clickProduct()
	{
		initPageElements();
		displayProduct.click();
	}
	
	public void clickAddtoCart()
	{
		initPageElements();
		addToCart.click();
	}
	
	
	protected void initPageElements() {
		if (!bElementsInitiated) {
			PageFactory.initElements(driver, this);
			bElementsInitiated = true;
		}
	}
	
}
