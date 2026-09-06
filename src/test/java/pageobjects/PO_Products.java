package pageobjects;

// Import class packages for this Page Object (PO)
import org.openqa.selenium.WebDriver; // Selenium WebDriver
import framework.automation.FW_Page; // Automation framework Page Object (PO) class
import framework.utilities.FW_ConfigMgr; // Automation framework Configuration Manager to retrieve testConfig.properties values
import framework.utilities.FW_StringUtils; // Automation framework String Utilities

/**
 * Page Object (PO) class used in the Page Object (PO) design pattern.
 * Inherits from the FW_Page class.
 */
// [Note: Automation Engineer, rename this Page Object (PO) class to match the
// filename.]
public class PO_Products extends FW_Page {

    // [Note: Automation Engineer, define the Page Object (PO) locators (LO) here.]
    private static final String LO_TXT_PRODUCTS = "//span[contains(text(),'Products')]";
    private static final String LO_IMG_HAMBURGER = "//button[@id='react-burger-menu-btn']";
    private static final String LO_BUT_LOGOUT = "//a[contains(text(),'Logout')]";
    private static final String LO_TXT_BACKPACK = "//div[contains(text(), 'Sauce Labs Backpack')]";
    private static final String LO_TXT_FLEECEJACKET = "//div[contains(text(),'Sauce Labs Fleece Jacket')]";
    private static final String LO_TXT_ALLTHETHINGS = "//div[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]";
    private static final String LO_LNK_SHOPPING_CART = "//a[@data-test='shopping-cart-link']";
    private static final String LO_BUT_LOGIN = "//input[@id='login-button']";
    private static final String LO_IMG_TWITTER = "//a[contains(@href,'https://twitter.com/saucelabs')]";
    private static final String LO_IMG_FACEBOOK = "//a[contains(@href,'https://www.facebook.com/saucelabs')]";
    private static final String LO_IMG_LINKEDIN = "//a[contains(@href,'https://www.linkedin.com/company/sauce-labs')] ";

    /**
     * Define the Page Object (PO) constructor.
     * 
     * @param driver The WebDriver object passed from the test method.
     */
    // [Note: Automation Engineer, rename this Page Object (PO) class to match the
    // filename.]
    public PO_Products(WebDriver driver) {
        super(driver);
    }

    // [Note: Automation Engineer, define the Page Object (PO) methods here.]

    public String validateOnPage() {
        String result = validateLocatorExists(LO_TXT_PRODUCTS, FW_ConfigMgr.getDefaultTimeout(),
                FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsHamburger() {
        String result = clickLocator(LO_IMG_HAMBURGER, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsLogout() {
        String result = clickLocator(LO_BUT_LOGOUT, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsBackpack() {
        String result = clickLocator(LO_TXT_BACKPACK, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsFleeceJacket() {
        String result = clickLocator(LO_TXT_FLEECEJACKET, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsAllTheThings() {
        String result = clickLocator(LO_TXT_ALLTHETHINGS, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickShoppingCart() {
        String result = clickLocator(LO_LNK_SHOPPING_CART, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickLogin() {
        String result = clickLocator(LO_BUT_LOGIN, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String clickSwagLabsTwitter() {
        String result = clickLocator(LO_IMG_TWITTER, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsFacebook() {
        String result = clickLocator(LO_IMG_FACEBOOK, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsLinkedin() {
        String result = clickLocator(LO_IMG_LINKEDIN, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    /**
     * switch tab.
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     */
    public String switchWindow(int position) {
        String result = switchToWindowByPosition(1);
        return result;

    }
}