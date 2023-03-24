package tek.capstone.framwork.steps;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import tek.capstone.framwork.page.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;
public class HomeSteps extends CommonUtility {
		POMFactory factory = new POMFactory();
		@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");
		}
	@When ("User click on All section")
	public void userclickonAll ()
	{
	click(factory.homePage().allbutton);
		logger.info("User click on All section");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void verifyShopByDepartmentOptions(DataTable dataTable) {
	    List<List <String>> expectedOptions = dataTable.asLists(String.class);
	    	    for(int i=0;i<expectedOptions.get(0).size();i++)
	    	 for (WebElement option : factory.homePage().sideBar)
	    	 {
	    	if (option.getText().equals(expectedOptions.get(0).get(i)))
         {
	 
	      Assert.assertTrue(option.isDisplayed());
	      logger.info(option.getText()+ "options is present");
	    }
	   
	    
	} 
	    
	}
	@And("User on {string}")
	public void userOnDepartment(String department) {
		List<WebElement> dept = factory.homePage().sideBar;
		for (WebElement element : dept) {
			if (element.getText().equals(department)) {
				element.click();
				break;
				}}}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> departmentSection = dataTable.asLists(String.class);

		List<WebElement> dept = factory.homePage().sideBar;
		for (int i = 0; i < departmentSection.get(0).size(); i++) {
			for (WebElement element: dept) {
				if(element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText()+"The items is present");
				}
				
			}
			
		}
	
	}
	
@And ("User change category to {string}")
public void changecategorytoelectriWithDataTable(String smart)
{
	
selectByVisibleText(factory.homePage().samarthome,smart);
Assert.assertTrue(isElementDisplayed(factory.homePage().samarthome));
	logger.info("category changed");
}
@And ("User search for an item {string}")
public void usersearshforiteme(String string) {
	
	sendText(factory.homePage().searshinput,string );
}
@And ("User click on Search icon")
public void userclickonsearshbtn()
{
	click(factory.homePage().searshbtn);
}
@And ("User click on item")
public void userclickonitem() {
	click(factory.homePage().icon);
}
@And ("User then select quantity {string}")

	public void userselectquantity(String quantity) {
	   // factory.homePage().qte.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    selectByValue(factory.homePage().qte, quantity);
	}

@And ("User then click add to Cart button")
public void userclickoncarte()
{
	click(factory.homePage().addtocarte);
}
@Then ("The cart icon quantity should change to {int}")
public void carteiconqte(int qttt)
{  
	
	String actualcartqte = factory.homePage().carteqte.getText();
     int Expectedqte=qttt;
     Assert.assertEquals(String.valueOf(Expectedqte), actualcartqte);
    		 logger.info("cart icon quantity ");
    		 }
@And ("User click on Cart option")
public void userclickoncarteop ()
{
	click(factory.homePage().carte);
	logger.info("User clicked on Cart option");
}
@And ("User click on Proceed to Checkout button")
public void userclickonchekeout()
{
	click(factory.homePage().checkout);
}
@And ("User click Add a new address link for shipping address")
public void userclickonaddaddreslink()
{
	click (factory.homePage().addadressfcheckout);
}
@And ("User fill new address form with below information")
public void userfillnewaddressshiping(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	waitTillPresence(factory.retailAccount().addresspage);
	selectByVisibleText(factory.homePage().country,data.get(0).get("country"));
	sendText(factory.homePage().fullname,data.get(0).get("fullName"));
	sendText(factory.homePage().addressphone,data.get(0).get("phoneNumber"));
	sendText(factory.homePage().streetaddress,data.get(0).get("streetAddress"));
	sendText(factory.homePage().appartnumber,data.get(0).get("apt"));
	sendText(factory.homePage().city,data.get(0).get("city"));
	selectByVisibleText(factory.homePage().state,data.get(0).get("state"));
	sendText(factory.homePage().zipcode,data.get(0).get("zipCode"));
	logger.info("user fill new address");
}
@And ("User click Add Your Address button")
public void userclickonaddressbtn() {
	waitTillClickable(factory.homePage().addaddressbtn);
	click(factory.homePage().addaddressbtn);
	logger.info("user clicked on add your address button");
}
@And ("User click Add a credit card or Debit Card for Payment method")
public void userclickonaddcard()
{
	waitTillClickable(factory.homePage().addpaymenbtn);
	click(factory.homePage().addpaymenbtn);
	logger.info("User added the card");
}
@And ("User fill card information")
public void userfilldebit(DataTable dataTable)
{
	List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	sendText(factory.homePage().cardnumberinput, data.get(0).get("cardNumber"));
	sendText(factory.homePage().nameoncard,data.get(0).get("nameOnCard"));
	selectByValue(factory.homePage().expirationmonth,data.get(0).get("expirationMonth"));
	selectByVisibleText(factory.homePage().expirationyear,data.get(0).get("expirationYear"));
	sendText(factory.homePage().securitycode,data.get(0).get("securityCode"));
	logger.info("user filled card informations");
}
@And ("User click on: Add your card button")
public void userclickonpaybtn()
{
	waitTillClickable(factory.homePage().addcardbtn);
	click(factory.homePage().addcardbtn);
}
@And ("User click on Place Your Order")
public void userclickonpalceorder()
{
	waitTillClickable(factory.homePage().placeOrderBtn);
	click(factory.homePage().placeOrderBtn);
}
@Then ("a message should be displayed {string}")
public void orderplaced(String string)
{
	WebElement message = waitTillPresence(factory.homePage().orderpaced);
	Assert.assertTrue(isElementDisplayed(factory.homePage().orderpaced));
	String actualvalue =message.getText();
	Assert.assertEquals(string, actualvalue);
	Assert.assertTrue(actualvalue.equals(string));
	logger.info("Order Placed Successfully");
}
@And ("User change the category to {string}")
public void changecategorytoelectri(String Electronic)
{
selectByVisibleText(factory.homePage().samarthome,Electronic);
Assert.assertTrue(isElementDisplayed(factory.homePage().samarthome));
	logger.info("category changed to Electronics");
}
@And ("User search for the item {string}")
public void usersearshforitem(String string) {
	sendText(factory.homePage().searshinput,string );
}
@And ("User click on item Apax")
public void userclickonitemAppax() {
	click(factory.homePage().apex);
}
@And ("User select the quantity {int}")
public void selectquantityto(int qte)
{
	selectByIndex(factory.homePage().qte,qte);
	logger.info("quantity changed to 5");
}
@Then ("The quantity should change to {int}")
public void carteIconqteChange(int qtte)
{    String actualcartqte = factory.homePage().carteqte.getText();
     int Expectedqte=qtte;
     Assert.assertEquals(String.valueOf(Expectedqte), actualcartqte);
    		 logger.info("cart icon quantity ");
    		 }
@And("User click on Place Your Order Button")
public void userClickPlaceOrder() {
    
        WebElement placeOrderBtn = factory.homePage().placeOrderBtn;
        if (!placeOrderBtn.isEnabled()) {
            logger.info("Place Your Order button is disabled as expected");
           
         
    }

}

@Then("User should remain on the Checkout page")
public void verifyRemainOnCheckoutPage() {
    Assert.assertTrue(isElementDisplayed(factory.homePage().placeOrderBtn));
    logger.info("User remained on the Checkout page");
   
    
}


}