@jojonomic
Feature: Jojonomic

  Scenario: Searching
    Given Open Webpage
    Then Search Apply for a number plate
    Then Click Find Locations

    Scenario Outline: Search Locations
    When Search "<locations>" on Suburb Locations
      Examples:
        | locations  |
        | Sydney 2000  |
        | Sydney Domestic Airport 2020 |



