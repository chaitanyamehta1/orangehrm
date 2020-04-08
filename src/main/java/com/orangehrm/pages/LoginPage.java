package com.orangehrm.pages;
import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//login class extends properties for Utility class
public class LoginPage extends Utility {
    //below variables stored locators
    By userNameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By clickOnLoginButton = By.id("btnLogin");
    By welcomeAdminText = By.id("welcome");

    //below methods created for each element and doing action on each element
    public void setUserNameField() {
        sendTextToElement(userNameField, "Admin");
    }

    //below methods created for each element and doing action on each element
    public void setPasswordField() {
        sendTextToElement(passwordField, "admin123");
    }

    public void setClickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    public String getWelcomeAdminText() {
        return getTextFromElement(welcomeAdminText);
    }


}