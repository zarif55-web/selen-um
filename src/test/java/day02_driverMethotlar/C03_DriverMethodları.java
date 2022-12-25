package day02_driverMethotlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());

        //pageSource'un MEOW içerdiğinini test edin

        String PageSource=driver.getPageSource();
        String expectedKelime="MEOW";

        if (PageSource.contains(expectedKelime)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");

        Thread.sleep(3000);

        driver.close();

    }
}
