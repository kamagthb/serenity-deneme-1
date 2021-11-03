package com.deneme.utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BrowserUtils {
    private WebDriver driver;

    public BrowserUtils(WebDriver driver) {
        this.driver = driver;
    }

    public Map<String, String> getCookies() {
        Set<Cookie> cookiesSet = driver.manage().getCookies();
        Map<String, String> cookiesMap = new HashMap<>();
        cookiesSet.forEach(p -> cookiesMap.put(p.getName(), p.getValue()));
        return cookiesMap;
    }

    public void switchToNewWindow(String oldWindowHandle) {
        Set<String> windows = driver.getWindowHandles();
        for (String w : windows) {
            if (!w.equals(oldWindowHandle)) {
                driver.switchTo().window(w);
                break;
            }
        }
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement e = wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(e)).click();
    }

    public void scrollDown(int y) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, " + y + ");");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void closeAllTabsExceptCurrent() {
        Set<String> windows = driver.getWindowHandles();
        if (windows.size() > 1) {
            String targetWindow = driver.getWindowHandle();
            for (String w : windows) {
                driver.switchTo().window(w);
                if (!driver.getWindowHandle().equals(targetWindow)) {
                    driver.close();
                }
            }
            driver.switchTo().window(targetWindow);
        }
    }
}
