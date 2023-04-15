package mentutor.Page;

import org.openqa.selenium.By;

public class Jojonomic {
    public static final By SEARCH = By.xpath("//div[@id='homeautosuggestKcpXb_EkgBo']/input[@name='q']");
    public static final By SEARCH_CLICK = By.xpath("//section[@class='personalised-content']/div[@class='region']/div[1]//button[@class='button button--primary']");
    public static final By FIND_LOCATIONS = By.xpath("//ul[@class='MainNav__list-peZtddYtxn']//a[.='Find locations']");
    public static final By INSERT_LOCATIONS = By.id("locatorTextSearch");
    public static final By CLICK_SEARCH_LOCATIONS = By.cssSelector(".button--primary");

}
