package core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by qa on 4/15/2018.
 */
public class MainPage {
    private static final String URL = "http://qaguru.lv/tickets/";
    private static final By dropdownDeparture = By.id("afrom");
    private static final By dropdownDestination = By.id("bfrom");
    private static final By goGoGoBtn = By.className("gogogo");

    BaseFunctions baseFunctions;


    public MainPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
        baseFunctions.driver.get(URL);
    }

    public void selectDepartureCountry(String departure){
        Select departureCountry = new Select(baseFunctions.driver.findElement(dropdownDeparture));
        departureCountry.selectByValue(departure);
    }

    public void selectDestinationCountry(String destination){
        Select destinationsCountry = new Select(baseFunctions.driver.findElement(dropdownDestination));
        destinationsCountry.selectByValue(destination);
    }

    public void goGoGoBtn() {
        baseFunctions.driver.findElement(goGoGoBtn).click();
    }


}
