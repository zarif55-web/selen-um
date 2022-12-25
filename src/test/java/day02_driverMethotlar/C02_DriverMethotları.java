package day02_driverMethotlar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethotları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorme.driver","src/drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();

        //sayfayı tam ekran yapalım

        driver.manage().window().maximize();
        System.out.println("maximize'e window boyutlar :" + driver.manage().window().getSize());
        System.out.println("maximize'e window konum :" + driver.manage().window().getPosition());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen ekran boyutları :" + driver.manage().window().getSize());
        System.out.println("fullscreen ekran konum :" + driver.manage().window().getPosition());

        //browser'e istedğimiz konuma ve boyuta getirelim

         driver.manage().window().setPosition(new Point(100,100));
         driver.manage().window().setSize(new Dimension(300,300));

        Thread.sleep(3000);

        driver.close();

    }
}
