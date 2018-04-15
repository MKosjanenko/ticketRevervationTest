package core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by qa on 4/15/2018.
 */
public class DetailsPage {
    private static final By NAME = By.id("name");
    private static final By SURNAME = By.id("surname");
    private static final By DISCONT_CODE = By.id("discount");
    private static final By ADULTS_NUMBER = By.id("adults");
    private static final By CHILDREN_NUMBER = By.id("children");
    private static final By LUGGAGE_COUNT = By.id("bugs");
    private static final By NEXT_FLIGHT = By.id("flight");
    private static final By GET_PRICE_BTN = By.xpath("//span[contains(text(),'Get Price')]");
    BaseFunctions baseFunctions;

    public DetailsPage(BaseFunctions baseFunctions){
        this.baseFunctions = baseFunctions;
    }

    public void InputName(String name){
        baseFunctions.driver.findElement(NAME).sendKeys(name);
    }

    public void InputSurname(String surname){
        baseFunctions.driver.findElement(SURNAME).sendKeys(surname);
    }

    public void InputDiscountCode(String discountCode){
        baseFunctions.driver.findElement(DISCONT_CODE).sendKeys(discountCode);
    }

    public void InputAdultNumber(String adultNumber){
        baseFunctions.driver.findElement(ADULTS_NUMBER).sendKeys(adultNumber);
    }

    public void InputChildrenNumber(String childrenNumber){
        baseFunctions.driver.findElement(CHILDREN_NUMBER).sendKeys(childrenNumber);
    }

    public void InputLuggageCount(String  luggageCount){
        baseFunctions.driver.findElement(LUGGAGE_COUNT).sendKeys(luggageCount);
    }

    public void SelectNextFlight(String nextFlightDate){
        Select nextFlight = new Select(baseFunctions.driver.findElement(NEXT_FLIGHT));
        nextFlight.selectByValue(nextFlightDate);
    }

    public void clickGetPriceBtn(){
        baseFunctions.driver.findElement(GET_PRICE_BTN).click();
    }
}
