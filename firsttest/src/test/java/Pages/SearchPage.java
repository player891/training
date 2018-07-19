package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
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
