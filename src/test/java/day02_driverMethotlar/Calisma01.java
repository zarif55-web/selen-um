package day02_driverMethotlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //2- Sayfa basligini(title) yazdirin
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        //3- Sayfa basliginin “Amazon” icerdigini test edin
        String expectedKelime="Amazon";
        String actualKelime=driver.getTitle();

        if (actualKelime.contains(expectedKelime)){
            System.out.println("sayfa basligi amazon içeriyor, test PASSED ");
        }else System.out.println("sayfa basligi amazon içermiyor, test FAILED");
        Thread.sleep(3000);
        //4- Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //5- Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("sayfa Url'si amazon içeriyor, test PASSED ");
        }else System.out.println("sayfa Url'si amazon içermiyor, test FAILED");
        Thread.sleep(3000);

        //6- Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());//CDwindow-FDA253900727841A2DCA0A2D1C534ACD
        //7- Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("alisveris");
        aramaKutusu.clear();
        Thread.sleep(3000);
        //8- Sayfayi kapatin.
        driver.close();


    }
}
