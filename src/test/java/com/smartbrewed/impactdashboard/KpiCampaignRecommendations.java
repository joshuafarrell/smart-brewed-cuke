package com.smartbrewed.impactdashboard;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;

public class KpiCampaignRecommendations implements En {
    public KpiCampaignRecommendations(){

        Given("^I am a campaign manager$", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new PendingException();
            Assert.assertTrue(true);
        });

        Given("^I provide my contact information$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^my budget is \"([^\"]*)\"$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^my target KPI is \"([^\"]*)\"$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^my vertical category is \"([^\"]*)\"$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^I request campaign recommendations$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^I receive a recommendation for \"([^\"]*)\" program with options:$", (String arg1, DataTable arg2) -> {
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
            // E,K,V must be a scalar (String, Integer, Date, enum etc)
            throw new PendingException();
        });

        Then("^I receive a recommendation for \"([^\"]*)\" program$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}