package Week01_Tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar05_TekrarTest {
    public static void main(String[] args) throws InterruptedException {
        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedBaslik="youtube";
        String actualBaslik=driver.getTitle();
        if (actualBaslik.contains(expectedBaslik)){
            System.out.println("baslik testi PASSED");
        }else System.out.println("baslik testi FAILED "+ actualBaslik);
        Thread.sleep(3000);

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        //içermiyorsa doğru URL'yi yazdırın.
        String sayfaUrl="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(sayfaUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED " + actualUrl);
        Thread.sleep(3000);

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        //7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(2000);

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //   Yoksa doğru başlığı(Actual Title) yazdırın.
        String amazonBaslik="Amazon";
        String actualAmazon=driver.getTitle();
        if (actualAmazon.contains(amazonBaslik)){
            System.out.println("baslik testi PASSED");
        }else System.out.println("baslik testi FAILED "+ actualAmazon);
        Thread.sleep(3000);

        //11.Sayfayi kapatin
        driver.close();
    }
}
