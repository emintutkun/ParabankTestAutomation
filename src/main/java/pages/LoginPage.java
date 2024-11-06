package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest
    {
        @Step("Kullanıcı Alanı Doldurma")
        public LoginPage fillUserName(String text)
        {
            driver.findElement(By.name("username")).sendKeys(text);
            return this;
        }
        @Step("Şifre Alanı Doldurma")
        public LoginPage fillPassword(String text)
        {
            driver.findElement(By.name("password")).sendKeys(text);
            return this;
        }
        @Step("Login Butonu Tıklama")
        public LoginPage clickLogin ()
        {
            driver.findElement(By.cssSelector("[value='Log In']")).click();
            screenshot();
            return this;
        }
        @Step("Register Butonu Tıklama")
        public LoginPage clickRegister ()
        {
            driver.findElement(By.cssSelector("[href*=\"register.htm\"]")).click();
            return this;
        }


    }
