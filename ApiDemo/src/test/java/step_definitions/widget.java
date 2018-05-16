package step_definitions;

import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class widget {

    public AndroidDriver<AndroidElement> driver = null;
//    public static WebDriver driver = null;

    @Given("^I am on Homescreen$")
    public void i_am_on_Homescreen() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Welcome to testing");
        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "max1");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        System.out.println("Welcome to testing 2");

        //Send connection to the server
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

//        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    }

//    @Given("^I tap Preference$")
//    public void i_tap_Preference() throws Throwable {
//        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//    }
//
//    @Given("^I tap Preference Dependencies$")
//    public void i_tap_Preference_Dependencies() throws Throwable {
//        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//    }
//
//    @Given("^I check the tooltip box$")
//    public void i_check_the_tooltip_box() throws Throwable {
//        driver.findElementById("android:id/checkbox").click();
////        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
//    }

}
