package com.vinod.step_definitions;

import com.vinod.pages.R_VytrackLoginPage;
import com.vinod.utilities.BrowserUtils;
import com.vinod.utilities.ConfigurationReader;
import com.vinod.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class R_VytrackLogin_StepDefinitions {

    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        BrowserUtils.sleep(3);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";


        // we need to use explicit wait to handle conditions
        // implicit wait doesn't work for assertion because there is no findelement(s)/FindBy to look for
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.invisibilityOf(vytrackLoginPage.loadingBar));

        Assert.assertEquals("Title verification failed!",expectedTitle,actualTitle);


    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }


    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {

    vytrackLoginPage.loginDynamic(userType);

    }

}
