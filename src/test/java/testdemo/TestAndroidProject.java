package testdemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;


public class TestAndroidProject {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // capability or setup the device config
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setApp("/Users/aravindbalaji/Documents/Appium/Sample App/android-app.apk");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("29221JEGR00379");


        // provide the ip address and port number for appium
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        System.out.println("the app has been started");
        Thread.sleep(5000);
        driver.quit();

    }
}
