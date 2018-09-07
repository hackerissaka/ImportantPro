Feature: Amazon Search Feature
Using this Feature user can search vital information 

@execute
Scenario: User wants to search information about 'Redmi 5 (Gold, 32GB)' by entering valid set of words
Given User is on amazon home page
When User search for 'redmi note 5 pro mobile phones'
Then All the link with 'redmi note 5 pro mobile phones' displayed and user get information on 'Redmi 5 (Gold, 32GB)' by clicking on link