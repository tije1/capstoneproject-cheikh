package tek.capstone.framwork.page;

import tek.capstone.framwork.base.BaseSetup;

public class POMFactory extends BaseSetup{
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage retailAccount;
	private RetailOrderPage retailOrder;
	public POMFactory() {
        this.homePage = new RetailHomePage();
        this.signInPage = new RetailSignInPage ();
        this.retailAccount =new RetailAccountPage();
        this.retailOrder = new RetailOrderPage(); 
	}
        public RetailHomePage homePage() {
            return this.homePage;
        }
        
        public RetailSignInPage signInPage() {
            return this.signInPage;
        }
        public RetailAccountPage retailAccount() {
        	return this.retailAccount;
        }
        public RetailOrderPage retailOrder ()
        {
        	return this.retailOrder;
        }
    }


