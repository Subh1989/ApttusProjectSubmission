package pageObjects;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductValidation extends TestPage{

	private boolean bElementsInitiated = false;
	public WebDriver driver;
	public ProductValidation(WebDriver driver) {
		
		this.driver = driver;
	   this.wait = new WebDriverWait(driver,60);

	}

	@FindBy(css = "[id = 'layer_cart']")
	private WebElement popup;
	
	@FindBy(xpath = "//div[contains(@class,'layer_cart_product')]/h2")
	private WebElement message;
	
	@FindBy(id = "layer_cart_product_title")
	private WebElement productMessage;
	
	@FindBy(id = "layer_cart_product_attributes")
	private WebElement colourMessage;
	
	@FindBy(xpath = "//div[@class='layer_cart_product_info']/div[1]/strong")
	private WebElement quantityMessage;
	
	@FindBy(id = "layer_cart_product_quantity")
	private WebElement quantityNumberMessage;
	
	@FindBy(xpath = "//div[@class='layer_cart_product_info']/div[2]/strong")
	private WebElement totalMessage;
	
	@FindBy(id = "layer_cart_product_price")
	private WebElement totalNumberMessage;
	
	public void productValidation() throws InterruptedException
	{
		initPageElements();
		wait.until(ExpectedConditions.visibilityOf(popup));
		String product = driver.findElement(By.xpath("//div[contains(@class,'layer_cart_product')]/h2")).getText();
		Assert.assertEquals(message.getText(), product.trim());
		Assert.assertEquals(productMessage.getText().trim(), "Faded Short Sleeve T-shirts");
		Assert.assertEquals(colourMessage.getText(), "Orange, S");
		Assert.assertEquals(quantityMessage.getText().trim(), "Quantity");
		Assert.assertEquals(quantityNumberMessage.getText().trim(), "1");
		Assert.assertEquals(totalMessage.getText().trim(), "Total");
		Assert.assertEquals(totalNumberMessage.getText().trim(), "$16.51");
	}
	

	protected void initPageElements() {
		if (!bElementsInitiated) {
			PageFactory.initElements(driver, this);
			bElementsInitiated = true;
		}
	}
	
}
