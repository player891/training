package ru.mail.clubavtopnz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static WebDriver driver;


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.yandex.ru/");
    }

    @Test
    public void test(){
        WebElement searchString = driver.findElement(By.cssSelector("input[id=\"text\"]"));
        searchString.click();
        searchString.clear();
        searchString.sendKeys("Погода Пенза");
        WebElement searchButton = driver.findElement(By.cssSelector("button[role=\"button\"][type=\"submit\"]"));
        searchButton.click();
        WebElement link = driver.findElement(By.cssSelector("a[accesskey=\"1\"]"));
        String linkText = link.getText();
        Assert.assertTrue(linkText.contains("Погода"));

    }

    @AfterMethod
    public void afterMethod() {

           driver.quit();
    }
}
