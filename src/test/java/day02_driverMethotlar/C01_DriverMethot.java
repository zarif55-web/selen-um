package day02_driverMethotlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethot {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();

        /* Biz browser'ları olusturdugumuz driver sayesinde  otomate edebiliyoruz.
           Bunun için her testin başında mutlaka driver objesi olusturacagız.
         */


        driver.get("https://www.amazon.com");
        //acılan sayfanın baslıgının amazon içerdiğini tespit edin

        String expectedKelime="amazon";
        String actualResult=driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title amazon içermiyor, test Failed");
        System.out.println(driver.getTitle());

        // gittiğimiz sayfaanın url'sinin "https://www.amazon.com/" oldugunu test edin

        String expectedurl="https://www.amazon.com/";
        String actualurl=driver.getCurrentUrl();

        if (actualurl.contains(expectedurl)){
            System.out.println("url testi PASSED");
        }else System.out.println("url testi FAILED");
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);
        driver.close();

    }
}
