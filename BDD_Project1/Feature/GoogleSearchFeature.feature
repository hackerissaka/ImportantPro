Feature: Google Search Feature
Using this feature user can search very vital information

Scenario: User want to search information about 'Agile Methodology' by entering valid set of word
Given user is on google home page
When user search for 'Agile Methodology'
Then All page links to be display with 'Agile Methodology'