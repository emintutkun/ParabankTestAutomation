import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Test(description = "Kullanıcı Oluşturma Kontrolu")
    public void Test1RegisterSucccesfullControl() {

        String username = createUserName();

        loginPage.clickRegister();
        registerPage.fillFirstName("Test")
                    .fillLastName("Test")
                    .fillStreet("Test")
                    .fillCity("Test")
                    .fillState("Test")
                    .fillZipCode("Test")
                    .fillPhoneNumber("123456789")
                    .fillSsn("1234")
                    .fillUsername(username)
                    .fillPassword("test")
                    .fillRepeatedPassword("test")
                    .registerClick();

        homePage.registerControl("Welcome " + username);

    }

}
