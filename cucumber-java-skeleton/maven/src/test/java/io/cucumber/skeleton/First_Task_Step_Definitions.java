package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_Task_Step_Definitions {

    WebDriver driver;

    WebDriverWait wait;

    @Before
    public void iOpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Kurs CodersLab - projekty\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 3);
    }

    @And("I go to login page")
    public void iGoToLoginPage() {
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("I click sign in button")
    public void iClickSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".user-info")));
        element.click();

    }

    @And("I type email {string}")
    public void iTypeEmail(String email) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-email]"));
        element.sendKeys(email);

    }

    @And("password {string}")
    public void password(String password) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-password]"));
        element.sendKeys(password);
    }

    @And("I use sign in button")
    public void iUseSignInButton() {
        WebElement element = driver.findElement(By.cssSelector("button[id=submit-login]"));
        element.click();
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
        wait.until(ExpectedConditions.urlContains("controller=my-account"));

    }

    @Then("I click addresses button")
    public void iClickAddressesButton() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id=addresses-link]")));
        element.click();
    }

    @And("I click create new address button")
    public void iClickCreateNewAddressButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-link-action=add-address]")));
        element.click();
    }

    @And("I fill alias {string} bracket")
    public void iFillAliasBracket(String alias) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-alias]"));
        element.sendKeys(alias);
    }

    @And("I fill address {string} bracket")
    public void iFillAddressBracket(String address) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-address1]"));
        element.sendKeys(address);
    }

    @And("I fill city {string} bracket")
    public void iFillCityBracket(String city) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-city]"));
        element.sendKeys(city);
    }

    @And("I fill postal code {string} bracket")
    public void iFillPostalCodeBracket(String postal) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-postcode]"));
        element.sendKeys(postal);

    }

    @And("I fill country {string} bracket")
    public void iFillCountryBracket(String country) {
        WebElement element = driver.findElement(By.cssSelector("select[id=field-id_country]"));
        element.sendKeys(country);
    }

    @And("I fill  phone {string} bracket")
    public void iFillPhoneBracket(String phone) {
        WebElement element = driver.findElement(By.cssSelector("input[id=field-phone]"));
        element.sendKeys(phone);
    }


    @Then("I click save button")
    public void iClickSaveButton() {
        WebElement element = driver.findElement(By.cssSelector("button[type=submit]"));
        element.click();
    }

    @Then("I verify address details")
    public void iVerifyAddressDetails() {
        WebElement element = driver.findElement(By.cssSelector("section[id=\"main\"]"));
        String alias = element.getText();
        Assert.assertTrue(alias.contains("MaciejObrona"));
        String address = element.getText();
        Assert.assertTrue(address.contains("Obrona 1"));
        String city = element.getText();
        Assert.assertTrue(city.contains("EgzaminKońcowy"));
        String postal = element.getText();
        Assert.assertTrue(postal.contains("32-050"));
        String country = element.getText();
        Assert.assertTrue(country.contains("United Kingdom"));
        String phone = element.getText();
        Assert.assertTrue(phone.contains("123-456-789"));
    }
}