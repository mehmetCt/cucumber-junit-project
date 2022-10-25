package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }


    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {

        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }


    @Then("user sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
     String expectedTitle = "apple - Google Search";
     String actualTitle = Driver.getDriver().getTitle();

     Assert.assertEquals("Title verification is failed!",expectedTitle,actualTitle);
    }


    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String searchkeyword) {

        googleSearchPage.searchBox.sendKeys(searchkeyword + Keys.ENTER);

    }

    @Then("user sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String string) {


    }

}
