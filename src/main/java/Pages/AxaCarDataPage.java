package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class AxaCarDataPage {

    @FindBy(xpath = "//*[contains (text(), 'Wczytywanie...')]")
    public WebElement loader;

    @FindBy(xpath = "//select[@formcontrolname='productionYear']")
    public WebElement productionYearInput;

    @FindBy(xpath = "//select[@formcontrolname='productionYear']//option[contains (text(), '2015')]")
    private WebElement yearOfProduction2015;

    @FindBy(xpath = "//select[@formcontrolname='brandId']")
    private WebElement brandIdInput;

    @FindBy(xpath = "//*[@label='POPULARNE MARKI:']//option[contains(text(), 'RENAULT')]")
    private WebElement brandIdRenault;

    @FindBy(xpath = "//select[@formcontrolname='modelId']")
    private WebElement modelIdInput;

    @FindBy(xpath = "//select[@formcontrolname='fuelType']")
    private WebElement fuelTypeInput;

    @FindBy(xpath = "//select[@formcontrolname='enginePower']")
    private WebElement enginePowerInput;

    @FindBy(xpath = "(//div[@class='vehicle-version'])[1]")
    private WebElement alizeVersionCheckBox;

    @FindBy(xpath = "//input[@value='LEFT']")
    private WebElement steeringWheelRightSideCheckBox;

    @FindBy(xpath = "//*[@name='firstRegistrationDate']//select[@name='year']")
    private WebElement yearOfFirstRegistrationInput;

    @FindBy(xpath = "//*[@name='firstRegistrationDate']//option[contains (text(), '2016')]")
    private WebElement yearOfFirstRegistration2016;

    @FindBy(xpath = "//*[@name='firstRegistrationDate']//select[@name='month']")
    private WebElement monthOfFirstRegistrationInput;

    @FindBy(xpath = "//*[@name='firstRegistrationDate']//option[contains (text(), 'październik')]")
    private WebElement mothOfFirstRegistration10;

    @FindBy(xpath = "//*[@name='firstRegistrationDate']//select[@name='day']")
    private WebElement dayOfFirstRegistrationInput;

    @FindBy(xpath = "//select[@name='day']//option[contains (text(), '20')]")
    private WebElement dayOfFirstRegistration20;

    @FindBy(xpath = "//input[@placeholder='wpisz z dokładnością do 100 km']")
    private WebElement currentMillage;

    @FindBy(xpath = "//select[@formcontrolname='plannedMileage']")
    private WebElement planedMillageInput;

    @FindBy(xpath = "//select[@formcontrolname='plannedMileage']//option[contains (text(), ' Poniżej 5 000')]")
    private WebElement planedMillageLessThan5Thou;

    @FindBy(xpath = "//select[@formcontrolname='usageType']")
    private WebElement typeOfUsageInput;

    @FindBy(xpath = "//select[@formcontrolname='nightParkingType']")
    private WebElement placeWhereParkedInput;

    @FindBy(xpath = "//*[@data-group='isImported' and @value ='false']")
    private WebElement noInportedRbtn;

    @FindBy(xpath = "//*[@name='startDateOfNewPolicy']//*[@name = 'year']")
    private WebElement startPolicyDayYearInput;

    @FindBy(xpath = "//*[@formcontrolname='startDateOfNewPolicy']//option[contains (text(), '2021')]")
    private WebElement year2020;

    @FindBy(xpath = "//*[@name='startDateOfNewPolicy']//*[@name = 'month']")
    private WebElement startPolicyDayMonthInput;

    @FindBy(xpath = "//*[@formcontrolname='startDateOfNewPolicy']//option[@value = '1']")
    private WebElement selectMonth;

    @FindBy(xpath = "//*[@name='startDateOfNewPolicy']//*[@name = 'day']")
    private WebElement startPolicyDayDayInput;

    @FindBy(xpath = "(//*[@name='day']//*[@value= '1'])[2]")
    private WebElement selectDay;

    @FindBy(xpath = "//*[@name='ufgPathQuestion']//*[@value= 'false']")
    private WebElement noForUfgCheckBox;

    @FindBy(xpath = "//select[@formcontrolname = 'damageMtplFiveYearsCount']")
    private WebElement ocDemageInLast5YearsInput;

    @FindBy(xpath = "//select[@formcontrolname = 'damageCascoFiveYearsCount']")
    private WebElement acDemageInLast5YearsInput;

    @FindBy(xpath = "//*[@name= 'dateOfBirth']//select[@name = 'year']")
    private WebElement ownerBirthdayYear;

    @FindBy(xpath = "//*[@name= 'dateOfBirth']//option[contains (text(), '1992')]")
    private WebElement yearOfBirth1992;

    @FindBy(xpath = "//*[@name= 'dateOfBirth']//select[@name = 'month']")
    private WebElement ownerBirthdayMonth;

    @FindBy(xpath = "//*[@name= 'dateOfBirth']//option[@value  = '11']")
    private WebElement monthOfBirth11;

    @FindBy(xpath = "//*[@name= 'dateOfBirth']//select[@name = 'day']")
    private WebElement ownerBirthdayDay;

    @FindBy(xpath = "//*[@name= 'dateOfBirth']//option[@value  = '30']")
    private WebElement dayOfBirth30;

    @FindBy(xpath = "//*[@name= 'licenceIssueDate']//select")
    private WebElement licenseIssueDateInput;

    @FindBy(xpath = "//*[@name= 'licenceIssueDate']//select/option[@value='2012']")
    private WebElement licenseIssueDate2012;

    @FindBy(xpath = "//select[@formcontrolname = 'yearPurchaseVehicle']")
    private WebElement purcheYearInput;

    @FindBy(xpath = "//select[@formcontrolname = 'yearPurchaseVehicle']/option[@value  = '2016']")
    private WebElement purcheYear2016;

    @FindBy(id = "zipCodeInputId")
    private WebElement idPostCode;

    @FindBy(xpath = "//select[@formcontrolname = 'maritalStatus']")
    private WebElement meritalStatusInput;

    @FindBy(xpath = "//input[@data-group= 'childrenUnder26Age' and @value = 'false']")
    private WebElement noForChildrenUnder26;

    @FindBy(xpath = "//*[@data-group = 'youngestDriver' and @value = 'false']")
    private WebElement noExtraDriversRbtn;

    @FindBy(xpath = "//input[@formcontrolname = 'email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@formcontrolname = 'phone']")
    private WebElement phoneInput;

    @FindBy(xpath = "//*[@for= 'allAec']")
    public WebElement allConsentCheckbox;

    @FindBy(xpath = "//*[@class= 'btn btn-sm']")
    private WebElement nextPageButton;


    public AxaCarDataPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void switchToNewTab(WebDriver driver) throws InterruptedException {
        if("chrome".equals(System.getenv("BROWSER"))){
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));
            driver.close();
            driver.switchTo().window(tabs2.get(1));
        }else {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));
            driver.close();
            tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));
        }
    }


    public void selectYearProduction() throws InterruptedException {
        Thread.sleep(3000);
        productionYearInput.click();
        yearOfProduction2015.click();
    }

    public void selectBrandIdAsRenault() {
        brandIdInput.click();
        brandIdRenault.click();
    }

    public void selectModelIdAsCaptur() throws InterruptedException {
        Thread.sleep(1000);
        if("chrome".equals(System.getenv("BROWSER"))) {
            modelIdInput.click();
            modelIdInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        }else{
            Select s = new Select(modelIdInput);
            s.selectByVisibleText("Captur");
        }

    }

    public void selectFuelTypeAsDisel() throws InterruptedException {
        Thread.sleep(1000);
        if ("chrome".equals(System.getenv("BROWSER"))) {
            fuelTypeInput.click();
            fuelTypeInput.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        } else {
            Select s = new Select(fuelTypeInput);
            s.selectByVisibleText("Diesel");
        }
    }

    public void selectEnginePower() {
        if ("chrome".equals(System.getenv("BROWSER"))) {
            enginePowerInput.click();
            enginePowerInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        } else {
            Select s = new Select(enginePowerInput);
            s.selectByVisibleText("90 KM / 66 kW");
        }
    }

    public void selectVersionAsAlize() {
        alizeVersionCheckBox.click();
    }


    public void selectSideSteeringWheelAsRight() {
        steeringWheelRightSideCheckBox.click();
    }

    public void selectYearOfFirstRegistration() {
        yearOfFirstRegistrationInput.click();
        yearOfFirstRegistration2016.click();
        monthOfFirstRegistrationInput.click();
        mothOfFirstRegistration10.click();
        dayOfFirstRegistrationInput.click();
        dayOfFirstRegistration20.click();
    }

    public void sendCurrentMillage() {
        currentMillage.click();
        currentMillage.sendKeys("10000");
    }

    public void planedMillageForNextYear() {
        planedMillageInput.click();
        planedMillageLessThan5Thou.click();
    }

    public void selectTypeOfUsage() {
        typeOfUsageInput.click();
        typeOfUsageInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectPlaceWhereParked() {
        placeWhereParkedInput.click();
        placeWhereParkedInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectNoInportedRbtn() {
        noInportedRbtn.click();
    }

    public void sendWhenNeedAssurance() {
        startPolicyDayYearInput.click();
        year2020.click();
        startPolicyDayMonthInput.click();
        selectMonth.click();
        startPolicyDayDayInput.click();
        selectDay.click();
    }

    public void selectNoForUfg() {
        noForUfgCheckBox.click();
    }

    public void selectNoDamageOcInLast5Years() throws InterruptedException {
        Thread.sleep(1000);
        ocDemageInLast5YearsInput.click();
        ocDemageInLast5YearsInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectNoDamageAcInLast5Years() {
        acDemageInLast5YearsInput.click();
        acDemageInLast5YearsInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectOwnerBirthday() {
        ownerBirthdayYear.click();
        yearOfBirth1992.click();
        ownerBirthdayMonth.click();
        monthOfBirth11.click();
        ownerBirthdayDay.click();
        dayOfBirth30.click();
    }

    public void setDriveLicenseIssue() {
        licenseIssueDateInput.click();
        licenseIssueDate2012.click();
    }

    public void setCarPurchaseYearAs2016() {
        purcheYearInput.click();
        purcheYear2016.click();
    }

    public void setPostCode() {
        idPostCode.sendKeys("00154");
    }

    public void setMeritalStatus() {
        meritalStatusInput.click();
        meritalStatusInput.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void setNoForChilderUnder26() {
        noForChildrenUnder26.click();
    }

    public void setNoExtraDrivers() {
        noExtraDriversRbtn.click();
    }

    public void sendEmail() {
        emailInput.sendKeys("jankowalski@gmail.com");
    }

    public void sendPhone() {
        phoneInput.sendKeys("123456789");
    }

    public void selectAllConsentCheckbox() {
        allConsentCheckbox.click();
    }

    public void goToNextPage() {
        nextPageButton.click();
    }

}
