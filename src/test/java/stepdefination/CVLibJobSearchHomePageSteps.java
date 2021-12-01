package stepdefination;
import PageObjects.CVLibJobSearchHomePage;
import config.Config;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class CVLibJobSearchHomePageSteps extends Config {
    CVLibJobSearchHomePage jobSearchHomePage= new CVLibJobSearchHomePage();
          @Given("Job search application url")
        public void openJobSearchURL() throws InterruptedException, IOException {

              jobSearchHomePage.openJobSearchURL();
            Thread.sleep(2000);

        }

        @When("I click more options")
        public void clickMoreOpt() throws InterruptedException {
            jobSearchHomePage.clickMoreOpt();
        }

        @When("I Enter job details with {string},{string} and {string}")
        public void enterJobDetails(String keywords, String location, String distance) throws InterruptedException {


            jobSearchHomePage.enterKeywords(keywords);
            jobSearchHomePage.enterLocation(location);
            jobSearchHomePage.selectDistance(distance);


        }

        @When("I Fill {string} and {string}")
        public void fileSalMaxandSalMinDetails(String minSal, String maxSal) {

            jobSearchHomePage.enterSalaryMin(minSal);
            jobSearchHomePage.enterSalaryMax(maxSal);

        }

        @When("I Choose {string} and {string}")
        public void selectSalTypeAndJobType(String salType, String jobType) {

            jobSearchHomePage.selectSalaryType(salType);
            jobSearchHomePage.selectJobType(jobType);
        }



        @When("I Click on FIND JOBS button")
        public void clickfindJOBS() {

            jobSearchHomePage.clickfindJOBS();
        }

        @Then("Verify Search Results Page")
        public void verifySearchResults() throws IOException, InterruptedException{

          Thread.sleep(5000);


        }


    }



