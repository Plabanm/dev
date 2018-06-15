package com.boots.bdd.stepDefs;

import com.boots.bdd.drivers.DriversFactory;
import com.boots.bdd.page_objects.HeaderPage;
import com.boots.bdd.page_objects.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefsRating {

    HeaderPage headerPage1 = new HeaderPage();
    ResultPage resultPage1 = new ResultPage();
    Scenario scenario;

    @Given("^when I am on the home page of Boots$")
    public void when_I_am_on_the_home_page_of_Boots() {

    }

    @When("^I search for a product$")
    public void i_search_for_a_product(){
        headerPage1.doSearch();
    }

    @When("^I select a filter by \"([^\"]*)\"$")
    public void i_select_a_filter_by(String rating){
        resultPage1.filterProductByStarRating(rating);
    }

    @Then("^I should see results filtered star ratings$")
    public void i_should_see_results_filtered_star_ratings() {

    }

    @Given("^hjhj$")
    public void hjhj() {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.com");
        new DriversFactory().embedScreenshot(scenario);
    }
}
