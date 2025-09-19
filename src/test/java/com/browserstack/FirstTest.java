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

//         // Handle iOS notification permission pop-up if present
//         try {
//                 WebElement allowButton = driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Allow' AND type == 'XCUIElementTypeButton'"));
//                 allowButton.click();
//                 System.out.println("Notification permission allowed");
//         } catch (Exception e) {
//                 System.out.println("Could not locate notification pop-up: " + e.getMessage());
//         }

//                 // Handle iOS location permission pop-up if present, with longer wait
//                 try {
//                         WebElement allowLocationButton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                                 ExpectedConditions.elementToBeClickable(
//                                         AppiumBy.iOSNsPredicateString("label == 'Allow While Using App' AND type == 'XCUIElementTypeButton'"))
//                         );
//                         allowLocationButton.click();
//                         System.out.println("Location permission allowed");
//                 } catch (Exception e) {
//                         System.out.println("Could not locate location pop-up: " + e.getMessage());
//                 }

//       WebElement Loginstarted = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//               ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Login\"]")));
//       Loginstarted.click();

//       WebElement EnterUsername = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//               ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")));
//       EnterUsername.sendKeys("5355443072");


//       WebElement EnterSSN = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//               ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")));
//       EnterSSN.sendKeys("3848");


//       WebElement SendCodeClick = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//               ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Send Code\"]")));
//       SendCodeClick.click();


//       WebElement EnterOtp = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//               ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"Acima Leasing\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton/XCUIElementTypeButton/XCUIElementTypeOther[2]/XCUIElementTypeButton/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")));
//       EnterOtp.sendKeys("678677");

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