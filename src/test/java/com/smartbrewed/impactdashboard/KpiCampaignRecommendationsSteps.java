package com.smartbrewed.impactdashboard;


import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;

import com.smartbrewed.utils.CustomDriver;
import com.smartbrewed.utils.WebDriverManager;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import com.smartbrewed.page.blogher.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.sun.imageio.plugins.jpeg.JPEG.version;

public class KpiCampaignRecommendationsSteps implements SauceOnDemandSessionIdProvider {
    public static final SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication();
    private static final Logger LOGGER = LogManager.getLogger(KpiCampaignRecommendationsSteps.class);
    protected WebDriver driver;
    protected String name;

    private ThreadLocal<String> sessionId = new ThreadLocal<String>();

    @Given("^I am a campaign manager$")
    public void i_am_a_campaign_manager() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        name = "Hello World!";

        if (true) {
            LOGGER.info("Creating a local driver.");

            driver = CustomDriver.createLocalDriver("firefox");
        } else {
            LOGGER.info("Creating a SauceLabs driver");

            //driver = CustomDriver.createSLDriver(browser, version, os, name, authentication);
        }

        WebDriverManager.setWebDriver(driver);

        sessionId.set(((RemoteWebDriver) driver).getSessionId().toString());

        LOGGER.info(name + " - Thread: " + Thread.currentThread().getId());

        LOGGER.info(name + " - Driver: " + driver.hashCode());

        driver.manage().window().maximize();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.getDivMiddleAd2().click();
        Assert.assertTrue(true);
    }

    @Given("^I provide my contact information$")
    public void i_provide_my_contact_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

    @Given("^my budget is \"([^\"]*)\"$")
    public void my_budget_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^my target KPI is \"([^\"]*)\"$")
    public void my_target_KPI_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

    @Given("^my vertical category is \"([^\"]*)\"$")
    public void my_vertical_category_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

    @When("^I request campaign recommendations$")
    public void i_request_campaign_recommendations() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

    @Then("^I receive a recommendation for \"([^\"]*)\" program with options:$")
    public void i_receive_a_recommendation_for_program_with_options(String arg1, DataTable arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        Assert.assertTrue(true);
    }

    @Then("^I receive a recommendation for \"([^\"]*)\" program$")
    public void i_receive_a_recommendation_for_program(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }

    @Override
    public String getSessionId() {
        return sessionId.get();
    }
}