package com.vinod.step_definitions.android;

import com.vinod.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Mobile_Web_Test_StepDefinations {
   // private static AppiumDriver driver;
   WebDriver driver = Driver.getDriver();

    @Given("I launch the mobile browser")
    public void iLaunchTheMobileBrowser() throws MalformedURLException {
        if (driver == null) {

            driver = (AppiumDriver) Driver.getDriver();
        }
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url) {
        driver.get(url);
    }

    @Then("the page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Page title mismatch!", expectedTitle, actualTitle);
    }

    @And("I enter {string} in the search box")
    public void iEnterInTheSearchBox(String searchText) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys(searchText);
    }

    @And("I press the search button")
    public void iPressTheSearchButton() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(Keys.ENTER);
    }

    @Then("I should see search results containing {string}")
    public void iShouldSeeSearchResultsContaining(String expectedText) {
        WebElement results = driver.findElement(By.xpath("//body"));
        Assert.assertTrue("Search results do not contain expected text!", results.getText().contains(expectedText));
    }

    @And("I enter {string} in the {string} field")
    public void iEnterInTheField(String value, String fieldName) {
        WebElement inputField = driver.findElement(By.name(fieldName));
        inputField.clear();
        inputField.sendKeys(value);
    }

    @And("I press the submit button")
    public void iPressTheSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
    }

    @Then("I should see a confirmation message")
    public void iShouldSeeAConfirmationMessage() {
        WebElement confirmationMessage = driver.findElement(By.xpath("//body"));
        Assert.assertTrue("Confirmation message not found!", confirmationMessage.getText().contains("Thank you"));
    }

    @And("I scroll down to {string}")
    public void iScrollDownTo(String sectionText) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'" + sectionText + "')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Then("I should see the section header {string}")
    public void iShouldSeeTheSectionHeader(String expectedHeader) {
        WebElement sectionHeader = driver.findElement(By.xpath("//*[contains(text(),'" + expectedHeader + "')]"));
        Assert.assertTrue("Section header not found!", sectionHeader.isDisplayed());
    }

    @And("I press the login button")
    public void iPressTheLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String expectedError) {
        WebElement errorMessage = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertEquals("Login error message mismatch!", expectedError, errorMessage.getText());
    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }

}
