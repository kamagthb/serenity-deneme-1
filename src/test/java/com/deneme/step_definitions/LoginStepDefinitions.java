package com.deneme.step_definitions;

import com.deneme.steps.LoginSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("User logs in to page")
    public void userLogsInToPage() {
        loginSteps.openLoginPage();
    }
}
