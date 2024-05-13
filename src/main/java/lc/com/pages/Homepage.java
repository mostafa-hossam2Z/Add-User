package lc.com.pages;

import lc.com.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends base {

    By Adminstration_tool=By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
    By Adminstration=By.xpath(" //a[@id='btnAdministration']");
    public void Adminstration_tool_btn()
    {

        driver.findElement(Adminstration_tool).click();
    }
    public void Adminstration_btn()
    {

        driver.findElement(Adminstration).click();
    }


}