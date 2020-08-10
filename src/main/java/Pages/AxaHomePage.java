package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AxaHomePage {


    @FindBy(xpath = "//*[@class = 'cookie-box__close-box btn btn-secondary']")
    public WebElement policyBtn;

    @FindBy(xpath = "//*[contains (text(), 'Oblicz składkę')]//parent::*[@class = 'btn btn-secondary btn-block']")
    private WebElement firstButton;


    public AxaHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickPolicyBtn() {
        policyBtn.click();
    }

    public void clickFirstButton() {
        firstButton.click();
    }


}
