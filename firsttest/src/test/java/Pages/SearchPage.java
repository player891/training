package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String str){
        WebElement searchString = driver.findElement(By.cssSelector("input[id=\"text\"]"));
        searchString.click();
        searchString.clear();
        searchString.sendKeys(str);
        WebElement searchButton = driver.findElement(By.cssSelector("button[role=\"button\"][type=\"submit\"]"));
        searchButton.click();
    }

    public String  getLinkText() {
        WebElement result = driver.findElement(By.cssSelector("a[accesskey=\"1\"]"));
        String linkText = result.getText();
        return linkText;
    }
}
