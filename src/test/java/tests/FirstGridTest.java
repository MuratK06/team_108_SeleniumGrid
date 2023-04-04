package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static utilities.RemouteDriver.*;

public class FirstGridTest {

    WebDriver driver;


    @Test
    public void test01() {

        driver = remouteChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void test2() {

        driver = remouteIEDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void test3(){

        driver=remouteFirefoxDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getCurrentUrl());

    }
}
