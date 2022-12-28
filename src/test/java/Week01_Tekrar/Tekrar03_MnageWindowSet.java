package Week01_Tekrar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar03_MnageWindowSet {
    public static void main(String[] args) throws InterruptedException {

        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(6,6));
        Thread.sleep(3000);

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        //8. Sayfayi kapatin
        driver.close();
    }
}
