package lc.com.pages;

import lc.com.base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.UUID;

public class AddUserPopUpPage extends base {

    By First_name= By.xpath("//input[@id='txtFirstName']");
    By Last_name= By.xpath("//input[@id='txtLastName']");
    By EmailName =By.cssSelector("#txtEmail");
    By Set_passwored_Check_box=By.xpath("//body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/label[1]/em[1]");
    By Type_Passwored=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[1]/input[1]");
    By ReType_Passwored=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/input[1]");
    By Select_Role=By.xpath("//select[@id='txtUserRole']");
    By Select_role_instructor=By.xpath("//option[contains(text(),'Instructor')]");
    By Save_Btn=By.id("btnClosePopup");
    By Select_Category=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[2]/custom-multiselect[1]/div[1]/button[1]");
    By Select_Specific_Category=By.partialLinkText("Career Developme");
    By Filter_By=By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/h2[1]");
    By Search=By.id("txtsearchUser");
    By Search_Icon=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/em[1]");
    By Check_Name=By.xpath("//span[contains(text(),'1 Active users')]");
    By Three_DotsMenu=By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/a[1]/em[1]");
    By View_Edit=By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By Check_Role=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/span[1]");
    By EmailAssert=By.partialLinkText(Email);
    By Checkk_Email_ADDED_Success=By.xpath( "//div[contains(text(),'" + Email + "')]");
    public void AddFirstNameAndLastName(){





        driver.findElement(First_name).sendKeys(FirstName);
        driver.findElement(Last_name).sendKeys(LastName);
    }


    public void Select_English_language()
    {
        WebElement Select_language=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]"));
        Select dropdown =new Select(Select_language);
        dropdown.selectByVisibleText("English");


    }
    public void Add_User_Email()
    {
        driver.findElement (EmailName).sendKeys(EmailName_Updated);
        Email=EmailName_Updated;
    }
    public void SetPasswored()
    {
        driver.findElement(Set_passwored_Check_box).click();
        driver.findElement(Type_Passwored).sendKeys("Abc.123");
        driver.findElement(ReType_Passwored).sendKeys("Abc.123");

    }
    public void Select_role_instructor()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)", driver.findElement(Select_Role));
        driver.findElement(Select_Role).click();
        driver.findElement(Select_role_instructor).click();

    }
    public void Select_Category()
    {
        driver.findElement(Select_Category).click();
        driver.findElement(Select_Specific_Category).click();
    }
    public void clickOnSave()
    {
        driver.findElement(Save_Btn).click();
    }
    public void AdduserSucessfully()
    {

        Assert.assertTrue(driver.findElement(Checkk_Email_ADDED_Success).isDisplayed());
    }
    public void FilterBy()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -400)", driver.findElement(Filter_By));
        driver.findElement(Filter_By).click();
    }
    public void SearchByNameOrEmail()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)", driver.findElement(Search));
        driver.findElement(Search).sendKeys(Email);
        driver.findElement(Search_Icon).click();

    }
    public void SearchByRole()
    { WebElement SearchBy_Role=driver.findElement(By.id("SelectFilterRoles"));
        Select dropdown =new Select(SearchBy_Role);
        dropdown.selectByIndex(3);


    }
    public void Assert_Name_Success()
    {

        Assert.assertEquals(driver.findElement(Check_Name).getText(),"1 Active users");
    }
    public void ThreeDots()
    {

        driver.findElement(Three_DotsMenu).click();


    }
    public void View_User()

    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)", driver.findElement(View_Edit));

        driver.findElement(View_Edit).click();
    }






}