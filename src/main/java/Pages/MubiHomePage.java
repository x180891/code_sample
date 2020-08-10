package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MubiHomePage {

    @FindBy(className = "accept-privacy-policy")
    public WebElement policyBtn;

    @FindBy(xpath = "//header//a")
    private WebElement startBtn;

    public MubiHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickPolicyBtn() {
        policyBtn.click();
    }

    public void clickStartBtn() {
        startBtn.click();
    }
}
