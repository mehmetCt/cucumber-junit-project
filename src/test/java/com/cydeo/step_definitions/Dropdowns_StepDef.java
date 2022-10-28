package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdowns_StepDef {

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

//        Select select = new Select(dropdownsPage.monthDropdown);
//
//        List<WebElement> actualOptionsAsWebElement = select.getOptions();
//
//        List<String> actualOptionsAsString = new ArrayList<>();
//
//        for (WebElement each : actualOptionsAsWebElement) {
//            actualOptionsAsString.add(each.getText());
//        }

        // This utility method will return us List of String of given dropdown webElement
       List<String> actualOptionsAsString = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);

        //Assert will check the size of the list first. If it is matching it will check/verify content 1 by 1
        Assert.assertEquals(expectedMonths,actualOptionsAsString);

    }

}
