import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;


public class Main {
    WebDriver driver;
    MainPage mainPage;

    @Before
    public void openPage(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.qatarairways.com/en-us/homepage.html");
        mainPage = new MainPage(driver);
    }

    @Test
    public void findWhenAllFieldsAreEmpty() {
        String expectedError = "Departure airport is missing\n" +
                "Destination airport is missing\n" +
                "Please select the number of passengers.";
        Assert.assertEquals(mainPage.allFieldsAreEmpty(), expectedError);
    }

  @After
 public void closeDriver() {
     if (driver != null) {
         driver.quit();
         driver = null;
     }
 }
}
