package day02_driverMethotlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /* implicitlyWait gittiğimiz sayfa acılıncaya veya aradıgımız webelement bulununcaya kadar
           driver'in bekleyebılecegı maxımım sureyi belirler

           **** Bu dortlu her test method'unun basına yazılacak
 */


        Thread.sleep(3000);
        driver.close();
    }
}
