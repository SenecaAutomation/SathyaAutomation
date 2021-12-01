package PageObjects;

import config.Config;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BasePageObj {
    private WebDriver driver=null;
    Config config=new Config();
    public void openCVLibJobPortal() throws IOException {
          driver.get(config.loadProperties().getProperty("url"));

    }
  public WebDriver getDriver() throws IOException {

        if(driver==null){
            driver=config.getDriver();

        }

        return driver;
        
        
  }


}
