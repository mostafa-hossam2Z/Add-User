package lc.com.pages;
import lc.com.base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ViewEditUserpage extends base {
    By AddRole = By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[2]/div[1]/a[1]");
    By SelectSegmentName = By.xpath( "//span[contains(text(),'Select Segment Name')]");
    By SelectSegmentAddUser = By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ol[1]/li[4]/div[1]/span[1]");
    By SaveEditRule =By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[3]/button[1]");
    By SaveFinish=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/footer[1]/div[1]/button[1]");
    By SaveButtonUnClickable=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/footer[1]/div[1]/button[1]");
    By CheckCoInstructorRuleAddedSuccessfully=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/a[1]");
    By CheckViewPageOpenedSuccessfully=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/button[1]/span[2]");
    public void AddNewRole()
    {

        driver.findElement(AddRole).click();
    }
    public void SelectSegmentName()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)", driver.findElement(SelectSegmentName));
        driver.findElement(SelectSegmentName).click();
        driver.findElement(SelectSegmentAddUser).click();
    }
    public void SelectRoleName()
    { WebElement Select_Role_Name=driver.findElement(By.cssSelector("#txtUserRole1"));
        Select dropdown =new Select(Select_Role_Name);
        dropdown.selectByIndex(6);
    }
    public void SelectCategory()
    {

        WebElement Select_Role_Name=driver.findElement(By.cssSelector("body.minified.smart-ltr.desktop-detected.modal-open:nth-child(2) div.modal.fade.in:nth-child(34) div.modal-dialog.modal-lg div.modal-content div.modal-body.lms-padding-0.custom-scroll div.tab-content div.tab-pane.fade.active.in:nth-child(1) form.smart-form.ng-pristine.ng-valid.ng-valid-required div.lms-fields-cont.custom-scroll.lms-padding-20:nth-child(1) div.lms-row.lms-clear.lms-users-multiroles-cont:nth-child(2) ul.col-xs-12.lms-padding-0.dd-list:nth-child(1) li.lms-row.lms-clear.lms-margin-top-0-imp:nth-child(2) div.col-xs-12.lms-padding-15-imp.lms-margin-bottom-10.lms-border div.lms-row.lms-clear div.col-xs-12.lms-padding-0.lms-margin-top-10:nth-child(2) div.col-xs-12 custom-multiselect.lms-multi-select.lms-announcement-select.lms-user-subj-select.ng-pristine.ng-untouched.ng-valid.ng-empty div.btn-group > button.btn.btn-default.btn-block.dropdown-toggle"));
        Select dropdown =new Select(Select_Role_Name);
        dropdown.selectByIndex(1);
    }
    public void SaveEdit()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)", driver.findElement(SaveEditRule));
        driver.findElement(SaveEditRule).click();
        driver.findElement(SaveFinish).click();

    }
    public void CannotEdit()
    {

        Assert.assertTrue(driver.findElement(SaveButtonUnClickable).isEnabled());

    }

    public void checkMore1Role()
    {

        Assert.assertEquals(driver.findElement(CheckCoInstructorRuleAddedSuccessfully).getText(),"&1 more");

    }
    public void RefreshPage() {
        driver.navigate().refresh();


    }
    public void AssertViewPage()
    {
        Assert.assertEquals(driver.findElement(CheckViewPageOpenedSuccessfully).getText(),"Edit user's info");




    }



}