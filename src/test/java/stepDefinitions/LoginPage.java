package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginPage {
    public WebDriver driver;
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");


    }
    @Given("rahulshettyacademy is opening without any problem")
    public void rahulshettyacademy_is_opening_without_any_problem() {
        initializeWebDriver();
    }

    @And("api.... should return {int} OK")
    public void api_should_return_ok(Integer int1) {
        // We do not know the api, therefore we can skip this step
    }
    @And("Page needs to start with EN language")
    public void page_needs_to_start_with_en_language() {
        // No need to coding
    }



    @When("User fills Username as {string}")
    public void user_fills_username_as(String userName) {
        driver.findElement(By.id("inputUsername")).sendKeys(userName);
    }
    @And("User fills Password as {string}")
    public void user_fills_password_as(String password) {
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
    }
    @And("User clicks the privacy policy box to approve the conditions")
    public void user_clicks_the_privacy_policy_box_to_approve_the_conditions() {
        driver.findElement(By.id("chkboxTwo")).click();
    }
    @And("User clicks SIGN IN button to land the page")
    public void user_clicks_sign_in_button_to_land_the_page() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    @And("After filling all the parameters correctly, user checks whether the page is opened or not")
    public void after_filling_all_the_parameters_correctly_user_checks_whether_the_page_is_opened_or_not() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='login-container']"));



    }
    @Then("Username field needs to be filled as {string} without any problem")
    public void username_field_needs_to_be_filled_as_without_any_problem(String string) {

    }
    @And("Password field needs to be filled as {string} without any problem")
    public void password_field_needs_to_be_filled_as_without_any_problem(String string) {

    }
    @And("User should be able to click privacy policy box successfully")
    public void user_should_be_able_to_click_privacy_policy_box_successfully() {

    }
    @And("SIGN IN button should be clickable")
    public void sign_in_button_should_be_clickable() {

    }
    @And("User needs to land the related page without any problem after filling all the parameters correct")
    public void userNeedsToLandTheRelatedPageWithoutAnyProblemAfterFillingAllTheParametersCorrect() {
        driver.quit();
    }


    @And("After filling all the field with wrong parameters , user checks whether the page is opened or not")
    public void afterFillingAllTheFieldWithWrongParametersUserChecksWhetherThePageIsOpenedOrNot() throws InterruptedException {

        initializeWebDriver();
        driver.findElement(By.id("inputUsername")).sendKeys("burak.");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy.");
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1000);



    }

    @And("User should not be able to land the related page after filling all the fileds with wrong paramters")
    public void userShouldNotBeAbleToLandTheRelatedPageAfterFillingAllTheFiledsWithWrongParamters() {
        driver.findElement(By.xpath("//p[@class='error']"));
        driver.quit();
    }
}

