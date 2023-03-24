package tek.capstone.framwork.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framwork.page.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;


public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	@When("User click on Sign in option")
	public void Userclickonsgnin()
	{
click(factory.signInPage().signInButton);
logger.info("User clicked on sign in option");
}
	@And("User enter email {string} and password {string}")
	public void userEntreEmailAndPassword(String email , String password)
	{ 
		sendText(factory.signInPage().emailfield,email);
	sendText(factory.signInPage().passwordfield,password);
	logger.info("User entred email and password");
		
	}
	@And("User click on login button")
	public void userShouldbeloggedIn ()
	{
		click(factory.signInPage().loginButon);
		logger.info("User clicked in Sgin In Button");
	}
	@Then("User should be logged in into Account")
	public void userloggedIn () {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountlog));
		logger.info("user is on account page");
		
	}
	@And("User click on Create New Account button")
	public void userCreateAccount () {
		click(factory.signInPage().createaccoutbutton);
		logger.info("user clicked on Create New Account button");
		}
	
	@And("User fill the signUp information with below data")
	public void userFillsihnUp (DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		sendText(factory.signInPage().namefield,data.get(0).get("name"));
		sendText(factory.signInPage().addemailfield,data.get(0).get("email"));
		sendText(factory.signInPage().addpaasword,data.get(0).get("password"));
		sendText(factory.signInPage().confirmpassword,data.get(0).get("confirmPassword"));
		logger.info("user filled the signUp informations");
		
	}
	@And("User click on SignUp button")
	public void userClickonSignUp()
	{
		click(factory.signInPage().signupbtn);
		logger.info("User Signed up");
		
		
	}
	@Then("User should be logged into account page")
	public void userShouldLogedinpage ()
	{
	Assert.assertTrue(isElementDisplayed(factory.signInPage().accountimage));
	logger.info("user is logged into account page");
		
}}