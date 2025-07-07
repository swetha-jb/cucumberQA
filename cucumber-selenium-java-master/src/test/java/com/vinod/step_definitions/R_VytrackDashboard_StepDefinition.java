package com.vinod.step_definitions;

import com.vinod.pages.R_VytrackDashboardPage;
import com.vinod.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class R_VytrackDashboard_StepDefinition {

    R_VytrackDashboardPage vytrackDashboardPage = new R_VytrackDashboardPage();

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules ) {

        BrowserUtils.sleep(3);

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : vytrackDashboardPage.allTopModules) {

            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules,actualModules);

    }
}
