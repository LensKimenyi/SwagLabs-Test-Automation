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
public class PO_Your_Cart extends FW_Page {

    // [Note: Automation Engineer, define the Page Object (PO) locators (LO) here.]
    private static final String LO_TXT_YOUR_CART = "//span[contains(text(),'Your Cart')]";
    private static final String LO_TXT_BACKPACK = "//div[contains(text(), 'Sauce Labs Backpack')]";
    private static final String LO_TXT_FLEECEJACKET = "//div[contains(text(),'Sauce Labs Fleece Jacket')]";
    private static final String LO_BUT_ADDTOCART = "//button[contains(text(),'Add to cart')]";
    private static final String LO_BUT_REMOVE = "//button[contains(text(),'Remove')]";
    private static final String LO_BUT_CHECKOUT = "//button[@id='checkout']";

    /**
     * Define the Page Object (PO) constructor.
     * 
     * @param driver The WebDriver object passed from the test method.
     */
    // [Note: Automation Engineer, rename this Page Object (PO) class to match the
    // filename.]
    public PO_Your_Cart(WebDriver driver) {
        super(driver);
    }

    // [Note: Automation Engineer, define the Page Object (PO) methods here.]

    public String validateOnPage() {
        String result = validateLocatorExists(LO_TXT_YOUR_CART, FW_ConfigMgr.getDefaultTimeout(),FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsBackpack() {
        String result = clickLocator(LO_TXT_BACKPACK, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickAddToCart() {
        String result = clickLocator(LO_BUT_ADDTOCART, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String validateonpage() {
        String result = validateLocatorExists(LO_BUT_REMOVE, FW_ConfigMgr.getDefaultTimeout(), 0);
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickSwagLabsFleeceJacket() {
        String result = clickLocator(LO_TXT_FLEECEJACKET, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }

    public String clickCheckout() {
        String result = clickLocator(LO_BUT_CHECKOUT , FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName());
        return result;
    }
}