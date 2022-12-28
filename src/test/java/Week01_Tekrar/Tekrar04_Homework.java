package Week01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar04_Homework {
    public static void main(String[] args) throws InterruptedException {
        //1.Yeni bir class olusturalim (Homework)
        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String expectedKelime="facebook";
        String actualKelime=driver.getTitle();
        if (actualKelime.contains(expectedKelime)){
            System.out.println("Title testi PAASED");
        }else System.out.println("Title testi FAILED "+ actualKelime);
        Thread.sleep(3000);

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.
        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi PAASED");
        }else System.out.println("Url testi FAILED "+ actualUrl);
        Thread.sleep(3000);

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitle="Walmart.com";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("baslik testi PAASED");
        }else System.out.println("baslik yesti FAİLED");
        Thread.sleep(3000);

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //9.Browser’i kapatin
        driver.close();
    }
}
