package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreated {
    private WebDriver driver;
    private By continueButton = By.cssSelector("a[data-qa = continue-button]");
    private By textCreate = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");

    public AccountCreated(WebDriver driver) {
        this.driver = driver;
    }

    public AccountPage clickcontinueButton() {
        driver.findElement(continueButton).click();
        return new AccountPage(driver);
    }

    public String getTextCreate() {
        return driver.findElement(textCreate).getText();
    }
}
