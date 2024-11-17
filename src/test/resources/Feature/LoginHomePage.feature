#Author: MANISH KUMAR

@tag
Feature: Login feature
  I want to use this template for my feature file

  #@tag1
  #Scenario: Login Scenario 
    #Given launch the browser and navigate the appliaction with url "http://localhost:8888/"
    #And   login application with user name "admin" and password "admin"
    #Then  validate home page with "Vtiger"
    #And   logout the application

  @tag2
  Scenario Outline: Title of your scenario outline
    Given launch the browser and navigate the appliaction with url <url>
    And   login application with user name <user> and password <pass>
    Then  validate home page with "Vtiger"
    And   logout the application

    Examples: 
      | url                       | user     |  pass    |
      | "http://localhost:8888/"  | "admin"  |  "admin" |
   
