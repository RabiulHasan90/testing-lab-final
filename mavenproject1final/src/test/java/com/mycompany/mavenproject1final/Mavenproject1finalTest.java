package com.mycompany.mavenproject1final;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;

public class Mavenproject1finalTest {

    private WebDriver driver;
    private final String BASE_URL = "https://bistro-boss-final-projec-55fef.web.app/login";

    @BeforeEach
    public void setUp() {
        try {
            System.out.println("STEP 1: Initializing ChromeDriver...");
            driver = new ChromeDriver();
            System.out.println("STEP 2: ChromeDriver initialized.");

            System.out.println("STEP 3: Navigating to URL...");
            driver.get(BASE_URL);
            System.out.println("STEP 4: Navigation successful.");

            Thread.sleep(2000); // Wait for the page to load

        } catch (Exception e) {
            System.err.println("Exception in setUp: " + e.getMessage());
            e.printStackTrace();
            Assertions.fail("Failed in setUp(): " + e.getMessage());
        }
    }

    @Test
    public void testLogin() {
        try {
            System.out.println("STEP 5: Locating email field...");
            WebElement emailField = driver.findElement(By.name("email"));
            emailField.sendKeys("tst90@gmail.com");

            System.out.println("STEP 6: Locating password field...");
            WebElement passwordField = driver.findElement(By.name("pass"));
            passwordField.sendKeys("691156##Mr");

            System.out.println("STEP 7: Locating and clicking login button...");
            WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
            loginButton.click();

            System.out.println("STEP 8: Waiting for redirection...");
            Thread.sleep(3000); // Wait for redirection

            String currentUrl = driver.getCurrentUrl();
            Assertions.assertEquals("https://bistro-boss-final-projec-55fef.web.app/", currentUrl);
            System.out.println("STEP 9: Login successful. Test passed.");

        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Test failed due to an exception during login: " + e.getMessage());
        }
    }

    @AfterEach
    public void tearDown() {
        System.out.println("STEP 10: Tearing down WebDriver...");
        if (driver != null) {
            driver.quit();
            System.out.println("STEP 11: Driver quit successfully.");
        }
    }
}
