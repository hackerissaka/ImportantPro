Feature: Amazon Search Feature
Using this Feature user can search vital information 

Scenario: User wants to search information about 'Redmi 5 (Gold, 32GB)' by entering valid set of words
Given User is on amazon home page
When User search for 'redmi note 5 pro mobile phones'
Then All mobiles with link  to be display with 'redmi note 5 pro mobile phones'

Scenario: User wants to get information about 'Redmi 5 (Gold, 32GB)' by clicking on the link
Given User is on 'Amazon.in: redmi note 5 pro mobile phones - Smartphones / Smartphones & Basic Mobiles: Electronics' page
When User click on 'Redmi 5 (Gold, 32GB)'
Then All the information to be display with 'Redmi 5 (Gold, 32GB)' 