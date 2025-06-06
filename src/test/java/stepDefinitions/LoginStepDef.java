package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import pages.LoginPage;

import static helper.Utility.webDriver;

import java.time.Duration;

public class LoginStepDef {

    private LoginPage loginPage;
    private HomePage homePage;

    @Given("user on the home page")
    public void userOnTheHomePage() {
        webDriver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage();
        homePage = new HomePage();
        Assert.assertTrue("Login page is not displayed", loginPage.isPageDisplayed());
    }

    @When("user input {string} as username")
    public void userInputUsername(String username) {
        loginPage.setInputUsername(username);
    }

    @When("user input {string} as password")
    public void userInputPassword(String password) {
        loginPage.setInputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user will redirect to home page")
    public void userWillRedirectToHomePage() {
        Assert.assertTrue("Home page is not displayed", homePage.verifyPageIsDisplayed());
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String expectedMessage) {
        By errorMessageLocator = By.cssSelector("h3[data-test='error']");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        String actualMessage = wait
                .until(ExpectedConditions.visibilityOfElementLocated(errorMessageLocator))
                .getText();
        System.out.println("Actual error message: " + actualMessage);
        Assert.assertEquals("Error message does not match", expectedMessage, actualMessage);
    }
}
