package com.vinod.step_definitions.android;

import com.vinod.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Google_StepDefinations {
    WebDriver driver = Driver.getDriver();

    public Google_StepDefinations() {
    }

    @Given("I launch {string} on {string}")
    public void iLaunchWebsite(String url, String platform) {
        driver.get(url);
    }

    @Then("I should see {string} in the title")
    public void iShouldSeeTitle(String expectedTitle) {
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }
}
