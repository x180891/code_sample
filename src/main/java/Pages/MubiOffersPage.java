package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.Base;

import java.util.ArrayList;
import java.util.List;

public class MubiOffersPage extends Base {

    @FindBy(xpath = "//div[contains(@role, 'presentation')]")
    public WebElement mobiLoader;

    @FindBy(xpath = "//*[contains(text(),'Znaleźliśmy')]")
    public WebElement elementForCheckPageLoaded;

    @FindBy(xpath = "(//*[contains (text(), 'OC')]//preceding-sibling::div)[1]")
    public WebElement selectOC;

    @FindBy(xpath = "(//*[contains (text(), 'AC')]//preceding-sibling::div)[1]")
    private WebElement selectAC;

    @FindBy(xpath = "//img[@src='./images/insurers/logos/axa.svg']//parent::div/parent::*//div[contains(text(), 'zł')]")

    private List<WebElement> axaOfferts;

    public ArrayList<Double> pricesList = new ArrayList<>();

    public MubiOffersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private static ArrayList<Double> neededVariable;

    public ArrayList<Double> getVariable() {
        return neededVariable;
    }

    public void setVariable(ArrayList<Double> var) {
        this.neededVariable = var;
    }

    public void showOffertWithOcAmdAC() throws InterruptedException {
        Thread.sleep(10000);
        selectOC.click();
        selectAC.click();
    }

    public void findAxaOfferts() {
        axaOfferts.size();
    }

    public void selectPrices() {
        for (WebElement element : axaOfferts) {
            pricesList.add(Double.valueOf(element.getText().replaceAll(",00 zł", "").replaceAll(" ", "")));
        }
        setVariable(pricesList);


    }
}

