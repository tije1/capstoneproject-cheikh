package tek.capstone.framwork.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framwork.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage ()
	{
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy (xpath="//a[@id='orderLink']")
			public WebElement orderlink;
	@FindBy (xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[18]")
	public List<WebElement> listorderdetail;
	@FindBy (xpath="(//p[@class='order__header-btn'])")
	public WebElement orderdetail;
	@FindBy (xpath="//button[@id='cancelBtn']")
	public WebElement cancelorder;
	@FindBy (xpath="//select[@id='reasonInput']")
	public WebElement selectreason;
	@FindBy (xpath ="//button[@id='orderSubmitBtn']")
	public WebElement cancelorderbttn;
	@FindBy (xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement ordercanceledmessage;
	@FindBy (xpath="//p[contains(text(),'Show Detail')]")
	public WebElement showdetail;
	@FindBy (xpath="//button[@id='returnBtn']")
	public WebElement returnitem;
	@FindBy (xpath="//select[@id='dropOffInput']")
	public WebElement dropoff;
	@FindBy (xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnorderbttn;
	@FindBy (xpath="//p[contains(text(),'Return was successfull')]")
	public WebElement returnwassuccfull;
	@FindBy (xpath="//button[@id='reviewBtn']")
	public WebElement review;
	@FindBy (xpath="//input[@id='headlineInput']")
	public WebElement headline;
	@FindBy (xpath="//textarea[@id='descriptionInput']")
	public WebElement description;
	@FindBy (xpath="//button[@id='reviewSubmitBtn']")
	public WebElement addreview;
	@FindBy (xpath="//div[contains(text(),'Your review was added successfully')]")
	public WebElement messagereview;
	
	
	
 
}
