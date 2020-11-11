package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class LoginLibraryPage {

    public LoginLibraryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
    public WebElement emailLogin;


    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signIn;


    @FindBy(xpath = "//div[@class='row']")
    public WebElement Library;


    @FindBy(xpath = "//span[.='Books']")
    public WebElement mainMenu;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    public WebElement addBook;


    public void login(){
        emailLogin.sendKeys("librarian18@library");
        password.sendKeys("rKG2sP88");
        signIn.click();

        Library.isDisplayed();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(mainMenu)).click();

        mainMenu.click();

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(addBook));
        addBook.click();
    }

}


