package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class Second_Task_Step_Defs {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void iOpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Kurs CodersLab - projekty\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    @And("I go to login page")
    public void iGoToLoginPage() {
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("I click sign in button")
    public void iClickSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
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

    @When("I return to home-page")
    public void iReturnToHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id=_desktop_logo]")));
        element.click();
    }

    @Then("I chose hummingbird printed sweatshirt")
    public void iChoseHummingbirdPrintedSweatshirt() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("article[data-id-product=\"2\"]")));
        element.click();
    }


    @And("I choose M size")
    public void iChooseMSize() {
        WebElement element = driver.findElement(By.cssSelector("select[id=group_1]"));
        Select select = new Select(element);
        select.selectByVisibleText("M");
    }


    @And("I choose quantity {string}")
    public void iChooseQuantity(String quantity) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id=quantity_wanted]")));
        wait.until(ExpectedConditions.urlContains("2-size-m"));
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(String.valueOf(quantity));
    }

    @When("I click add to cart button")
    public void iClickAddToCartButton() {
        WebElement element = driver.findElement(By.cssSelector("button[class=\"btn btn-primary add-to-cart\"]"));
        element.click();
    }

    @Then("I proceed to checkout")
    public void iProceedToCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        String fullXpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a";
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(fullXpath)));
            element.click();
        String fullXpath2 = "/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a";
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(fullXpath2)));
        element.click();

        }

    @When("I confirm the address")
    public void iConfirmTheAddress() {
        WebElement element = driver.findElement(By.cssSelector("input[value=\"10471\"]"));
        element.click();


    }

    @And("I click continue button")
    public void iClickContinueButton() {
        WebElement element = driver.findElement(By.cssSelector("button[name=\"confirm-addresses\"]"));
        element.click();
    }

    @And("I select pick up in-store option")
    public void iSelectPickUpInStoreOption() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for=\"delivery_option_6\"]")));
        element.click();
        element = driver.findElement(By.cssSelector("label[for=\"delivery_option_8\"]"));
        element.click();
        element = driver.findElement(By.cssSelector("button[name=\"confirmDeliveryOption\"]"));
        element.click();
    }

    @And("I select pay by check option")
    public void iSelectPayByCheckOption() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for=\"payment-option-1\"]")));
        element.click();
    }

    @And("I agree to terms of service")
    public void iAgreeToTermsOfService() {
        WebElement element = driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
        element.click();
    }

    @Then("I place an order")
    public void iPlaceAnOrder() {
        String fullXpath = "/html/body/main/section/div/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button";
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(fullXpath)));
        element.click();

    }

    @And("I screenshot the order")
    public void iScreenshotTheOrder() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src\\ScreenShot.png"));

    }

    @And("I confirm the order")
    public void iConfirmTheOrder() {
        WebElement element = driver.findElement(By.cssSelector("h3[class=\"h1 card-title\"]"));
        String confirmation = element.getText();
        Assert.assertTrue(confirmation.contains("YOUR ORDER IS CONFIRMED"));

    }
}


