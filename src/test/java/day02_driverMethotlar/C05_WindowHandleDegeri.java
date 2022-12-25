package day02_driverMethotlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        System.out.println(driver.getWindowHandle());//CDwindow-01C7EA9EA053B114E64CD489850B0EFA

        Thread.sleep(3000);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wisequarter.com");
        System.out.println(driver.getWindowHandle());//CDwindow-B9B36ED78A82436E85445E0DBE92ECE2
        Thread.sleep(3000);
        driver.quit();





    }
}
