package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTests {

    WebDriver driver;

    @AfterEach
    void tearDown(){
        driver.quit();
    }

    @Test
    void openHomePageTest() {
        driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();

        Assertions.assertEquals("Hands-On Selenium WebDriver with Java", actualTitle);

    }
}
