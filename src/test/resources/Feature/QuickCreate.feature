
@tag
Feature: Drop down QuickCreate
  I want to use this template for my feature file

  @tag1
  Scenario: DropDown Scenario 
    Given launch the browser and navigate the appliaction with url "http://localhost:8888/"
    And   login application with user name "admin" and password "admin"
    Then  Click on QuickCreate 
    And   perform dropdown and select New Asset
     And   logout the application