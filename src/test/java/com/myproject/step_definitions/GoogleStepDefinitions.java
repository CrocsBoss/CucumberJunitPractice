package com.myproject.step_definitions;

import com.myproject.pages.GoogleSearchPage;
import com.myproject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("http://www.google.com");

    }

    @When("User searches for bugs")
    public void user_searches_for_bugs() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("bugs"+ Keys.ENTER);
    }

    @Then("User should see bugs in the title")
    public void user_should_see_bugs_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "bugs";
    }



}
