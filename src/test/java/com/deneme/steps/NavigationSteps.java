package com.deneme.steps;

import com.deneme.pages.NavigationPartOfThePage;
import net.thucydides.core.annotations.Step;

public class NavigationSteps {

    NavigationPartOfThePage navigationPartOfThePage;


    @Step("#actor navigates to {0}")
    public void actorNavigatesTo(String module) {
        navigationPartOfThePage.navigateTo(module);
    }

}
