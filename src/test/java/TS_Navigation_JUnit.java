
// JUnit 5
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

// Selenium WebDriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

// Automation framework
import framework.assertions.FW_CustomAssertJU;
import framework.audits.FW_Audit_Connectivity;
import framework.audits.FW_Audit_Sandbox;
import framework.automation.FW_Network;
import framework.driver.FW_Browser;
import framework.formatter.FW_TestSuiteFormatter;
import framework.utilities.FW_ConfigMgr;
import framework.utilities.FW_ReportUtils;
import framework.utilities.FW_ScreenUtils;

// Page Objects - [Note: Automation Engineer, import Page Object (PO) for this Test Suite (TS) here.

import pageobjects.PO_Login; // Page Object (PO) class for Login page
import pageobjects.PO_Products; // Page Object (PO) class for Products page.
import pageobjects.PO_Twitter; // Page Object (PO) class for Twitter.
import pageobjects.PO_Facebook; // Page Object (PO) class for Facebook.
import pageobjects.PO_Linkedin; // Page Object (PO) class for Linkedin.

/**
 * [Note: Automation Engineer, provide a description of this Test Suite (TS)
 * here.]
 * <p>
 * Test suite for SwagLabs functionality.
 * This suite includes tests for various features and behaviors of the SwagLabs
 * sample application.
 * <p>
 * It uses the JUnit testing framework and utilizes the Page Object (PO) design
 * pattern.
 * It also uses a custom assertion class called FW_CustomAssertJU and the
 * autoPass() method specificly designed
 * for this test automation framework, allowing specific details to be returned
 * from individual test steps.
 */
// [Note: Automation Engineer, rename this class to match this Test Suite (TS)
// filename.]
public class TS_Navigation_JUnit {

    // Declare WebDriver variable for this Test Suite
    WebDriver driver;

    // Declare framework variables for this Test Suite
    FW_Audit_Connectivity ao_Audit_Connectivity;
    FW_Audit_Sandbox ao_Audit_Sandbox;
    FW_Network fw_Network;

    // Declare Page Object (PO) variables [Note: Automation Engineer add page
    // objects here.]
    PO_Login po_Login;
    PO_Products po_Products;
    PO_Twitter po_Twitter;
    PO_Facebook po_Facebook;
    PO_Linkedin po_Linkedin;

    /**
     * Define the Test Suite (TS) constructor.
     */
    // Declare constructor [Note: Automation Engineer, rename (TS) to match the
    // filename.]
    public TS_Navigation_JUnit() {
        // Default constructor
    }

    // ================================================================================
    /**
     * Define what happens before entire Test Suite (TS) executes.
     */
    @BeforeAll
    public static void setupTestSuite() {
        // Create an anonymous object and get the simple name of its enclosing class
        String className = new Object() {
        }.getClass().getEnclosingClass().getSimpleName();

        // Call the beforeAll method of FW_TestSuiteFormatter with the class name
        FW_TestSuiteFormatter.beforeAll(className);

        // Load testConfig.properties for Test Suite and all Test Cases
        FW_ConfigMgr.getInstance();
    }

    // ================================================================================
    /**
     * Define what happens before each Test Case (TC) in this Test Suite (TS) is
     * executed.
     * 
     * @param testInfo Information about the current test, provided by JUnit.
     */
    @BeforeEach
    public void setupTestCase(TestInfo testInfo) {
        FW_TestSuiteFormatter.beforeEach(testInfo);

        // Instantiate framework variables for this Test Case
        ao_Audit_Connectivity = new FW_Audit_Connectivity();
        ao_Audit_Sandbox = new FW_Audit_Sandbox();
        fw_Network = new FW_Network();

        // Create WebDriver for Test Case
        driver = FW_Browser.createWebDriver();

        // [Note: Automation Engineer, instantiate Page Object (PO) class(es) for all
        // Test Cases (TC) here.]
        po_Login = new PO_Login(driver);
        po_Products = new PO_Products(driver);
        po_Twitter = new PO_Twitter(driver);
        po_Facebook = new PO_Facebook(driver);
        po_Linkedin = new PO_Linkedin(driver);
    }

    // ================================================================================
    // [Note: Automation Engineer, define Test Cases (TC) for this Test Suite (TS)

    /**
     * Test Case (TC) for SwagLabs Twitter.
     */
    @Test
    @Tag("e2e_test")
    @DisplayName("TC - SwagLabs - Twitter")
    public void tc_swaglabs_twitter() {
        FW_CustomAssertJU.autoPass(po_Login.navigateTo("https://www.saucedemo.com/"));
        FW_CustomAssertJU.autoPass(po_Login.validateOnPage());
        FW_CustomAssertJU.autoPass(po_Login.enterUsername("standard_user"));
        FW_CustomAssertJU.autoPass(po_Login.enterPassword("secret_sauce"));
        FW_CustomAssertJU.autoPass(po_Login.clickLogin());
        FW_CustomAssertJU.autoPass(po_Products.validateOnPage());
        FW_CustomAssertJU.autoPass(po_Products.clickSwagLabsTwitter());
        FW_CustomAssertJU.autoPass(po_Products.switchWindow(1));
        FW_CustomAssertJU.autoPass(po_Twitter.validateOnPage());
        FW_ScreenUtils.takeScreenshot(driver, "Sample", FW_ConfigMgr.getScreenCaptureDirectory());
        FW_ReportUtils.recordNote("This record is all about SwagLabs Twitter.");
    }

    /**
     * Test Case (TC) for SwagLabs Facebook.
     */
    @Test
    @Tag("e2e_test")
    @DisplayName("TC - SwagLabs - Facebook")
    public void tc_swaglabs_facebook() {
        FW_CustomAssertJU.autoPass(po_Login.navigateTo("https://www.saucedemo.com/"));
        FW_CustomAssertJU.autoPass(po_Login.validateOnPage());
        FW_CustomAssertJU.autoPass(po_Login.enterUsername("standard_user"));
        FW_CustomAssertJU.autoPass(po_Login.enterPassword("secret_sauce"));
        FW_CustomAssertJU.autoPass(po_Login.clickLogin());
        FW_CustomAssertJU.autoPass(po_Products.validateOnPage());
        FW_CustomAssertJU.autoPass(po_Products.clickSwagLabsFacebook());
        FW_CustomAssertJU.autoPass(po_Products.switchWindow(1));
        FW_CustomAssertJU.autoPass(po_Facebook.validateOnPage());
        FW_ScreenUtils.takeScreenshot(driver, "Sample", FW_ConfigMgr.getScreenCaptureDirectory());
        FW_ReportUtils.recordNote("This record is all about SwagLabs Facebook.");
    }

    /**
     * Test Case (TC) for SwagLabs Linkedin.
     */
    @Test
    @Tag("e2e_test")
    @DisplayName("TC - SwagLabs - Linkedin")
    public void tc_swaglabs_linkedin() {
        FW_CustomAssertJU.autoPass(po_Login.navigateTo("https://www.saucedemo.com/"));
        FW_CustomAssertJU.autoPass(po_Login.validateOnPage());
        FW_CustomAssertJU.autoPass(po_Login.enterUsername("standard_user"));
        FW_CustomAssertJU.autoPass(po_Login.enterPassword("secret_sauce"));
        FW_CustomAssertJU.autoPass(po_Login.clickLogin());
        FW_CustomAssertJU.autoPass(po_Products.validateOnPage());
        FW_CustomAssertJU.autoPass(po_Products.clickSwagLabsLinkedin());
        FW_CustomAssertJU.autoPass(po_Products.switchWindow(1));
        FW_CustomAssertJU.autoPass(po_Linkedin.validateOnPage());
        FW_ScreenUtils.takeScreenshot(driver, "Sample", FW_ConfigMgr.getScreenCaptureDirectory());
        FW_ReportUtils.recordNote("This record is all about SwagLabs Linkedin.");
    }

    // =======================================================================================================================================================
    /**
     * Define what happens after each Test Case (TC) in this Test Suite (TS) is
     * executed.
     * 
     * @param testInfo Information about the current test, provided by JUnit.
     */
    @AfterEach
    public void tearDownEach(TestInfo testInfo) {
        FW_TestSuiteFormatter.afterEach(testInfo);

        // Dispose WebDriver for Test Case
        FW_Browser.disposeWebDriver(driver);
    }

    // ================================================================================
    /**
     * Define what happens before all Test Case (TC) in this Test Suite (TS) is
     * executed.
     */
    @AfterAll
    public static void tearDownTestSuite() {
        String className = new Object() {
        }.getClass().getEnclosingClass().getSimpleName();
        FW_TestSuiteFormatter.afterAll(className);
    }
}