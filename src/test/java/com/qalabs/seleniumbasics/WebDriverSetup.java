package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class WebDriverSetup {
    public static WebDriver getDriver(String browser) {
        File rootPath = new File("src/test/resources/lib-thirdparty/driversforwin");
        if(browser.equals("chrome")) {
            File chromeFilePath = new File(rootPath, "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            File firefoxFilePath = new File(rootPath, "chromedriver.exe");
            System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
            return new FirefoxDriver();
        } else {
            return null;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        String browser = args[0];
        WebDriver driver = getDriver(browser);
        driver.get("https://www.google.com.mx");
        Thread.sleep(1000);
        driver.quit();
    }
}





