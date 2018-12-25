package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class PageFlights extends MainPage {

     @FindBy(id = "T7-from")
     private WebElement inputFrom;
     @FindBy(id = "T7-to")
     private WebElement inputTo;
     @FindBy(xpath = "//div[@class='form-row']")
     private WebElement showFlights;
     @FindBy(xpath = "//span[contains(text(), 'One way')]")
     private WebElement radioButtonOneWay;
     @FindBy(id = "T7-passengers")
     private WebElement inputPassenger;
     @FindBy(xpath = "//a[contains(text(), 'Algérie - Français')]")
     private WebElement frenchLang;
     @FindBy(id = "T7-arrival_1")
     private WebElement inputReturnDate;
     @FindBy(id = "T7-departure_1")
     private WebElement inputDepartDate;
     @FindBy(id = "T7-name")
     private WebElement inputName;
     @FindBy(id = "countryNameHardcoded")
     private WebElement countryName;
     @FindBy(xpath = "//div[@class='error']")
     private WebElement error;
     @FindBy(xpath = "//div[@class='tt-suggestion']")
     private WebElement popupError;


    public  void clearInputDepartDate(){
         inputDepartDate.clear();}
     public  void clearInputReturnDate(){
         inputReturnDate.clear();
     }
     public  void clearInputFrom(){
        inputFrom.clear();
    }
     public  void clearInputTo(){
         inputTo.clear();
     }
    public  void clearInputPassenger(){
        inputPassenger.clear();}

     public void setInputPassenger (String name) {
         inputPassenger.sendKeys(name);
     }
     public void setInputFrom(String place) {
        inputFrom.sendKeys(place);
    }
     public void setInputTo(String place) {
         inputTo.sendKeys(place);
     }

     public void clickRadioButtonOneWay() {
        new Actions(driver).moveToElement(radioButtonOneWay).click().build().perform();
    }

    public void setInputReturnDate(String date) {
        inputReturnDate.sendKeys(date);
     }
    public void setInputDepartDate(String date) {
         inputDepartDate.sendKeys(date);
     }

    public boolean checksIsErrorExist(){
        return driver.findElements(By.xpath("//div[@class='error']")).size() != 0;
    }

    public boolean inputReturnDateIsEnabled(){
        return inputReturnDate.isEnabled();
    }

    public String getDateDepart(){
        return inputDepartDate.getText();
    }
    public String getDateReturn(){
        return inputReturnDate.getText();
    }
    public void clickCountryName() {
        countryName.click();
    }
    public void clickToShowFlights() {
         showFlights.click();
     }
    public void clickToFrenchLang() {
         new Actions(driver).moveToElement(frenchLang).click().build().perform();
    }
    public void scrollToBookingTabViewContainer() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + ","
                + 200 + ");");
    }
    public String getError() {
        return error.getText();
    }
    public String getPopupError() {
         return popupError.getText();
     }
}
