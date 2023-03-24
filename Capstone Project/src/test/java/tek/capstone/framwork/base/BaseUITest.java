package tek.capstone.framwork.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.framwork.utilities.CommonUtility;
public class BaseUITest extends CommonUtility {
    @Before
    public void setupTests() {
        super.setupBrowser();
    }
    @After
    public void closeTests(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenShot = takeScreenShotAsBytes();
            scenario.attach(screenShot, "iamge/png", scenario.getName() + " scenario Failed");
        }
        super.quitBrowser();
    }
}