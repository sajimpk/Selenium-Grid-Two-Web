package StepDef;

import HomePage.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import HomePage.HomePage_1;
import utilis.TestContextSetup;

public class daraz_setp {
    private final TestContextSetup testContextSetup_1;
    private TestContextSetup TestContextSetup_1;
    private WebDriver driver;
    private HomePage_1 homepage_1;
    private int wait = 3000;

    public daraz_setp(TestContextSetup TestContextSetup_1) {
        this.testContextSetup_1 = TestContextSetup_1;
        this.driver = testContextSetup_1.driver;
        this.homepage_1 = testContextSetup_1.pageObjectManager.getHomepage_1();
    }

    //////////// TC_1 //////////////////////////

    @When("Check the Login button")
    public void checkLoginButtonIsAvailable() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.LoginButton().isDisplayed());
        Thread.sleep(wait);
    }

    @Then("Click on the Login button")
    public void clickOntLoginButton() throws InterruptedException {
        homepage_1.LoginButton().click();
        Thread.sleep(wait);
    }
    @When("Click on the Email Field")
    public void ValueForLoginEmail() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.InputNum().click();
        Thread.sleep(wait);
    }
    @Then("Enter Value For Login")
    public void EnterValue() throws InterruptedException {
        homepage_1.InputNum().sendKeys("example@gmail.com");
        Thread.sleep(wait);
    }
    @Then("Click on the Password Field")
    public void clickForLoginPass() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.InputPass().click();
        Thread.sleep(wait);
    }
    @When("Enter Password For Login")
    public void EnterPassValue() throws InterruptedException {
        homepage_1.InputPass().sendKeys("example1209");
        Thread.sleep(wait);
    }
    @Then("Click on the Submit Button")
    public void clickLogin() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.LoginSub().click();
        Thread.sleep(wait);
    }
    ///////////// TC_2 ////////////////////
    @Given("Check the Category field id showed")
    public void CategoryView() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.CategoryView().isDisplayed());
        Thread.sleep(wait);
    }
    @When("Click on the Category Device")
    public void CategoryViewClick() throws InterruptedException {
        homepage_1.CategoryView().click();
        Thread.sleep(wait);
    }
    @Then("Check on the Category Device product show")
    public void CategoryViewIsShow() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.CategoryViewProduct().isDisplayed());
        Thread.sleep(wait);
    }
    @When("Click on the Category Device product")
    public void CategoryViewProduct() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.CategoryViewProduct().click();
        Thread.sleep(wait);
    }
    //////////////////////// TC_3 ////////////////////

    @Given("Check the Search Field on the page")
    public void ChackSearchField() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SearchField().isDisplayed());
        Thread.sleep(wait);
    }
    @When("I Click on the Search Field")
    public void ClickSearchField() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SearchField().click();
        Thread.sleep(wait);
    }
    @Then("I Enter value on the Search Field")
    public void ValueSearchField() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SearchField().sendKeys("Headphones");
        Thread.sleep(wait);
    }
    @Then("I submit value on the Search Field")
    public void SubmitValueForSearch() throws InterruptedException {
        homepage_1.SearchField().submit();
        Thread.sleep(wait);
    }


    @Then("Check The Product is Current For Search Value")
    public void checkTheProductForSearchValue() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SearchFieldProduct().isDisplayed());
        Thread.sleep(wait);
    }

    @And("Click On The product")
    public void clickOnTheProduct()  throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SearchFieldProduct().click();
        Thread.sleep(wait);
    }
    /////////////////////// TC_4 /////////////////////

    @Given("Check the Sing Up button")
    public void checkSingUpButtonIsAvailable() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SingUpButton().isDisplayed());
        Thread.sleep(wait);
    }

    @Then("Click on the Sing Up button")
    public void checkSingUpButtonClick() throws InterruptedException {
        homepage_1.SingUpButton().click();
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Number field")
    public void checkSingUpNumberField() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SingUpNumber().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Number field")
    public void clickSingUpNumber() throws InterruptedException {
        homepage_1.SingUpNumber().click();
        Thread.sleep(wait);
    }
    @Then("Enter Number on sing up input field")
    public void EnterSingUpEmailValue() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SingUpNumber().sendKeys("01861766157");
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Full name field")
    public void checkSingUpNameField() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SingUp_FullName().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Full name field")
    public void clickSingUpName() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SingUp_FullName().click();
        Thread.sleep(wait);
    }
    @Then("Enter Name on sing up Full name field")
    public void EnterSingUpNameValue() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SingUp_FullName().sendKeys("Sajim Uddin");
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Send Code Button")
    public void checkSingUpSend() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SingUp_CodeSend().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Send Code Button")
    public void clickSingUpSend() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SingUp_CodeSend().click();
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Password field")
    public void checkSingUpPwdField() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertTrue(homepage_1.SingUp_Password().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Password field")
    public void clickSingUpPwd() throws InterruptedException {
        Thread.sleep(10000);
        homepage_1.SingUp_Password().click();
        Thread.sleep(wait);
    }
    @Then("Enter Password on Sing Up Password field")
    public void EnterSingUpPwdValue() throws InterruptedException {
        homepage_1.SingUp_Password().sendKeys("!@#$asdfGH");
        Thread.sleep(wait);
    }

}




