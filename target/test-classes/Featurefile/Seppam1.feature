
Feature: Seppam features
 Seppam First phase automation
Background: homepage
    Given login user
    Then enter the username
    And enter the password
    And enter submit button


   
   
    
   @Create
   Scenario: create task
   And click the createtask button
   And enter task 	heading
   And Select the project
   
   And Select the Priority
   And select the date
   And Enter the description
   Then Click create button
   
   @Subtask
Scenario: subtask
		Given click Tasktab
   And click start button and stop
   And Click view button
   
   
   @Chatbox
   Scenario: Chat box
   And enter the message and send
   And Add attachment
   
   @history
   Scenario: Timesheet
   Given Click the Timesheet tab
   And Select the Employee details
   And Choose from date to date
   And Click export button
   

   
   


   
