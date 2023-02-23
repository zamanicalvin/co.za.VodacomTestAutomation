@VodacomTestAutomation
Feature: Navigate Vodacom website
  @VodacomNavigation
  Scenario Outline: Navigate Latest Promotions and Online Exclusive Deals
    Given Open the browser and launch a vodacom website and validate that the page is loaded
    And Select the Shop menu item under the Latest Promotions and click Online Exclusive Deals
    And Click on See details for a specific device "<device>"
    Then Validate that the Deals details screen has been loaded with correct device as per your input
    And Add a validation point for the deal price Contract duration and Available online fields
    And Click Get this deal button and validate that the Order summary screen has been loaded
    Then Validate the Device Plan and Contract cover fields

    Examples:
      | device |
      | iPhone |