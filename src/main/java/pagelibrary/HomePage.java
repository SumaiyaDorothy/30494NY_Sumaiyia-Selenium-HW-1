package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (xpath = "//a[@class='login']")
    public WebElement signInButton;

     public HomePage()  {
         PageFactory.initElements(driver,this);
     }

     public SignInPage clickSignInButton() {
         clickOnElement(signInButton);

         return new SignInPage();
     }

}