package tek.capstone.framwork.config;

import org.openqa.selenium.WebDriver;
public interface Browser {
    
    WebDriver openBrowser(String url);
}
