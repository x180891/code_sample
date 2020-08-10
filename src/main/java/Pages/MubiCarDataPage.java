package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MubiCarDataPage {

    @FindBy(xpath = "//div[1]/div/span/span[1]/img")
    public WebElement ocCheckbox;

    @FindBy(xpath = "//div[2]/div/span/span[1]")
    private WebElement acCheckbox;

    @FindBy(xpath = "//div[2]/div/span/span[1]/img")
    private WebElement selectedAcCheckbox;

    @FindBy(xpath = "//div/fieldset//label[1]//input")
    private WebElement noForLeasing;

    @FindBy(id = "downshift-10-input")
    private WebElement inputCarYear;

    @FindBy(id = "downshift-12-input")
    private WebElement inputCarBrand;

    @FindBy(id = "downshift-14-input")
    private WebElement inputCarModel;

    @FindBy(xpath = "//input[@name = 'car.fuelType' and @value='00100003']")
    private WebElement radioBtnFuelDiesel;

    @FindBy(xpath = "//input[@name = 'car.engineCapacity' and @value='1461']")
    public WebElement radioBtnEngineCapacity1461;

    @FindBy(name = "insurance.startDate")
    private WebElement startDateAssuranceInput;

    @FindBy(name = "consent.all.calculation")
    private WebElement allConsentCheckbox;

    @FindBy(xpath = "//*[contains(text(),'Przejdź dalej')]")
    private WebElement goForwardBtn;

    @FindBy(xpath = "//*[@name = 'plannedUsage.wayOfUse' and @value='private']")
    private WebElement privateWayOfUseRbtn;

    @FindBy(xpath = "//*[@value='private']")
    private WebElement privateUsageRadioBtn;

    @FindBy(name = "car.mileage")
    public WebElement totalDistanceTravelledInput;

    @FindBy(xpath = "//div[contains (text(), '12 miesięcy?')]//following-sibling::div//*[@aria-autocomplete = 'list']")
    public WebElement inputNext12MonthDistance;

    @FindBy(id = "downshift-35-item-1")
    public WebElement inputNext12MonthDistanceOption1;

    @FindBy(name = "car.firstRegistrationDate")
    private WebElement firstRegistrationDate;

    @FindBy(xpath = "//*[@value = 'pol']")
    private WebElement firstRegisteryInPolandRadioBtn;

    @FindBy(name = "car.registrationNumber")
    private WebElement registrationNumberInput;

    @FindBy(xpath = "//div[contains (text(), 'najczęściej parkowany')]//following-sibling::div//*[@aria-autocomplete = 'list']")
    private WebElement listPlacesWhereCareWillParked;

    @FindBy(xpath = "//*[@name= 'plannedUsage.abroadUsage' and @value = 'false']")
    private WebElement notPlanedUsageOutOfBorderRadioBtn;

    @FindBy(xpath = "//div[contains (text(), 'Ostatni ubezpieczyciel')]//following-sibling::div//*[@aria-autocomplete = 'list']")
    private WebElement lastCarInsurerDropdownList;

    @FindBy(xpath = "//input[@name = 'personalDataPath' and @value='false']")
    public WebElement RBtnForFewerOffers;

    @FindBy(name = "owner.birthDate")
    private WebElement ownerBirthdayInput;

    @FindBy(xpath = "//*[@name ='owner.driverRole' and @value = 'main_driver']")
    private WebElement mineDriverRbtn;

    @FindBy(xpath = "//div[contains (text(), 'kat. B?')]//following-sibling::div//*[@aria-autocomplete = 'list']")
    private WebElement yearOfGetDrivingLicenseByOwnerInput;

    @FindBy(name = "owner.legalAddress.zipCode")
    private WebElement ownerPostCodeInput;

    @FindBy(xpath = "//*[@value= 'man']")
    private WebElement genderRbtnForMan;

    @FindBy(xpath = "//*[@value= 'single']")
    private WebElement singleMaritalStatusRbtn;

    @FindBy(xpath = "//*[@name= 'owner.hasChildren' and @value = 'false']")
    private WebElement dontHaveChildrenRbtn;

    @FindBy(xpath = "//*[@name= 'car.coownersCount' and @value = '0']")
    private WebElement additionalOwnersZeroRbtn;

    @FindBy(xpath = "//*[@name= 'car.hasAdditionalDrivers' and @value = 'false']")
    private WebElement zeroAdditionalDriversRbtn;

    @FindBy(xpath = "//div[contains (text(), 'OC dla swoich')]//following-sibling::div//*[@aria-autocomplete = 'list']")
    private WebElement listYearsSinceWhenOcWasBought;

    @FindBy(name = "insurance.phoneNumber")
    private WebElement telNumberInput;

    @FindBy(xpath = "//*[@name ='owner.acHistorySame' and @value = 'YES']")
    private WebElement yesRbtnForSameAcStoryAsOc;

    @FindBy(name = "insurant.email")
    private WebElement emailInput;

    @FindBy(xpath = "//*[contains(text(),'Kalkuluj')]")
    private WebElement calculateBtn;


    public MubiCarDataPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkOcCheckbox() {
        if (ocCheckbox.isDisplayed()) {
        } else if (!ocCheckbox.isDisplayed()) {
            System.exit(0);
        }
    }

    public void selectAcCheckbox() {
        acCheckbox.click();
        if (selectedAcCheckbox.isDisplayed()) {
        } else if (!selectedAcCheckbox.isDisplayed()) {
            System.out.println("AC is not selected");
            System.exit(0);
        }
    }

    public void selectNoForLeasing() {
        noForLeasing.click();
    }

    public void inputCarYear() throws InterruptedException {
        inputCarYear.sendKeys("2015");
        inputCarYear.sendKeys(Keys.ARROW_DOWN);
        inputCarYear.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        inputCarYear.sendKeys(Keys.TAB);
    }

    public void inputCarBrand() throws InterruptedException {
        inputCarBrand.sendKeys("RENAULT");
        inputCarBrand.sendKeys(Keys.ARROW_DOWN);
        inputCarBrand.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        inputCarBrand.sendKeys(Keys.TAB);

    }

    public void inputCarModel() throws InterruptedException {
        inputCarModel.sendKeys("Captur");
        inputCarModel.sendKeys(Keys.ARROW_DOWN);
        inputCarModel.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        inputCarModel.sendKeys(Keys.TAB);
    }

    public void selectTypeOfFuel() throws InterruptedException {
        radioBtnFuelDiesel.click();
        Thread.sleep(1000);
        radioBtnFuelDiesel.sendKeys(Keys.TAB);
    }

    public void selectEngineCapacity() {
        radioBtnEngineCapacity1461.click();
    }

    public void selectVersionAsAlize() {
        radioBtnEngineCapacity1461.sendKeys(Keys.TAB, Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendStartDateAssurance() {
        startDateAssuranceInput.sendKeys("01012021");
        startDateAssuranceInput.sendKeys(Keys.ENTER);
    }

    public void selectCheckboxForAllConsent() throws InterruptedException {
        Thread.sleep(1000);
        allConsentCheckbox.click();
    }

    public void clickBtnForGoForward() throws InterruptedException {
        Thread.sleep(2000);
        goForwardBtn.click();
    }

    public void selectWayOfUseAsPrivate() throws InterruptedException {
        Thread.sleep(2000);
        privateWayOfUseRbtn.click();
    }

    public void sendingTotalDistanceTravelled() {
        totalDistanceTravelledInput.sendKeys("10");
    }

    public void setingDistanceFor12NextMonth() {
        totalDistanceTravelledInput.sendKeys(Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendFirstRegistrationDateAndYearWhenBoughtCar() throws InterruptedException {
        Thread.sleep(1000);
        firstRegistrationDate.sendKeys("20102016");
        Thread.sleep(1000);
    }

    public void selectYearWhenBoughtCar() throws InterruptedException {
        firstRegistrationDate.sendKeys(Keys.TAB, Keys.ESCAPE, Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(1000);
    }

    public void sendCarRegistrationNumber() {
        registrationNumberInput.sendKeys("WP87431");
    }

    public void selectWhereCarWillParked() {
        registrationNumberInput.sendKeys(Keys.TAB, Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void setNoForPlanedUsageOutOfBorder() {
        notPlanedUsageOutOfBorderRadioBtn.click();
    }

    public void selectLastInsurer() {
        notPlanedUsageOutOfBorderRadioBtn.sendKeys(Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectRbtnForFewerOffers() throws InterruptedException {
        Thread.sleep(2000);
        RBtnForFewerOffers.click();
    }

    public void setOwnerBirthday() {
        ownerBirthdayInput.sendKeys("30111992");
    }

    public void setOwnerAsMineDriverAndDateWhenGetDriverLicense() throws InterruptedException {
        Thread.sleep(2000);
        mineDriverRbtn.click();
        mineDriverRbtn.sendKeys(Keys.TAB, "2012", Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendOwnerPostCode() {
        ownerPostCodeInput.sendKeys("00154");
    }

    public void selectGender() {
        genderRbtnForMan.click();
    }

    public void selectMeritalStatus() throws InterruptedException {
        Thread.sleep(1000);
        singleMaritalStatusRbtn.click();
    }

    public void selectDontHaveChildren() {
        dontHaveChildrenRbtn.click();
    }

    public void selectZeroAdditionalOwners() {
        additionalOwnersZeroRbtn.click();
    }

    public void noDriversYangerThan26() {
        zeroAdditionalDriversRbtn.click();
    }

    public void selectYearSinceWhenOcWasBought() {
        zeroAdditionalDriversRbtn.sendKeys(Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void sendPhonNumber() {
        telNumberInput.sendKeys("123456789");
    }

    public void sendEmail() {
        emailInput.sendKeys("jankowalski@gmail.com");
    }

    public void clickCalculateBtn() {
        calculateBtn.click();
    }

}

