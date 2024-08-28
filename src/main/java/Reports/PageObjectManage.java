package Reports;

import org.openqa.selenium.WebDriver;
import HomePage.Homepage;
import HomePage.HomePage_1;


public class PageObjectManage {
    public static WebDriver driver;

    public Homepage homepage;
    public HomePage_1 homepage_1;

    public PageObjectManage(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage getHomePage() {
        homepage = new Homepage(driver);

        return homepage;
    }

    public HomePage_1 getHomepage_1() {
        homepage_1 = new HomePage_1(driver);

        return homepage_1;
    }
}
