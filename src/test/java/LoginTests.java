import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest
{
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPAge = new MainPage();

    @Test(description = "Başarılı Giriş Kontrolu")
    public void Test1LoginSucccesfullControl() {

        loginPage.fillUserName(username)
                .fillPassword(password)
                .clickLogin();
        homePage.accountControl("Welcome " + username);

    }
    @Test(description = "Başarısız Giriş Kontrolu")
    public void Test2LoginUnSuccesfullControl()
    {
        loginPage.fillUserName(username)
                .fillPassword("12345")
                .clickLogin();

        mainPAge.errorControlMessage("An internal error has occurred and has been logged.");
    }

    @Test(description = "Giriş Gereklilikleri Kontrolu")
    public void Test3LoginRequiredControl() {

        loginPage.fillUserName("")
                .fillPassword("")
                .clickLogin();

        mainPAge.errorControlMessage("Please enter a username and password.");

        loginPage.fillUserName(username)
                .fillPassword("")
                .clickLogin();

        mainPAge.errorControlMessage("Please enter a username and password.");

        loginPage.fillUserName(username)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome " + username);
    }
}
