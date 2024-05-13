Feature: Add Specific User
  @testcase1
  Scenario Outline: Create New user with Type Instructor
    Given User Fill "<Email>" And "<Password>"
    And Click on Administration tool from Sidebar Menu
    And Choose  Administration from Sidebar Menu
    And select the Segment
    And Click on Add Users
    And Add First Name And Last Name
    And Choose  Language
    And Enter Email
    And Set password
    And Select Role
    And Click on Save Button
    Then Check User Added Successfully
    Examples:
      | Email       | Password       |
      | Admin1Email | Admin1Password |

  @testcase2
  Scenario Outline: Search On  user with Type Instructor
    Given User Fill "<Email>" And "<Password>"
    And Click on Administration tool from Sidebar Menu
    And Choose  Administration from Sidebar Menu
    And select the Segment
    When Click On FilterBy
    And Search By Name Or Email
    And Search By ROLE
    Then Check User By Name Added Successfully
    Examples:
      | Email       | Password       |
      | Admin1Email | Admin1Password |


  @testcase3
  Scenario Outline: Open View Edit User Role Page
    Given User Fill "<Email>" And "<Password>"
    And Click on Administration tool from Sidebar Menu
    And Choose  Administration from Sidebar Menu
    And select the Segment
    When Click On FilterBy
    And Search By Name Or Email
    And Search By ROLE
    When Click On Three Dots Menu
    And View And Edit USER Page Opened
    And View Page Opened Successfully
    Then CHeck View Page Opened Successfully

    Examples:
      | Email       | Password       |
      | Admin1Email | Admin1Password |

  @testcase4
  Scenario Outline: Edit User Role By Add New Role
    Given User Fill "<Email>" And "<Password>"
    And Click on Administration tool from Sidebar Menu
    And Choose  Administration from Sidebar Menu
    And select the Segment
    When Click On FilterBy
    And Search By Name Or Email
    And Search By ROLE
    And Click On Three Dots Menu
    When View And Edit USER Page Opened
    And Add Another Role
    And Select Segment Name
    And Select Role Name
    And Save Edit User Role
    And select the Segment
    Then Check Add Co Instructor Rule
    Examples:
      | Email       | Password       |
      | Admin1Email | Admin1Password |





