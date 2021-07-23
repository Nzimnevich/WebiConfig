package config;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTest {
    SeleniumConfig config = ConfigFactory.create(SeleniumConfig.class,System.getProperties());

    @Test
    public void testWebDriver() {
        final WebDriver driver = createWebDriver();
        driver.get("https://alpha.webinar.ru/");
        driver.quit();
    }

    private WebDriver createWebDriver(){
        if (config.isRemote()) {
            return new RemoteWebDriver(
                    config.getRemoteURL(),
                    DesiredCapabilities.chrome());
        } else {
            return new ChromeDriver();
        }
    }
}
