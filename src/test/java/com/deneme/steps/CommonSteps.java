package com.deneme.steps;

import com.deneme.pages.CommonPageElements;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class CommonSteps {
    CommonPageElements commonPageElements;

    @Step("#actor clicks save")
    public void actorClicksSave() {
        commonPageElements.clickSave();
    }

    @Step("#actor ensures that element with a text {0} is displayed")
    public void actorEnsuresThatTextIsDisplayed(String text) {
        assertThat(commonPageElements.findElementsByText(text).size(), greaterThan(0));
        assertThat(commonPageElements.findElementsByText(text).get(0).isDisplayed(), is(true));

}}
