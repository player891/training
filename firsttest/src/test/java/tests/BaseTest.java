package tests;

import Pages.BasePage;
import Pages.ResultPage;
import Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public BasePage basePage;
    public SearchPage searchPage;
    public ResultPage resultPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        basePage = new BasePage(driver);
        searchPage = new SearchPage(driver);
        resultPage = new  ResultPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }

    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }
}
