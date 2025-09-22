package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FirstTest extends AppiumTest {

  @Test
  public void test() throws Exception {


      WebElement LoginButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
              ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeButton[@name='Register account']")));
      LoginButton.click();

        WebElement AcceptButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
              ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeButton[@name='I accept']")));
        AcceptButton.click();

         WebElement DependentButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
              ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")));
        DependentButton.click();

         WebElement NextButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
              ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeButton[@name='Next']")));
        NextButton.click();
        
        
  }
}
