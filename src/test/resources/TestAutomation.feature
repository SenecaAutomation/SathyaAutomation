@JobSearchFeature
Feature: Job search

Background: 

  @JobSearch
  Scenario Outline: Validate job search results
    Given Job search application url
    Then I Enter job details with "<jobTitle>","<Loc>" and "<Dist>"
    Then I click more options
    Then I Fill "<MinSal>" and "<MaxSal>"
    And I Choose "<TypeOfSaL>" and "<TypeOfJob>"
    And I Click on FIND JOBS button
    Then Verify Search Results Page
  Examples:
    | jobTitle       | Loc    | Dist | MinSal | MaxSal | TypeOfSaL | TypeOfJob |
    | QA Automation  | London | 10   | 30     | 80     | weekly    | Permanent  |
    | API Automation | London | 21   | 4567   | 5432   | month     | Permanent |
