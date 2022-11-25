package testcase;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

public class TestGird {
    @Test
    public void testChrome() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WINDOWS);
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.1.170:4444/wd/hub"), capability);
        driver.get("http://www.baidu.com");
        driver.quit();

    }

    @Test
    public void testEdge() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("MicrosoftEdge");
        capability.setPlatform(Platform.WINDOWS);
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.1.170:4444/wd/hub"), capability);
        driver.get("http://www.baidu.com");
        driver.quit();

    }


}