package appiumSuport;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by daria.
 */
public class CapabilityClass {
    private DesiredCapabilities capabilities;

    CapabilityClass() {
    }

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

    public class Builder {

        public Builder() {
            capabilities = new DesiredCapabilities();
        }


        public Builder setPlatformName(String platform) {
            capabilities.setCapability("platformName", platform);
            return this;
        }

        public Builder setPlatformVersion(String version) {
            capabilities.setCapability("platformVersion", version);
            return this;
        }

        public Builder setDeviceName(String device) {
            capabilities.setCapability("deviceName", device);
            return this;
        }

        public Builder setAutomationName(String name) {
            capabilities.setCapability("automationName", name);
            return this;
        }

        public Builder setApp(String path) {
            capabilities.setCapability("app", path);
            return this;
        }

        public DesiredCapabilities build() {
            return capabilities;
        }
    }
}
