package day02_driverMethotlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //get ile aynı iş yapar

        Thread.sleep(3000);

        driver.get("https://wisequarter.com");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        //tekrar wisequrter'a gitmek istersek
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.close();
    }
}
