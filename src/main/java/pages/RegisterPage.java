package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest
{
    @Step("Firstname Alanı Doldurma")
    public RegisterPage  fillFirstName(String text){
        driver.findElement(By.name("customer.firstName")).sendKeys("testfirst");
        return this;
    }
    @Step("Lastname Alanı Doldurma")
    public RegisterPage  fillLastName(String text){
        driver.findElement(By.name("customer.lastName")).sendKeys("testlast");
        return this;
    }
    @Step("Sokak Adres Alanı Doldurma")
    public RegisterPage fillStreet(String text){
        driver.findElement(By.name("customer.address.street")).sendKeys("teststreet");
        return this;
    }
    @Step("Şehir Adres Alanı Doldurma")
    public RegisterPage fillCity(String text){
        driver.findElement(By.name("customer.address.city")).sendKeys("testcity");
        return this;
    }
    @Step("State Alanı Doldurma")
    public RegisterPage fillState(String text){
        driver.findElement(By.name("customer.address.state")).sendKeys("teststate");
        return this;
    }
    @Step("Zipcode Alanı Doldurma")
    public RegisterPage fillZipCode(String text){
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("34200");
        return this;
    }
    @Step("Tel No Alanı Doldurma")
    public RegisterPage  fillPhoneNumber(String text){
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
        return this;
    }
    @Step("Ssn Alanı Doldurma")
    public RegisterPage  fillSsn(String text){
        driver.findElement(By.name("customer.ssn")).sendKeys("1234");
        return this;
    }
    @Step("Kullanıcı Alanı Doldurma")
    public RegisterPage  fillUsername(String text){
        driver.findElement(By.name("customer.username")).sendKeys(text);
        return this;
    }
    @Step("Şifre Alanı Doldurma")
    public RegisterPage  fillPassword(String text){
        driver.findElement(By.name("customer.password")).sendKeys("test");
        return this;
    }
    @Step("Şifre Tekrar Alanı Doldurma")
    public RegisterPage  fillRepeatedPassword(String text){
        driver.findElement(By.name("repeatedPassword")).sendKeys("test");
        screenshot();
        return this;
    }
    @Step("Register Butonu Click İşlemi")
    public RegisterPage  registerClick(){
        driver.findElement(By.cssSelector("[value=\"Register\"]")).click();
        return this;
    }
}
