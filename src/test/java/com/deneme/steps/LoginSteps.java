package com.deneme.steps;

import com.deneme.pages.LoginPage;
import com.deneme.utils.ConfigurationReader;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;

    @Step("#actor is on the login page")
    public void openLoginPage() {
       String URL = ConfigurationReader.getProperty("base.url");
       loginPage.getDriver().get(URL);
    }


}
