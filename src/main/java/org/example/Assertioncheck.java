package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Assertioncheck {
    @Test
    public void Assertiontruecheck() {

        System.setProperty("webdriver.chrome.driver","F:\\Automation\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.daraz.com.bd/");

        Boolean verifyTitlex = driver.getTitle().equalsIgnoreCase("Online Shopping in Bangladesh: Order Now from Daraz.com.bd");
        assertTrue(verifyTitlex);

    }
}
