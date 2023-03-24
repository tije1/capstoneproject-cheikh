package tek.capstone.framwork.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framwork.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
 @FindBy (xpath="//a[@id='accountLink']")
 public WebElement accountlog;
 @FindBy (xpath="//input[@id='nameInput']")
 public WebElement updatename;
 @FindBy (xpath="//input[@id='personalPhoneInput']")
 public WebElement updatephone;
 @FindBy (xpath="//button[@id='personalUpdateBtn']")
 public WebElement updateaccount;
 @FindBy(className = "account__information-username")
 public WebElement updatedinfromation;
 @FindBy (xpath="//input[@id='previousPasswordInput']")
 public WebElement previouspassword;
 @FindBy (xpath="//input[@id='newPasswordInput']")
 public WebElement newpassword;
 @FindBy (xpath="//input[@id='confirmPasswordInput']")
 public WebElement confirmpassword;
 @FindBy(xpath="//button[@id='credentialsSubmitBtn']")
 public WebElement changepassword;
 @FindBy (xpath="//div[contains(text(),'Password Updated Successfully')]")
 public WebElement messagepassword;
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
 @FindBy (xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
 public WebElement clickoncard;
 @FindBy (xpath="//button[contains(text(),'Edit')]")
 public WebElement userclickonedit;
 @FindBy (xpath="//div[contains(text(),'Payment Method updated Successfully')]")
 public WebElement updatedcard;
 @FindBy (xpath="//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]")
 public WebElement pageedit;
 
 @FindBy (xpath="//button[contains(text(),'remove')]")
 public WebElement removecard;
 @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")
 public WebElement emptypageaftercardremoval;
 @FindBy (xpath="//p[contains(text(),'Add Address')]")
 public WebElement addaddress;
 @FindBy (xpath="//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]") 
 public WebElement addresspage;
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
 @FindBy (xpath ="//div[contains(text(),'Address Added Successfully')]")
 public WebElement addressadded;
 @FindBy (xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/button[1]")
 public WebElement editaddress;
 @FindBy (xpath="//div[contains(text(),'Address Updated Successfully')]")
 public WebElement updateaddresssucess;
 @FindBy (xpath= "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/button[2]")
 public WebElement removeAdress;
 @FindBy (xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]")
 public WebElement pageaddress;
 @FindBy (xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]")
 public List<WebElement> parentElement;
 
}
