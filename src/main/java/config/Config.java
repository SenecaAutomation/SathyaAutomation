package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class Config {

   private WebDriver driver=null;

    public Properties loadProperties() throws IOException {
        FileInputStream fis = null;
        Properties prop = null;

        try {
            fis = new FileInputStream("resources/application.properties");
            prop = new Properties();
            prop.load(fis);
        } catch(Exception fnfe) {
            fnfe.printStackTrace();

        } finally {
            fis.close();
        }

  return prop;

    }

    public WebDriver getDriver() throws IOException {

        switch ( loadProperties().getProperty("browser").toLowerCase(Locale.ROOT)){

            case "chrome": System.setProperty("webdriver.chrome.driver","C:\\Users\\Satheesh\\Downloads\\Test-Automation\\Drivers\\chromedriver.exe");
                           driver=new ChromeDriver();
                          break;
            default:System.out.println("not find appropriate driver");
                       break;

        }
      return driver;
    }

}
