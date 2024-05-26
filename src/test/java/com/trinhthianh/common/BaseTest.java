package com.trinhthianh.common;
import com.trinhthianh.drivers.DriverManager;
import com.trinhthianh.helpers.PropertiesHelper;
import com.trinhthianh.listeners.TestListener;
import com.trinhthianh.pages.CommonPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest extends CommonPage {

    @BeforeMethod
    @Parameters({"UDID","DEVICE_NAME","version"})
    public void createDriver(
            @Optional("jbh6iv85baztz54x") String UDID,
            @Optional("Redmi Note 8 Pro") String DEVICE_NAME,
            @Optional("11") String version)throws Exception {
        AppiumDriver<MobileElement> driver = setupDriver(UDID,DEVICE_NAME,version);
        DriverManager.setDriver(driver);
    }
    @AfterMethod
    public void closeDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.quit();
        }
    }
    public AppiumDriver<MobileElement> setupDriver(String UDID, String DEVICE_NAME, String version) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.UDID, UDID);
        capabilities.setCapability("appPackage", "com.todoist");
        capabilities.setCapability("appActivity", "com.todoist.alias.HomeActivityDefault");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
