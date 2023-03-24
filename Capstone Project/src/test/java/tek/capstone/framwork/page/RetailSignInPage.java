package tek.capstone.framwork.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framwork.base.BaseSetup;




public class RetailSignInPage extends BaseSetup{

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy (xpath="//a[@id='signinLink']")
	public WebElement signInButton;
	@FindBy (id="email")
	public WebElement emailfield;
	@FindBy (id="password")
	public WebElement passwordfield;
	@FindBy (xpath="//button[@id='loginBtn']")
	public WebElement loginButon;
	@FindBy (xpath="//a[@id='accountLink']")
	public WebElement accountlog;
	
	@FindBy (id="newAccountBtn")
    public WebElement createaccoutbutton;
	@FindBy (id="nameInput")
	public WebElement namefield;
	@FindBy (id="emailInput")
	public WebElement addemailfield;
	@FindBy (id="passwordInput")
	public WebElement addpaasword;
	@FindBy (id="confirmPasswordInput")
	public WebElement confirmpassword;
	@FindBy (id="signupBtn")
	public WebElement signupbtn;
	@FindBy (xpath="//img[@id='profileImage']")
	public WebElement accountimage;
}
