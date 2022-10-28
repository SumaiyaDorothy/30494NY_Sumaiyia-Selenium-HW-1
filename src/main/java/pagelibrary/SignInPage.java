package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy (id = "SubmitCreate")
    public WebElement createAccountButton;

    public SignInPage (){
        PageFactory.initElements(driver,this);

    }

}
