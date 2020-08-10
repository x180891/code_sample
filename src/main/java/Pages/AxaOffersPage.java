package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AxaOffersPage {


    public double axaDirectPrice2;

    @FindBy(xpath = "(//*[@class = 'variants__submit']//*[@class = 'axa-icon-arrow-right'])[1]")
    public WebElement firstOfferBtnRightArrow;

    @FindBy(xpath = "(//div[@class = 'variants__prices'])[3]")
    public WebElement notHighlightedPrices;

    @FindBy(xpath = "(//div[@class = 'variants__prices'])[4]")
    public WebElement highlightedPrices;

    @FindBy(xpath = "(//axa-header-row[@class = 'table-row has-line']/div[3])[2]")
    public WebElement middleOffertTitle;

    @FindBy(xpath = "(//div[@class = 'table-cell variants__title']/strong)[4]")
    private WebElement middleOffertPrice;

    @FindBy(xpath = "(//axa-header-row[@class = 'table-row has-line']/div[4])[2]")
    private WebElement rightOffertTitle;

    @FindBy(xpath = "(//div[@class = 'table-cell variants__title highlighted']/strong)[2]")
    private WebElement rightOffertPrice;

    @FindBy(xpath = "(//axa-header-row[@class = 'table-row has-line']/div[2])[2]")
    private WebElement leftOffertTitle;

    @FindBy(xpath = "(//div[@class = 'table-cell variants__title']/strong)[3]")
    private WebElement leftOffertPrice;


    public AxaOffersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    private static double neededVariable;

    public double getVariable() {
        return neededVariable;
    }

    public void setVariable(double var) {
        this.neededVariable = var;
    }

    public void selectMiddleIfHaveAC() throws InterruptedException {
        Thread.sleep(2000);
        double axaDirectPrice;
        if ((middleOffertTitle.getText()).contains("AC")) {
            axaDirectPrice = Double.valueOf(middleOffertPrice.getText().replaceAll("zł / rok", "").replaceAll(" ", ""));
        } else if ((rightOffertTitle.getText()).contains("AC")) {
            axaDirectPrice = Double.valueOf(rightOffertPrice.getText().replaceAll("zł / rok", "").replaceAll(" ", ""));
        } else {
            axaDirectPrice = Double.valueOf(leftOffertPrice.getText().replaceAll("zł / rok", "").replaceAll(" ", ""));
        }
        setVariable(axaDirectPrice);
    }


}
