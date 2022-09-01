package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test
    public void succesfullLoginTest() {
        LoginPage loginpage = homepage.clickloginButton();
        loginpage.setnameInput("azmar");
        loginpage.setsignUpEmail("azmarslnts8@hotmail.com");
        SignedUpPage signedUpPage = loginpage.clickSignUpButton();
        signedUpPage.selectradioMr();
        signedUpPage.setsignUpPassword("azim=741");
        signedUpPage.selectsignUpDays("10");
        signedUpPage.selectsignUpMonths("October");
        signedUpPage.selectsignUpYears("1994");
        signedUpPage.selectnewsletterCheckBox();
        signedUpPage.selectoptinCheckBox();
        signedUpPage.setaddressFirstName("AddressFirst");
        signedUpPage.setaddressLastName("AddressLast");
        signedUpPage.setcompanyName("Company");
        signedUpPage.setaddressFirst("Address1");
        signedUpPage.setaddressSecond("Address2");
        signedUpPage.selectcountry("Canada");
        signedUpPage.setastate("State");
        signedUpPage.setcity("City");
        signedUpPage.setzipcode("Zip");
        signedUpPage.setmobilenumber("12345");
        AccountCreated accountCreated = signedUpPage.clickCreateButton();
        assertEquals(accountCreated.getTextCreate(), "ACCOUNT CREATED!", "Couldn't find the creation message");
        AccountPage accountPage = accountCreated.clickcontinueButton();
        assertEquals(accountPage.getUserName(), "azmar", "UserName couldn't be found!");
        DeleteAccountPage deleteAccountPage = accountPage.clickdeleteAccountButton();
        deleteAccountPage.clickdeleteAccountButton1();

    }
}
