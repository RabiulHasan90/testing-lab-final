/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author DELL
 */
public class Mavenproject1final {

      public static void main(String[] args) {
        // TODO code application logic here
       WebDriver driver = new ChromeDriver();
        driver.get("https://bistro-boss-final-projec-55fef.web.app/login");
    
 // Navigate to YouTube
   // Wait a bit to allow the page to load (better to use WebDriverWait in real projects)
        try {
            Thread.sleep(3000); // Not best practice — replace with WebDriverWait for production
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate the email field and enter email
        WebElement emailField = driver.findElement(By.name("email"));  // Or By.id / By.xpath if needed
        emailField.sendKeys("tst90@gmail.com");

        // Locate the password field and enter password
        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("691156##Mr");

        // Locate the login/sign-in button and click it
//        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
//        loginButton.click();
        WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
loginButton.click();


        // Optionally wait and validate login success
        try {
            Thread.sleep(5000); // wait for login action
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Optional: close browser
        driver.quit();
    }
    
}
