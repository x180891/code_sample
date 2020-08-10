package tests;

import Pages.*;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class GetPricesFromBothPages extends Base {


    @Test(priority = 1)
    public void getPricesFromMobi() throws Exception {
        ExtentTest test = reports.startTest("getPricesFromMobi");
       test.log(LogStatus.PASS,"Going to mubi test is starting");
        try {
            MubiHomePage homePageMobi = new MubiHomePage(driver);
            MubiCarDataPage carDataPageMobi = new MubiCarDataPage(driver);
            MubiOffersPage offersPagesMobi = new MubiOffersPage(driver);
            WebDriverWait wait2 = new WebDriverWait(driver, 20);
            driver.get("https://mubi.pl");
           test.log(LogStatus.PASS,"Going to mubi page");
            wait2.until(ExpectedConditions.elementToBeClickable(homePageMobi.policyBtn));
            homePageMobi.clickPolicyBtn();
            homePageMobi.clickStartBtn();
            wait2.until(ExpectedConditions.elementToBeClickable(carDataPageMobi.ocCheckbox));
            carDataPageMobi.checkOcCheckbox();
            carDataPageMobi.selectAcCheckbox();
            carDataPageMobi.selectNoForLeasing();
            carDataPageMobi.inputCarYear();
            carDataPageMobi.inputCarBrand();
            carDataPageMobi.inputCarModel();
            carDataPageMobi.selectTypeOfFuel();
            carDataPageMobi.selectEngineCapacity();
            carDataPageMobi.selectVersionAsAlize();
            carDataPageMobi.sendStartDateAssurance();
            carDataPageMobi.selectCheckboxForAllConsent();
            carDataPageMobi.clickBtnForGoForward();
           test.log(LogStatus.PASS,"nowa strona");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            carDataPageMobi.selectWayOfUseAsPrivate();
            carDataPageMobi.sendingTotalDistanceTravelled();
            carDataPageMobi.setingDistanceFor12NextMonth();
            carDataPageMobi.sendFirstRegistrationDateAndYearWhenBoughtCar();
            carDataPageMobi.selectYearWhenBoughtCar();
            carDataPageMobi.sendCarRegistrationNumber();
            carDataPageMobi.selectWhereCarWillParked();
            carDataPageMobi.setNoForPlanedUsageOutOfBorder();
            carDataPageMobi.selectLastInsurer();
            carDataPageMobi.clickBtnForGoForward();
            carDataPageMobi.selectRbtnForFewerOffers();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            carDataPageMobi.setOwnerBirthday();
            carDataPageMobi.setOwnerAsMineDriverAndDateWhenGetDriverLicense();
            carDataPageMobi.sendOwnerPostCode();
            carDataPageMobi.selectGender();
            carDataPageMobi.selectMeritalStatus();
            carDataPageMobi.selectDontHaveChildren();
            carDataPageMobi.selectZeroAdditionalOwners();
            carDataPageMobi.noDriversYangerThan26();
            carDataPageMobi.selectYearSinceWhenOcWasBought();
            carDataPageMobi.sendPhonNumber();
            carDataPageMobi.sendEmail();
           test.log(LogStatus.PASS,"nowa strona 2");
            carDataPageMobi.clickCalculateBtn();

            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@role, 'presentation')]")));
            wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@role, 'presentation')]")));
            offersPagesMobi.showOffertWithOcAmdAC();
            offersPagesMobi.findAxaOfferts();
            offersPagesMobi.selectPrices();
           test.log(LogStatus.PASS,"Koniec testu");
            reports.endTest(test);

        }catch (Exception e){
           test.log(LogStatus.FAIL,e);
            throw new Exception(e);
        }
    }

    @Test
    public void getPriceFromAxadirect() throws InterruptedException {
        ExtentTest test = reports.startTest("getPriceFromAxadirect");
        test.log(LogStatus.PASS,"start geta");
        driver.get("https://www.axadirect.pl/");

       test.log(LogStatus.PASS,"axa test start");
        AxaCarDataPage carDataPageAxa = new AxaCarDataPage(driver);
        AxaOffersPage offersPageAxa = new AxaOffersPage(driver);
        AxaHomePage homePageAxa = new AxaHomePage(driver);
        WebDriverWait wait2 = new WebDriverWait(driver, 45);
        wait2.until(ExpectedConditions.elementToBeClickable(homePageAxa.policyBtn));
        homePageAxa.clickPolicyBtn();
        homePageAxa.clickFirstButton();
        carDataPageAxa.switchToNewTab(driver);
       test.log(LogStatus.PASS,"nowa strona axa");
        driver.manage().timeouts().pageLoadTimeout(20, SECONDS);
        try {
            System.out.println(driver.getPageSource());
            wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains (text(), 'Wczytywanie...')]")));
        }catch(Exception e) {}
        wait2.until(ExpectedConditions.elementToBeClickable(carDataPageAxa.productionYearInput));
        carDataPageAxa.selectYearProduction();
        carDataPageAxa.selectBrandIdAsRenault();
        carDataPageAxa.selectModelIdAsCaptur();
        carDataPageAxa.selectFuelTypeAsDisel();
        carDataPageAxa.selectEnginePower();
        carDataPageAxa.selectVersionAsAlize();
        carDataPageAxa.selectSideSteeringWheelAsRight();
        carDataPageAxa.selectYearOfFirstRegistration();
        carDataPageAxa.sendCurrentMillage();
        carDataPageAxa.planedMillageForNextYear();
        carDataPageAxa.selectTypeOfUsage();
        carDataPageAxa.selectPlaceWhereParked();
        carDataPageAxa.selectNoInportedRbtn();
        carDataPageAxa.sendWhenNeedAssurance();
        carDataPageAxa.selectNoForUfg();
        carDataPageAxa.selectNoDamageOcInLast5Years();
        carDataPageAxa.selectNoDamageAcInLast5Years();
        carDataPageAxa.selectOwnerBirthday();
        carDataPageAxa.setDriveLicenseIssue();
        carDataPageAxa.setCarPurchaseYearAs2016();
        carDataPageAxa.setPostCode();
        carDataPageAxa.setMeritalStatus();
        carDataPageAxa.setNoForChilderUnder26();
        carDataPageAxa.setNoExtraDrivers();
        carDataPageAxa.sendEmail();
        carDataPageAxa.sendPhone();
        wait2.until(ExpectedConditions.elementToBeClickable(carDataPageAxa.allConsentCheckbox));
        carDataPageAxa.selectAllConsentCheckbox();
        carDataPageAxa.goToNextPage();
        test.log(LogStatus.PASS,"nowa strona axa 2");
        driver.manage().timeouts().pageLoadTimeout(20, SECONDS);
        wait2.until(ExpectedConditions.elementToBeClickable(offersPageAxa.middleOffertTitle));
        offersPageAxa.selectMiddleIfHaveAC();
        reports.endTest(test);

    }

    @Test(priority = 2)
    public void comparePrizes() {
        ExtentTest test = reports.startTest("comparePrizes");
        test.log(LogStatus.PASS,"test 3 porównanie ");
        Utils utils = new Utils(driver);
        utils.showDifferenceByAssurancesInProcent(test);
        test.log(LogStatus.PASS,"test 3 koniec ");
        reports.endTest(test);


    }

}
