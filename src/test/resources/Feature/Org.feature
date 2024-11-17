
@tag
Feature: Drop down of Organisation no
  I want to use this template for my feature file

  @tag1
  Scenario: DropDown Scenario 
    Given launch the browser and navigate the appliaction with url "http://localhost:8888/"
    And   login application with user name "admin" and password "admin"
    Then  Click on Organisation 
    And   perform dropdown and select Billing city
     And   logout the application

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
