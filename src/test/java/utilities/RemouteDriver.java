package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class RemouteDriver {

    public static WebDriver driver;  // Olusturacagimiz remouteWebDriver'i icine atayacagimiz WebDriver olusturduk.

    public static WebDriver remouteChromeDriver(){ // Chrome icin remoteWebDriver üreten bir method olusturduk.

        ChromeOptions chromeOptions = new ChromeOptions();

        try {
            driver= new RemoteWebDriver(new URL("http://192.168.1.172:4444"),chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver remouteFirefoxDriver(){ // Firefox icin remoteWebDriver üreten bir method olusturduk.

        FirefoxOptions firefoxOptions = new FirefoxOptions();

        try {
            driver= new RemoteWebDriver(new URL("http://192.168.1.172:4444"),firefoxOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver remouteEdgeDriver(){ // Edge icin remoteWebDriver üreten bir method olusturduk.

        EdgeOptions edgeOptions = new EdgeOptions();

        try {
            driver= new RemoteWebDriver(new URL("http://192.168.1.172:4444"),edgeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver remouteIEDriver(){ // IE icin remoteWebDriver üreten bir method olusturduk.

        InternetExplorerOptions ieOptions = new InternetExplorerOptions();

        try {
            driver= new RemoteWebDriver(new URL("http://192.168.1.172:4444"),ieOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }
}
