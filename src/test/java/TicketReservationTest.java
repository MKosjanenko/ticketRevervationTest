import core.BaseFunctions;
import core.DetailsPage;
import core.MainPage;
import org.junit.Test;

/**
 * Created by qa on 4/15/2018.
 */
public class TicketReservationTest {
    private static final String departure = "RIX";
    private static final String destanation = "BCN";
    private static final String NAME ="Mihails";
    private static final String SURNAME = "Kosjanenko";
    private static final String DISCOINT_CODE = "123123";
    private static final String ADULT_NUMBER = "1";
    private static final String CHILDREN_NUMBER = "0";
    private static final String LUGGAGE_COUNT = "1";
    private static final String NEXT_FLIGHT = "11";



    private BaseFunctions baseFunctions = new BaseFunctions();


    @Test
    public void TicketRevervationsTest(){
        MainPage mainPage = new MainPage(baseFunctions);
        mainPage.selectDepartureCountry(departure);
        mainPage.selectDestinationCountry(destanation);
        mainPage.goGoGoBtn();

        DetailsPage detailsPage = new DetailsPage(baseFunctions);

        detailsPage.InputName(NAME);
        detailsPage.InputSurname(SURNAME);
        detailsPage.InputDiscountCode(DISCOINT_CODE);
        detailsPage.InputAdultNumber(ADULT_NUMBER);
        detailsPage.InputChildrenNumber(CHILDREN_NUMBER);
        detailsPage.InputLuggageCount(LUGGAGE_COUNT);
        detailsPage.SelectNextFlight(NEXT_FLIGHT);

        detailsPage.clickGetPriceBtn();
    }
}
