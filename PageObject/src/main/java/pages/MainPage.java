package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='T7-container']")
    private WebElement content;

    @FindBy(xpath = "//div[@class='error']")
    private WebElement error;

    @FindBy(xpath = "//div[@class='form-row']")
    private WebElement ShowFlights;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String allFieldsAreEmpty() {
        scrollToContent();
        clickToShowFlights();
        return error.getText();
    }

    private MainPage scrollToContent() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", content);
        return this;
    }

    private MainPage clickToShowFlights() {
        ShowFlights.click();
        return this;
    }
}