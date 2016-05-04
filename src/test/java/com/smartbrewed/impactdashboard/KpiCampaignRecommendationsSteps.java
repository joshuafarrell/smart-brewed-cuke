package com.smartbrewed.impactdashboard;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class KpiCampaignRecommendationsSteps {
    @Given("^I am a campaign manager$")
    public void i_am_a_campaign_manager() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Assert.assertTrue(true);
    }

    @Given("^I provide my contact information$")
    public void i_provide_my_contact_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^my budget is \"([^\"]*)\"$")
    public void my_budget_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^my target KPI is \"([^\"]*)\"$")
    public void my_target_KPI_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^my vertical category is \"([^\"]*)\"$")
    public void my_vertical_category_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I request campaign recommendations$")
    public void i_request_campaign_recommendations() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I receive a recommendation for \"([^\"]*)\" program with options:$")
    public void i_receive_a_recommendation_for_program_with_options(String arg1, DataTable arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @Then("^I receive a recommendation for \"([^\"]*)\" program$")
    public void i_receive_a_recommendation_for_program(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}