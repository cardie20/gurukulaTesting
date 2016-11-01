#Author: rebeca.perez.lainez@gmail.com		
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Operation related with Branch

@tag1
Scenario: Create staffGiven User admin has been loged into the system
Given The user press Entities menu
# And  press "Create a new branch" button
When introduce Name mybranch
#	And introduce Id 2
Then A branch has been created
 

