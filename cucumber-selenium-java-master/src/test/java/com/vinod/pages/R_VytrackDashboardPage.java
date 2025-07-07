package com.vinod.pages;

import com.vinod.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class R_VytrackDashboardPage {

    public R_VytrackDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> allTopModules;

}
