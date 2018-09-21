
Feature: MCT Testing
	As a User of MCT Website 
	
Scenario: Test Registration 
	Given I Go to MCT Website 
	And I Start the Signup Process
	When I Enter All Registration Information 
	Then I see My First and last Name 
	
 Scenario: Test Login 
 	Given I Go to MCT Website 
	And I Start the Login Process
		And I Complete Login as a SampleUser    
#	Then I see MY First and last Name 
	
