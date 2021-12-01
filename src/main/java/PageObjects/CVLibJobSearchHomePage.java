package PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class CVLibJobSearchHomePage extends BasePageObj {

    @FindBy(id = "keywords")
    WebElement searchkeywords;

    @FindBy(id = "location")
    WebElement locInput;

    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptBtn;

    @FindBy(id = "distance")
    WebElement choosedistance;

    @FindBy(id = "salarymin")
    WebElement txt_salarymin;

    @FindBy(id = "salarymax")
    WebElement salMaxInput;

    @FindBy(id = "salarytype")
    WebElement salType;

    @FindBy(id = "tempperm")
    WebElement jobtype;

    @FindBy(id = "hp-search-btn")
    WebElement indJobsBtn;

    @FindBy(xpath = "//body/div[4]/div")
    List<WebElement> autoSuggestDropDown;

    @FindBy(xpath = "//body/div[3]/div")
    List<WebElement> locaion_autosuggest;

    public void openJobSearchURL() throws IOException {
        openCVLibJobPortal();
    }


    public void enterKeywords(String keywords) throws InterruptedException {
        searchkeywords.sendKeys(keywords);
        // Thread.sleep(2000);

        for (WebElement option : autoSuggestDropDown) {

            if (option.getText().equalsIgnoreCase("Javascript Developer")) {

                option.click();
                break;
            }

            if (option.getText().equalsIgnoreCase("Java Developer")) {

                option.click();
                break;
            }

        }
    }

    public void enterLocation(String location) throws InterruptedException {

        for (int i = 0; i < location.length(); i++) {
            locInput.clear();

            locInput.sendKeys(location.substring(0, i + 1));
            locInput.sendKeys(Keys.ARROW_UP);

            Thread.sleep(500);

            try {

                if (getDriver().findElement(By.xpath("//*[contains(text() , '" + location + "')]")).isDisplayed()) {

                    getDriver().findElement(By.xpath("//*[contains(text() , '" + location + "')]")).click();
                    break;
                }
            } catch (Exception e) {

            }

        }

    }

    public void selectDistance(String distance) {

        Select miles = new Select(choosedistance);
        miles.selectByValue(distance);


    }

    public void clickMoreOpt() {
        moreSearchOptBtn.click();
    }

    public void enterSalaryMin(String salaryMin) {

        txt_salarymin.sendKeys(salaryMin);
    }

    public void enterSalaryMax(String salaryMax) {

        salMaxInput.sendKeys(salaryMax);
    }

    public void selectSalaryType(String salaryType) {

        Select selectSalaryType = new Select(salType);
        selectSalaryType.selectByValue(salaryType);

    }

    public void selectJobType(String jobType) {

        Select selectJobType = new Select(jobtype);
        selectJobType.selectByValue(jobType);

    }

    public void clickfindJOBS() {

        indJobsBtn.click();
    }
}