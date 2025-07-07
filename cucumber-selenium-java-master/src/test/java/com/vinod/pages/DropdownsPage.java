package com.vinod.pages;

import com.vinod.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPage {

    public DropdownsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "month")
    public WebElement monthDropdown;



}
