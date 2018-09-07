Feature: Equipment Tracking System

Scenario: User is trying to signin Equipment Tracking System using Invalid Username and password
Given user is on equipment tracking system application login page
When User enter invalid user credentials
Then 'Incorrect username or password.' Message will display

Scenario: User is trying to signin 'Equipment Tracking System' using Valid Username and password
Given user is on equipment tracking system application login page
When User enters the valid user credentials
Then User will be able to access on his 'Equipment Tracking System' account

Scenario: Browsing application Scenario
When User is logged in and does not have admin rights
Then display query by field 
And query all equipments options

Scenario: When regular user wants to view all equipments
When regular user clicks on view all equipments button
Then display a table containing equipment details like equipment tag, quantity of equipment, seq no, location of equipment, user id and equipment type

Scenario: When regular user selects query by value
When regular user clicks on get list
Then regular user can get the list using equipment_tag or sequence_number or machine_id or location or user_id

Scenario: Admin login
When admin is logged in
Then admin can do Allocate, update, move and list of the equipment

Scenario: Admin selects allocate
Given admin selects allocate
When admin location and equipment location are same
Then admin can get equipment_tag, set the user_id for equipment table, update equipment_status

Scenario: When admin tries to update retired equipment
Given Admin is on his homepage and clicks on update single equipment
When Admin enters the equipment primary key and clicks on submit
And the equipment has the same location as that of the user who is logged in
And If the equipment has been retired 
Then allow admin to only update the comments

Scenario: When admin wants to update single equipment which is in stock
Given Admin is on his homepage and clicks on update single equipment
When Admin enters the equipment primary key and clicks on submit
And If the equipment has status in stock 
And is not retired 
And the equipment has the same location as that of the user who is logged in 
Then allow admin to update the following fields Purchase Method, Seq Number, cost center, location, audit indicator(yes/no),audit date, comments,stock location
And default fields should be user id, dept id,install date to null and useStatus to inStock 

Scenario: When admin wants to update single equipment which is in use
Given Admin is on his homepage and clicks on update single equipment
When Admin enters the equipment primary key and clicks on submit
And If the equipment has status in use 
And is not retired 
And the equipment has the same location as that of the user who is logged in 
Then allow admin to update the following fields Purchase Method, Seq Number, userid, deptid, cost center, location, audit indicator(yes/no),audit date, comments
And default fields useStatus to inUse 

Scenario: When admin user wants to view all equipments
Given admin user is logged in
When admin user clicks on view all equipments button
Then display a table containing equipment details like equipment tag, quantity of equipment, seq no, location of equipment, user id and equipment type


Scenario: Admin selects move
When admin location and equipment location are same
Then admin can get the user_id, equipment_tag, update equipment_status

Scenario: Admin selects query by value
When admin clicks on get list
Then admin can get the list using equipment_tag or sequence_number or machine_id or location or user_id