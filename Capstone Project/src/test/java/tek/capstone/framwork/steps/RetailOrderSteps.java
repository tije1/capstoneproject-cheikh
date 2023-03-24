package tek.capstone.framwork.steps;


import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.capstone.framwork.page.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@And ("User click on Orders section")
	public void userclickonordersection ()
	{
		click (factory.retailOrder().orderlink);
		logger.info("user clicked on order section");
	}
	@And ("User click on first order in list")
	public void userclickonfirstorder()
	{
		//if (factory.retailOrder().showdetail.getText().equalsIgnoreCase("Show Details")) {
		click(factory.retailOrder().showdetail);
	//}
		
	}
	@And("User click on Cancel The Order button")
	public void usercancelorder() {
	
	waitTillPresence(factory.retailOrder().cancelorder);
	click(factory.retailOrder().cancelorder);
	}
	@And ("User select cancelation Reason {string}")
	public void userselectreason (String string) {
		selectByVisibleText(factory.retailOrder().selectreason, string);
	}
	@And ("User click on Cancel Order button")
	public void userclickcancel ()
	{
		waitTillClickable(factory.retailOrder().cancelorderbttn);
		click(factory.retailOrder().cancelorderbttn);
	}
	@Then ("a cancelation message should be displayed {string}")
	public void cancellationmessagedisplayed(String string)
	{
		waitTillPresence(factory.retailOrder().ordercanceledmessage);
		Assert.assertEquals((factory.retailOrder().ordercanceledmessage).getText(),string);
	}
	@And ("User click on Return Items button")
	public void userclickonreturnitem()
	{
		click(factory.retailOrder().returnitem);
	}
	@And ("User select the Return Reason {string}")
	public void selectreturnreason(String string) {
		selectByVisibleText(factory.retailOrder().selectreason, string);
		
	}
	@And ("User select the drop off service {string}")
	public void selectdropoffservice(String string)
	{
		selectByVisibleText(factory.retailOrder().dropoff, string);
	}
	@And ("User click on Return Order button")
	public void clickonreturnbutton()
	{
		click(factory.retailOrder().returnorderbttn);
	}
	@Then ("a return message should be displayed {string}")
	public void returnsuccssfulmessage(String string ) {
		waitTillPresence(factory.retailOrder().returnwassuccfull);
		Assert.assertEquals((factory.retailOrder().returnwassuccfull).getText(),string);
		}
	@And ("User click on Review button")
	public void clickonreview()
	{
		click(factory.retailOrder().review);
	}
	@And ("User write Review headline {string} and {string}")
	public void writereview (String head, String description)
	{
		sendText(factory.retailOrder().headline, head);
		sendText(factory.retailOrder().description, description);
	}
	@And ("User click Add your Review button")
	public void addreview() {
		click(factory.retailOrder().addreview);
		
	}
	@Then ("a review message should be displayed {string}")
	public void reviewmessage (String string) {
		waitTillPresence(factory.retailOrder().messagereview);
		Assert.assertEquals((factory.retailOrder().messagereview).getText(),string);
		}
		
	}

