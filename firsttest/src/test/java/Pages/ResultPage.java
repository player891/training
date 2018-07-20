package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage extends BasePage{

    //protected WebDriver driver;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    private By result = By.cssSelector("a[accesskey=\"1\"]");

    public String  getLinkText() {

        String linkText = driver.findElement(result).getText();
        return linkText;
    }

}
