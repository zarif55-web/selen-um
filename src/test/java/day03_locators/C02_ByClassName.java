package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    //amazona gidip nutella icin arama yapın
    //ilk sayfada cıkan urunlerin içerisinde
    //en yuksek fiyatı bulun

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutu = driver.findElement(By.id("twotabsearctextbox"));
        aramaKutu .sendKeys("nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));

        //WebElement bir obje oldugundan direkt yazdırılamaz

        for (WebElement each:fiyatlarListesi
             ) {
            System.out.print(each.getText() + " ");
        }


         /*en yuksek fıyatı bulabılmek ıcın java bılgımızı kullanmalıyız.
         1 - web elementlerden getText ıle fıyatı strıng olarak alın
         2- Strıng fiyatı kıyaslama yapabılmek için Integer'a çevirin
         3- en yuksek fıyatı bulup yazdırın
         
         */

        String sayi;
        int sayi1;
        int max=0;
        for (WebElement each: fiyatlarListesi
        ) {
            sayi= each.getText();
            sayi1=Integer.parseInt(sayi);
            if (sayi1>max){
                max=sayi1;
            }
        }

        System.out.println(max);


        Thread.sleep(3000);
        driver.close();





    }
}
