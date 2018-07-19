package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

    protected WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private By result = By.cssSelector("a[accesskey=\"1\"]");

    public String  getLinkText() {

        String linkText = driver.findElement(result).getText();
        return linkText;
    }

}
