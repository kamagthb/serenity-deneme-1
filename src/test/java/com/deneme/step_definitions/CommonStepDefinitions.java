package com.deneme.step_definitions;

import com.deneme.steps.NavigationSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CommonStepDefinitions {

    @Steps
    NavigationSteps navigationSteps;


    @When("user navigates to {string}")
    public void user_navigates_to(String moduleName) {
        navigationSteps.actorNavigatesTo(moduleName);

    }

}
