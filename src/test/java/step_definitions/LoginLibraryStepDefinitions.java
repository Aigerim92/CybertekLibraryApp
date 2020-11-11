package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginLibraryPage;
import utilities.Driver;

public class LoginLibraryStepDefinitions {

LoginLibraryPage loginLibraryPage = new LoginLibraryPage();



    @Given("navigate to URL")
    public void navigate_to_url() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }



    @When("user enters emailLogin")
    public void user_enters_email_login() {
    loginLibraryPage.login();


    }
    @When("user enters password")
    public void user_enters_password() {
        loginLibraryPage.login();

    }


    @When("sign in")
    public void sign_in() {
        loginLibraryPage.login();

    }
    @Then("user should see the {string} page")
    public void user_should_see_the_page(String string) throws InterruptedException{
     Thread.sleep(20);

        String expected = "Users, Books, Borrowed Books";
        String actual = loginLibraryPage.Library.getText();
        Assert.assertTrue(expected, Boolean.parseBoolean(actual));

    }


        @Then("user click on {string} tab")
        public void user_click_on_tab(String string) {

            String expectedResult="Books";
            String actualResult=loginLibraryPage.mainMenu.getText();
        }



        @Then("user should popup of {string}")
        public void user_should_popup_of(String string) {

        String expectedPopup="Add Book";
        String actualPopup=loginLibraryPage.addBook.getTagName();

        }


    }








