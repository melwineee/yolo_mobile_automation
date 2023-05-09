package com.browserstack.run_first_test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class FirstTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {

    driver.get("https://www.amazon.in/");

        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 60).until(

                ExpectedConditions.elementToBeClickable(new By.ByXPath("//android.widget.EditText[@resource-id='nav-search-keywords']")));
        searchElement.sendKeys("Apple iPhone 14 Pro");


        driver.findElement(By.xpath("//android.widget.Button[@text='Go']")).click();


        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Apple iPhone 14 Pro\").instance(0))").click();


        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"to Cart\").instance(0))").click();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Go to Cart']")).click();

    }
}
