package lc.com.pages;

import lc.com.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends base {
    //WebElement Emaill  = driver.findElement(By.xpath("//input[@type='email']"));
    By Emaill =By.xpath("//input[@type='email']");
    // WebElement Passwored = driver.findElement(By.xpath("//*[@id=\"inputPassword\"]"));
    By Password = By.xpath("//*[@id=\"inputPassword\"]");
    // WebElement login= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
    By login= By.xpath("//*[@id=\"btnLogin\"]");
    public void login(String email, String password)
    {
        driver.findElement(Emaill).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(login).click();
    }
}