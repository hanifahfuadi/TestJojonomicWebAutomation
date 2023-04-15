package mentutor.StepDefs.Login;


import io.cucumber.java.en.*;

import jojonomic.PageNavigation;
import mentutor.Page.Jojonomic;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class LoginStepDefs {
    Jojonomic search;
    @Given("Open Webpage")
    public void openWebpage() {
        getDriver().get(PageNavigation.LOGIN_URL);
    }

    @Then("Search Apply for a number plate")
    public void searchApplyForANumberPlate() {
        getDriver().findElement(Jojonomic.SEARCH).sendKeys("Apply for a number plate");
        getDriver().findElement(Jojonomic.SEARCH_CLICK).click();
    }

    @Then("Click Find Locations")
    public void clickFindLocations() {
        getDriver().findElement(Jojonomic.FIND_LOCATIONS).click();

    }


    @When("Search {string} on Suburb Locations")
    public void searchOnSuburbLocations(String locations) {
        getDriver().findElement(Jojonomic.INSERT_LOCATIONS).clear();
        getDriver().findElement(Jojonomic.INSERT_LOCATIONS).sendKeys(locations);
        getDriver().findElement(Jojonomic.CLICK_SEARCH_LOCATIONS).click();
    }


}
