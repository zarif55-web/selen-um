package Week01_Tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tekrar06_WebElements {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        Thread.sleep(2000);

        //3- Category bolumundeki elementleri locate edin
        WebElement category= driver.findElement(By.id("twotabsearchtextbox"));
        //4- Category bolumunde 3 element oldugunu test edin
        if (category.equals(category.getText())){
            System.out.println("Link listesi testi PASSED");
        }else{
            System.out.println("Sayfada  adet link var, test FAILED");
        }
        Thread.sleep(2000);
        //5- Category isimlerini yazdirin
        //6- Sayfayi kapatin
        driver.close();
    }
}
