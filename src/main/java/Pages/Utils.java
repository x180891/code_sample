package Pages;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.Base;


import java.util.ArrayList;

public class Utils extends Base {

    MubiOffersPage mubiOffersPages = new MubiOffersPage(driver);
    AxaOffersPage axaOffersPages = new AxaOffersPage(driver);
    public double multipler = 100.0;
    double axaDirectPrice = axaOffersPages.getVariable();
    ArrayList<Double> pricesList = mubiOffersPages.getVariable();

    public Utils(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void showDifferenceByAssurancesInProcent(ExtentTest test) {
        System.out.println("Our selected price from axadirect.pl : " + axaDirectPrice);
        System.out.println("Below we have a difference beetween assurance price offer from axadirect.pl and mubi.pl shown in percentages");
        for (int i = 0; i < (pricesList).size(); i++) {
            double firstNumber = axaDirectPrice / (pricesList).get(i);
            double procentdifference = firstNumber * multipler - 100;
            int intProcentdifference = (int) procentdifference;
            if (intProcentdifference > 0) {
                test.log(LogStatus.PASS,(i + 1) + " Offer on mobi site is more expensive by " + intProcentdifference + " percent, than on axadirect site.");
            } else {
                intProcentdifference = Math.abs(+intProcentdifference);
                test.log(LogStatus.PASS,(i + 1) + " Offer on mobi site is more cheaper by " + intProcentdifference + " percent, than on axadirect site.");

            }
        }
    }

}
