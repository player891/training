package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage extends BasePage{

    //protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private By searchString = By.cssSelector("input[id=\"text\"]");
    private By searchButton = By.cssSelector("button[role=\"button\"][type=\"submit\"]");


    public void search(String str){
        driver.findElement(searchString);
        driver.findElement(searchString).click();
        driver.findElement(searchString).clear();
        driver.findElement(searchString).sendKeys(str);
        driver.findElement(searchButton).click();
    }

}
