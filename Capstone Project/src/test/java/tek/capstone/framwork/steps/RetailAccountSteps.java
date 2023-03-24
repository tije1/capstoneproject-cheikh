package tek.capstone.framwork.steps;

import java.util.List;

import java.util.Map;
import org.bouncycastle.asn1.cms.MetaData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framwork.page.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	private String name;
	private int numChildrenB ;
	private int numChildren ;
	
	POMFactory factory = new POMFactory();
	
	@When ("User click on Account option")
	public void Userclickonaccount() {  
		click(factory.retailAccount().accountlog);
		logger.info("User click on Account option");	
	}
	@And ("User update Name {string} and Phone {string}")
		public void userclickonAccountoption(String name , String phoneNumber )
		{
		 this.name=name;
		(factory.retailAccount().updatename).clear();
			sendText(factory.retailAccount().updatename,name);
		(factory.retailAccount().updatephone).clear();
			sendText(factory.retailAccount().updatephone, phoneNumber);
			
			logger.info("Updating Name and Phone Number");
			
		}
		
	
@And ("User click on Update button")
public void userClickOnUpdateButton()
{
	click(factory.retailAccount().updateaccount);
	logger.info("User click on Update button");
	
}
@Then ("User profile information should be updated")
public void userprofileUpdated()
{   
       waitTillPresence(factory.retailAccount().updatedinfromation);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().updatedinfromation));
	String actualMessage = factory.retailAccount().updatedinfromation.getText();
	String expectedMessage =name ;
	Assert.assertEquals(expectedMessage, actualMessage);
	logger.info("User profile information should be updated");
	
}

@And ("User enter below information")
public void userchangePassword(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	sendText(factory.retailAccount().previouspassword,data.get(0).get("previousPassword"));
	sendText(factory.retailAccount().newpassword,data.get(0).get("newPassword"));
	sendText(factory.retailAccount().confirmpassword,data.get(0).get("confirmPassword"));
	logger.info("User entre password infromation");
}
@And ("User click on Change Password button")
public void userClickOnChangePassword()
{
	click(factory.retailAccount().changepassword);
	logger.info("User clicked on Change Password button");
}
@Then("A message should be displayed {string}")
public void aMessageShouldBeDisplayed(String string)
{   
	WebElement messageElement = waitTillPresence(factory.retailAccount().messagepassword);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().messagepassword));
	String actualvalue =messageElement.getText();
	Assert.assertEquals(string, actualvalue);
	logger.info("Message displayed");
}
@And ("User click on Add a payment method link")
public void clickonAddpaymentLink()
{
click(factory.retailAccount().addpaymentlink);
logger.info("User clicked on payment link");
}
@And ("User fill Debit or credit card information")
public void userfilldebitorcreditcard(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	sendText(factory.retailAccount().cardnumberinput, data.get(0).get("cardNumber"));
	sendText(factory.retailAccount().nameoncard,data.get(0).get("nameOnCard"));
	selectByValue(factory.retailAccount().expirationmonth,data.get(0).get("expirationMonth"));
	selectByVisibleText(factory.retailAccount().expirationyear,data.get(0).get("expirationYear"));
	sendText(factory.retailAccount().securitycode,data.get(0).get("securityCode"));
	logger.info("user filled card informations");
	
}
@And ("User click on Add your card button")
public void userclickonaddcard()
{
	click(factory.retailAccount().addcardbtn);
	logger.info("User added the card");
}
@Then ("Message should be displayed {string}")
public void paymentmessage(String string)
{
	WebElement message = waitTillPresence(factory.retailAccount().paymentadded);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().paymentadded));
	String actualvalue =message.getText();
	Assert.assertEquals(string, actualvalue);
	logger.info("Paymenet added succefully");
}
@And ("User click on card")
public void userclickoncard()
{
	click(factory.retailAccount().clickoncard);
	logger.info("User clicked on card");
}
@And ("User click on Edit option of card section")
public void userclickonedit()
{
	click(factory.retailAccount().userclickonedit);
}
@And ("user edit information with below data")
public void editCardinfromations(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	waitTillPresence(factory.retailAccount().pageedit);
	factory.retailAccount().cardnumberinput.clear();
	sendText(factory.retailAccount().cardnumberinput, data.get(0).get("cardNumber"));
	factory.retailAccount().nameoncard.clear();
	sendText(factory.retailAccount().nameoncard,data.get(0).get("nameOnCard"));
	//factory.retailAccount().expirationmonth.clear();
	selectByValue(factory.retailAccount().expirationmonth,data.get(0).get("expirationMonth"));
	//factory.retailAccount().expirationyear.clear();
	selectByVisibleText(factory.retailAccount().expirationyear,data.get(0).get("expirationYear"));
	factory.retailAccount().securitycode.clear();
	sendText(factory.retailAccount().securitycode,data.get(0).get("securityCode"));
	logger.info("User edited card informations");
	
}
@And ("user click on Update Your Card button")
public void userclickonupdatebutton()
{
	click(factory.retailAccount().addcardbtn);
}
@Then ("update message should be displayed {string}")
public void updatecardmessagedisplayed(String string)
{
	WebElement message = waitTillPresence(factory.retailAccount().updatedcard);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().updatedcard));
	String actualvalue =message.getText();
	Assert.assertEquals(string, actualvalue);
	logger.info("Card updated succefully");
}
@And ("User click on remove option of card section")
public void userclickonremoveoption()
{
	click(factory.retailAccount().removecard);
	logger.info("user clicked on remove button");
}
@Then ("payment details should be removed")
public void paymentremoved()
{
	waitTillPresence(factory.retailAccount().emptypageaftercardremoval);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().emptypageaftercardremoval));
	logger.info("payment removed");
}
@And ("User click on Add address option")
public void userclickonaddress()
{
	click(factory.retailAccount().addaddress);
	logger.info("user clicked on add address");
}
@And ("user fill new address form with below information")
public void userfillnewaddress(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	waitTillPresence(factory.retailAccount().addresspage);
	selectByVisibleText(factory.retailAccount().country,data.get(0).get("country"));
	sendText(factory.retailAccount().fullname,data.get(0).get("fullName"));
	sendText(factory.retailAccount().addressphone,data.get(0).get("phoneNumber"));
	sendText(factory.retailAccount().streetaddress,data.get(0).get("streetAddress"));
	sendText(factory.retailAccount().appartnumber,data.get(0).get("apt"));
	sendText(factory.retailAccount().city,data.get(0).get("city"));
	selectByVisibleText(factory.retailAccount().state,data.get(0).get("state"));
	sendText(factory.retailAccount().zipcode,data.get(0).get("zipCode"));
	logger.info("user fill new address");
}
@And ("User click on Add Your Address button")
		public void userclickonaddaddresbutton()
		{
	click(factory.retailAccount().addaddressbtn);
	logger.info("user clicked on add your address button");
		}

@Then ("after added the address a message should be displayed {string}")
public void addressmessageshouldbedisplayed(String string)
{
	WebElement message = waitTillPresence(factory.retailAccount().addressadded);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().addressadded));
	String actualvalue =message.getText();
	Assert.assertEquals(string, actualvalue);
	logger.info("Address Added Successfully");
}
@And ("User click on edit address option")
public void userclickoneditaddress ()
{
	click(factory.retailAccount().editaddress);
	logger.info("user clcicked on edit address");
}
@And ("user edit the address with below informations")
public void userfillneweditedaddress(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	waitTillPresence(factory.retailAccount().addresspage);
	selectByVisibleText(factory.retailAccount().country,data.get(0).get("country"));
	clearandsendText(factory.retailAccount().fullname,data.get(0).get("fullName"));
	clearandsendText(factory.retailAccount().addressphone,data.get(0).get("phoneNumber"));
	clearandsendText(factory.retailAccount().streetaddress,data.get(0).get("streetAddress"));
	clearandsendText(factory.retailAccount().appartnumber,data.get(0).get("apt"));
	clearandsendText(factory.retailAccount().city,data.get(0).get("city"));
	selectByVisibleText(factory.retailAccount().state,data.get(0).get("state"));
	clearandsendText(factory.retailAccount().zipcode,data.get(0).get("zipCode"));
	logger.info("user fill new address");
}
@And ("User click update Your Address button")
public void userclickoneditaddresbutton()
{
click(factory.retailAccount().addaddressbtn);
logger.info("user clicked on edit address button");
}
@Then ("a message with {string} should be displayed")
public void updateadressmessageshouldbedisplayed(String string)
{
	WebElement message = waitTillPresence(factory.retailAccount().updateaddresssucess);
	Assert.assertTrue(isElementDisplayed(factory.retailAccount().updateaddresssucess));
	String actualvalue =message.getText();
	Assert.assertEquals(string, actualvalue);
	logger.info("Address Updated Successfully");
}
@And("User click on remove option of Address section")
public void userclickonremoveaddress()
{
	 numChildren = 0 ;
    for (WebElement parentElement : factory.retailAccount().parentElement) {
        List<WebElement> childElements = parentElement.findElements(By.xpath("./*"));
        numChildrenB += childElements.size();
       
    } 
    logger.info("User clicked on remove button"+numChildrenB);
    numChildren=numChildrenB;
    
        click(factory.retailAccount().removeAdress);
        numChildren--;
        
        logger.info("User clicked on remove button"+numChildren);
   
        
    
    
}

@Then("Address details should be removed")
public void addressdetailshouldberemoved()
{
   if (numChildren+1==numChildrenB)
   {
        
        logger.info("Address details have been successfully removed.");
   
}
   else {
	   
	   throw new AssertionError("Address details have not been removed");
	   
   }
}}

