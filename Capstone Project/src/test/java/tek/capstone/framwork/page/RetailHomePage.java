package tek.capstone.framwork.page;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framwork.base.BaseSetup;
public class RetailHomePage extends BaseSetup {
	 public RetailHomePage() {
	PageFactory.initElements(getDriver(), this);
	 }
		@FindBy(linkText = "TEKSCHOOL") 
	    public WebElement tekschoolLogo;
		@FindBy(xpath = "//*[@id=\"hamburgerBtn\"]/span")
		public WebElement allbutton;
		@FindBy (xpath="//div[@class='sidebar_content-item']//span")
		public List<WebElement> sideBar;
		@FindBy (xpath="//select[@id='search']")
		public WebElement samarthome;
		@FindBy (xpath="//input[@id='searchInput']")
		public WebElement searshinput;
		@FindBy(xpath="//button[@id='searchBtn']")
		public WebElement searshbtn;
		@FindBy(xpath="//img[@alt=\"Kasa Outdoor Smart Plug\"]")
		public WebElement icon;
		@FindBy(xpath="//select[@class='product__select']")
		public WebElement qte;
		@FindBy (xpath="//button[@id='addToCartBtn']")
		public WebElement addtocarte;
		@FindBy (xpath="//span[@id='cartQuantity']")
		public WebElement carteqte;
		@FindBy (xpath="//p[contains(text(),'Cart')]")
		public WebElement carte;
		@FindBy (xpath="//button[@id='proceedBtn']")
		public WebElement checkout;
		@FindBy (xpath="//button[@id='addAddressBtn']")
		public WebElement addadressfcheckout;
		@FindBy (xpath= "//select[@id='countryDropdown']")
		 public WebElement country;
		 @FindBy (xpath="//input[@id='fullNameInput']")
		 public WebElement fullname;
		 @FindBy (xpath="//input[@id='phoneNumberInput']")
		 public WebElement addressphone;
		 @FindBy (xpath ="//input[@id='streetInput']")
		 public WebElement streetaddress;
		 @FindBy (xpath="//input[@id='apartmentInput']")
		 public WebElement appartnumber;
		 @FindBy (xpath ="//input[@id='cityInput']")
		 public WebElement city;
		 @FindBy (xpath ="//div[@class='account__address-new-padding']//select[@class='account__address-new-dropdown']")
		public WebElement state;
		 @FindBy (xpath="//input[@id='zipCodeInput']")
		 public WebElement zipcode;
		 @FindBy (xpath ="//button[@id='addressBtn']")
		 public WebElement addaddressbtn;
		 @FindBy (xpath="//p[contains(text(),'Add a payment method')]")
		 public WebElement addpaymentlink;
		 
		 @FindBy (xpath="//input[@id='cardNumberInput']")
		 public WebElement cardnumberinput;
		 @FindBy(xpath="//input[@id='nameOnCardInput']")
		 public WebElement nameoncard;
		 @FindBy (xpath="//select[@id='expirationMonthInput']")
		 public WebElement expirationmonth;
		 @FindBy (xpath="//select[@id='expirationYearInput']")
		 public WebElement expirationyear;
		 @FindBy (xpath="//input[@id='securityCodeInput']")
		 public WebElement securitycode;
		 @FindBy (xpath="//button[@id='paymentSubmitBtn']")
		 public WebElement addcardbtn;
		 @FindBy (xpath="//div[contains(text(),'Payment Method added sucessfully')]")
		 public WebElement paymentadded;
		 @FindBy(xpath="//button[@id='addPaymentBtn']")
		 public WebElement addpaymenbtn;
		 @FindBy (xpath="//button[@id='placeOrderBtn']")
		 public WebElement placeOrderBtn;
		 
		 @FindBy (xpath="//div[contains(text(),'Order Placed Successfully')]")
		 public WebElement orderpaced;
		 @FindBy (xpath="//div[@class='products__layout']//img[@class='image' and @alt='Apex Legends - 1,000 Apex Coins']")
		 public WebElement apex;
		
}
