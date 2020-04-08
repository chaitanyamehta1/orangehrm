package com.orangehrm.pages;
import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//dashboard page extends utility to use property of utility
public class DashboardPage extends Utility {
    //below variables stored locators
    By adminFeature = By.xpath("//b[contains(text(),'Admin')]");
    By add = By.id("btnAdd");

    //below methods created for each element and doing action on each element
    public void clickOnAdminFeature() {
        clickOnElement(adminFeature);
    }

    public void clickOnAddButton() {
        clickOnElement(add);
    }
}