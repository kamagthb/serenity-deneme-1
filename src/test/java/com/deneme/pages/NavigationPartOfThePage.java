package com.deneme.pages;

import net.serenitybdd.core.pages.PageObject;

public class NavigationPartOfThePage extends PageObject {

    public void navigateTo(String moduleName){
        findBy("//*[text()='"+moduleName+"']/..").click();
    }
}
