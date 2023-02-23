package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

        @Given("Open the browser and launch a vodacom website and validate that the page is loaded$")
        public void open_the_Firefox_and_launch_the_application() throws Throwable
        {
            System.out.println("This Step open the Firefox and launch the application.");
        }
        @And("Select the Shop menu item under the Latest Promotions and click Online Exclusive Deals$")
        public void select_the_Shop_menu_item_under_the_Latest_Promotions_and_click_Online_Exclusive_Dealsn() throws Throwable
        {
            System.out.println("Select the Shop menu item under the Latest Promotions and click Online Exclusive Deals.");
        }

        @When("^Enter the Username and Password$")
        public void enter_the_Username_and_Password() throws Throwable
        {
            System.out.println("This step enter the Username and Password on the login page.");
        }

        @Then("^Reset the credential$")
        public void Reset_the_credential() throws Throwable
        {
            System.out.println("This step click on the Reset button.");
        }

    @And("Click on See details for a specific device {string}")
    public void clickOnSeeDetailsForASpecificDevice(String arg0) {
    }

    @Then("Validate that the Deals details screen has been loaded with correct device as per your input")
    public void validateThatTheDealsDetailsScreenHasBeenLoadedWithCorrectDeviceAsPerYourInput() {
        
    }

    @And("Add a validation point for the deal price Contract duration and Available online fields")
    public void addAValidationPointForTheDealPriceContractDurationAndAvailableOnlineFields() {
        
    }

    @And("Click Get this deal button and validate that the Order summary screen has been loaded")
    public void clickGetThisDealButtonAndValidateThatTheOrderSummaryScreenHasBeenLoaded() {
        
    }

    @Then("Validate the Device Plan and Contract cover fields")
    public void validateTheDevicePlanAndContractCoverFields() {
    }
}
