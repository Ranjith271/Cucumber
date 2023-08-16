Feature: Hotel Booking In Adactin Application

Scenario: user Login In Adactin Application
  Given user Launch The Web Application
  When user Enter The Username In Username Field
  And user Enter The Password In password Field
  Then user Click The Login Button and Navigates ToSearch Hotel Page
  
Scenario: New User Registration Form 
  When user Select The Location 
  And user Select The Room Type
  And user Select The Number of Rooms
  And user Select The Check In Date
  And user Select The Check Out Date
  And user Select Adults per Room
  And user Select Childrens Per Room 
  Then User Click The Search Button and Navigates To Select Hotel Page
  
Scenario: New User Select Hotel Form
    When user Select Hotel 
    Then user Click Contiune Button and Navigates To Select The Book A Hotel Page

Scenario:  New User Book A Hotel Form 
  When user Enter Firstname In Firstname Field
  And user Enter Lastname In Lastname Field
  And user Enter Billing Addresss In Billing Address Field
  And user Enter  Credit Card No In Credit Card No Field
  And user Enter Credit Card Type In Credit Card No Field
  And user Enter Expriy Date In Select Month and Select Year
  And user Enter CCV Number In CVV Number Field
  Then Click Book Now Button and  Navigates To Booking Confirmation Page
  
