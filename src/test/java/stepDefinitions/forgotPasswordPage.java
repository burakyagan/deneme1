package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Instant;


public class forgotPasswordPage {
    public WebDriver driver;
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");


    }

    @When("User clicks the {string} phrase to get the password")
    public void userClicksThePhraseToGetThePassword(String arg0) throws InterruptedException {
        initializeWebDriver();
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
        Thread.sleep(1000);
        
    }

    @And("User tries to fill Name , Email ,and Phone Number areas to get the password")
    public void userTriesToFillNameEmailAndPhoneNumberAreasToGetThePassword() {
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Burak");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("burak@xyz.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123");
        
    }

    @And("After filling all the three fields, user clicks \"RESET LOGIN\"")
    public void afterFillingAllTheFieldsUserClicks() throws InterruptedException {

        driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
        Thread.sleep(1000);


    }

    @And("User checks whether the text {string} appears on the screen or not")
    public void userChecksWhetherTheTextAppearsOnTheScreenOrNot(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // 5 sec wait to become it is visible
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='infoMsg']")));


    }

    @And("User clicks \"GO TO LOGIN\" button and write the correct parameters into Username and Password fields")
    public void userClicksButtonAndWriteTheCorrectParametersIntoUsernameAndPasswordFields() throws InterruptedException {

        driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("burak");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxTwo")).click();

    }

    @And("User tries to sign in to the webpage by clicking {string} button")
    public void userTriesToSignInToTheWebpageByClickingButton(String arg0) throws InterruptedException {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1000);

        
    }

    @Then("User should click to the {string} phrase without any problem, and should see the {string} page")
    public void userShouldClickToThePhraseWithoutAnyProblemAndShouldSeeThePage(String arg0, String arg1) {
        
    }

    @And("User needs to fill Name , Email ,and Phone Number areas to get the password successfully")
    public void userNeedsToFillNameEmailAndPhoneNumberAreasToGetThePasswordSuccessfully() {
        
    }

    @And("After filling all the fileds, user should be able to click {string} without any problem")
    public void afterFillingAllTheFiledsUserShouldBeAbleToClickWithoutAnyProblem(String arg0) {
        
    }

    @And("{string} phrase should appear at the top of the Name field")
    public void phraseShouldAppearAtTheTopOfTheNameField(String arg0) {
        
    }

    @And("User can click to the {string} button ,and can fill with the correct parameters into Username and Password fields")
    public void userCanClickToTheButtonAndCanFillWithTheCorrectParametersIntoUsernameAndPasswordFields(String arg0) {
        
    }

    @And("User should be able to click to the \"SIGN IN\" button and page should open")
    public void userShouldBeAbleToClickToTheButtonAndPageShouldOpen() {
        driver.findElement(By.xpath("//div[@class='login-container']"));
        driver.quit();

    }

}


