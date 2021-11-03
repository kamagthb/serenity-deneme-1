package com.deneme.pages;

import com.deneme.utils.ConfigurationReader;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

    @FindBy(css = "[formcontrolname='username']")
    private WebElement emailElement;

    @FindBy(css = "[formcontrolname='password']")
    private WebElement passwordElement;

    public void login(String email, String password){
        emailElement.sendKeys(email);
        passwordElement.sendKeys(password, Keys.ENTER);
    }


}
