#Author: QA_testers 

@sprint1
Feature: Add different languages in qualifications
 
  Scenario: Admin navigates to add laguages and click on save
  Given user is logged with valid admin credentials
    And user navigate to Qualifications page
    And user add languages
    |Language1 | Language2 |
    |Urdu   | Dari  |
    Then user can see language is Displayed and "modifyDetailsSC"
     
    