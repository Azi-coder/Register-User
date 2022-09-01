package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignedUpPage {
    private WebDriver driver;
    private By newsletterCheckBox = By.id("newsletter");
    private By optinCheckBox = By.id("optin");
    private By radioMr = By.cssSelector("input[value = Mr]");
    private By signUpPassword = By.cssSelector("input[data-qa = password]");
    private By signUpDays = By.cssSelector("select[id = days]");
    private By signUpMonths = By.cssSelector("select[id = months]");
    private By signUpYears = By.cssSelector("select[id = years]");
    private By addressFirstName = By.cssSelector("input[id = first_name]");
    private By addressLastName = By.cssSelector("input[id = last_name]");
    private By companyName = By.id("company");
    private By addressFirst = By.id("address1");
    private By addressSecond = By.id("address2");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");
    private By createAccountButton = By.cssSelector("button[data-qa = create-account]");

    public SignedUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setsignUpPassword(String password) {
        driver.findElement(signUpPassword).sendKeys(password);
    }

    public void setaddressFirstName(String address1) {
        driver.findElement(addressFirstName).sendKeys(address1);
    }

    public void setaddressLastName(String address2) {
        driver.findElement(addressLastName).sendKeys(address2);
    }

    public void setcompanyName(String company) {
        driver.findElement(companyName).sendKeys(company);
    }

    public void setaddressFirst(String address1) {
        driver.findElement(addressFirst).sendKeys(address1);
    }

    public void setaddressSecond(String address2) {
        driver.findElement(addressSecond).sendKeys(address2);
    }

    public void setastate(String State) {
        driver.findElement(state).sendKeys(State);
    }

    public void setcity(String City) {
        driver.findElement(city).sendKeys(City);
    }

    public void setzipcode(String zip) {
        driver.findElement(zipcode).sendKeys(zip);
    }

    public void setmobilenumber(String num) {
        driver.findElement(mobileNumber).sendKeys(num);
    }

    public void selectsignUpDays(String s) {
        Select days = new Select(driver.findElement(signUpDays));
        days.selectByVisibleText(s);
    }

    public void selectsignUpMonths(String s) {
        Select months = new Select(driver.findElement(signUpMonths));
        months.selectByVisibleText(s);
    }

    public void selectsignUpYears(String s) {
        Select years = new Select(driver.findElement(signUpYears));
        years.selectByVisibleText(s);
    }

    public void selectcountry(String s) {
        Select c = new Select(driver.findElement(country));
        c.selectByVisibleText(s);
    }

    public void selectnewsletterCheckBox() {
        driver.findElement(newsletterCheckBox).click();
    }

    public void selectoptinCheckBox() {
        driver.findElement(optinCheckBox).click();
    }

    public void selectradioMr() {
        driver.findElement(radioMr).click();
    }

    public AccountCreated clickCreateButton() {
        driver.findElement(createAccountButton).click();
        return new AccountCreated(driver);
    }


}
