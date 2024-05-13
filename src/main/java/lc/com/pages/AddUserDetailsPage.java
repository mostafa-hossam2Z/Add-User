package lc.com.pages;

import lc.com.base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class AddUserDetailsPage extends base {
    By Choose_Segment=By.cssSelector("#school_a8a3af14-3d79-49a2-91e7-5f43fe4d71c8");
    By AddUsersButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/h2[1]");
    By AddUserButton=By.id("btnAddUser");



    public void clickOnSegment()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)", driver.findElement(Choose_Segment));
        driver.findElement(Choose_Segment).click();
    }
    public void AddUsers()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -400)",driver.findElement(AddUsersButton));
        driver.findElement(AddUsersButton).click();
        driver.findElement(AddUserButton).click();


    }




}