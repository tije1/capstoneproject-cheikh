package tek.capstone.framwork.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.framwork.utilities.CommonUtility;
public class BaseUITest extends CommonUtility {
    @Before
    public void setupTests() {
        super.setupBrowser();
    }
    @AfterStep
    public void afterStep(Scenario scenario) {
        byte[] screenshot = takeScreenShotAsBytes();
        scenario.attach(screenshot, "image/png", "Screenshot after step");
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