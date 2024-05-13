package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lc.com.base;
import lc.com.pages.*;

public class AddUsersteps extends base {
    loginpage loginpageobj=new loginpage();
    Homepage homepageobj=new Homepage();
    ViewEditUserpage ViewEditUserobj=new ViewEditUserpage();
    AddUserDetailsPage UserInfoobj=new AddUserDetailsPage();
    AddUserPopUpPage AddUserPopUpobj=new AddUserPopUpPage();

    @Given("User Fill {string} And {string}")
    public void UserFillEmailAndPasswordasAdmin(String email,String password) {
        String Email=properties.getProperty(email);
        String Password=properties.getProperty(password);
        loginpageobj.login(Email,Password);
    }

    @And("Click on Administration tool from Sidebar Menu")
    public void ClickonAdministrationtoolfromSidebarMenu() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        homepageobj.Adminstration_tool_btn();
    }
    @And("Choose  Administration from Sidebar Menu")
    public void chooseAdministrationFromSidebarMenu() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homepageobj.Adminstration_btn();
    }

    @And("select the Segment")
    public void selectTheSegment() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        UserInfoobj.clickOnSegment();


    }

    @When("Click on Add Users")
    public void clickOnAddUser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        UserInfoobj.AddUsers();

    }





    @And("Add First Name And Last Name")
    public void addFirstNameAndLastName() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.AddFirstNameAndLastName();
    }

    @And("Choose English Language")
    public void chooseEnglishLanguage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.Select_English_language();
    }



    @And("Enter Email")
    public void enterEmail() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.Add_User_Email();

    }

    @And("Set password")
    public void setPasswored() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.SetPasswored();

    }
    @And("Choose  Language")
    public void chooseLanguage() {
        AddUserPopUpobj.Select_English_language();


    }

    @And("Select Role")
    public void selectRole() {
        AddUserPopUpobj.Select_role_instructor();

    }

    @And("Choose Category")
    public void chooseCategory() {
        AddUserPopUpobj.Select_Category();

    }

    @And("Click on Save Button")
    public void clickOnSaveButton() {
        AddUserPopUpobj.clickOnSave();
    }

    @Then("Check User Added Successfully")
    public void checkUserAddedSuccessfully() {
        AddUserPopUpobj.AdduserSucessfully();

    }

    @When("Click On FilterBy")
    public void clickOnFilterBy() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.FilterBy();
    }

    @And("Search By Name Or Email")
    public void searchByNameOrEmail() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.SearchByNameOrEmail();
    }


    @And("Search By ROLE")
    public void searchByROLE() {
        AddUserPopUpobj.SearchByRole();

    }

    @Then("Check User By Name Added Successfully")
    public void checkUserByNameAddedSuccessfully() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.Assert_Name_Success();

    }

    @And("Click On Three Dots Menu")
    public void clickOnThreeDotsMenu() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.ThreeDots();

    }

    @And("View And Edit USER Page Opened")
    public void selectViewAndEditUSER() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AddUserPopUpobj.View_User();
    }

    @And("Add Another Role")
    public void addAnotherRole() {
        ViewEditUserobj.AddNewRole();

    }

    @And("Select Segment Name")
    public void selectSegmentName() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ViewEditUserobj.SelectSegmentName();
    }

    @And("Select Role Name")
    public void selectRoleName() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ViewEditUserobj.SelectRoleName();
    }

    @And("Select Category")
    public void selectCategory() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ViewEditUserobj.SelectCategory();
    }

    @And("Save Edit User Role")
    public void saveEditUserRole() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ViewEditUserobj.SaveEdit();

    }


    @Then("Can't Save Edit User Role")
    public void canTSaveEditUserRole() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ViewEditUserobj.CannotEdit();

    }

    @Then("Check Add Co Instructor Rule")
    public void checkAddCoInstructorRule() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ViewEditUserobj.checkMore1Role();
    }

    @And("Refresh Browser")
    public void refreshBrowser() {
        ViewEditUserobj.RefreshPage();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @And("View Page Opened Successfully")
    public void viewPageOpenedSuccessfully() {
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("CHeck View Page Opened Successfully")
    public void checkViewPageOpenedSuccessfully() {
        ViewEditUserobj.AssertViewPage();


    }


}