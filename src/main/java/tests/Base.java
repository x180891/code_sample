package tests;


import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.URL;



public class Base {

    public RemoteWebDriver driver;
    public ExtentReports reports;
    @BeforeTest
    public void setUp() throws Exception {
         reports = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResults.html");

        try {
            System.out.println("Before test");
            String browserAdress;

            if (System.getenv("HUB_ADDRESS")!=null){
                browserAdress = System.getenv("HUB_ADDRESS");
            }else {
                throw new NullPointerException("Not found enviroment variable HUB_ADDRESS");
            }


            if ("chrome".equals(System.getenv("BROWSER"))){
                System.out.println("Using chrome");
                ChromeOptions options = new ChromeOptions();
                driver = new RemoteWebDriver(new URL(browserAdress), options);


            } else if("firefox".equals(System.getenv("BROWSER"))){
                System.out.println("Using firefox");
                FirefoxOptions options = new FirefoxOptions();
//                driver = new RemoteWebDriver(new URL(browserAdress), options);
                driver = new FirefoxDriver();
            } else{
                throw new NullPointerException("Not found enviroment variable BROWSER");
            }




        }catch (Exception e){
            System.out.println(e);
            throw new Exception(e);
        }
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After test");
        reports.flush();
            driver.quit();
    }
}

