package Automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

    public class AppiumBase {

        protected static AppiumDriver<MobileElement> driver;

        public static void setup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();


            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            caps.setCapability(MobileCapabilityType.UDID, "your_device_udid");

            //---------Environment Setup--------------//
            caps.setCapability(MobileCapabilityType.APP, "path/to/your/app.apk");
            //Example: Staging URL
            // URL url = new URL("http://staging/");
            //Example: Production URL
            URL url = new URL("http://production/");

            driver = new AndroidDriver<>(url, caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public static void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

