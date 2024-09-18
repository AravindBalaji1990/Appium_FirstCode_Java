package testdemo;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class TestIosProject {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName("IOS");
        // if the device is simulator then we need to use the .zip format if its real device then we need use the .ipa format
        options.setApp("/Users/aravindbalaji/Documents/Appium/Sample App/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");
        options.setAutomationName(AutomationName.IOS_XCUI_TEST);
        options.setDeviceName("iPhone 15");
        options.setPlatformVersion("17.5");
        options.setUdid("62622A19-BE5E-45CE-AF31-EDE73B855E60");

        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

        System.out.println("the app has been started");
        Thread.sleep(5000);
        driver.quit();
    }
}
