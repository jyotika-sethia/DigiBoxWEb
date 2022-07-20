Feature: To create Folder inside folder in webpage

@CreateFolderIF

Scenario: To check if folder is uploaded inside folder
Given User login to the digi webpage
When User click on the existing folder
Then User click on add icon
Then User click on create folder option
Then User enter the name for folder
Then User click create  