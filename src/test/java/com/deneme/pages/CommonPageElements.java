package com.deneme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonPageElements extends PageObject {

    @FindBy(xpath = "//*[text()='Save']/..")
    public WebElement saveButtonElement;


    public void clickSave() {
        waitFor(saveButtonElement).click();
    }

    public List<WebElement> findElementsByText(String text) {
        waitABit(2000);
        return getDriver().findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
    }
}
