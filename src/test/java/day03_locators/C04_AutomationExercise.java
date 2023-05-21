package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
public class C04_AutomationExercise {
    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> sayfadakiLinkElementleri= driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=sayfadakiLinkElementleri.size();
        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else {
            System.out.println("Link sayisi testi FAILED");
        }


        //4- Products linkine tiklayin
        WebElement productsLinkElementi= driver.findElement(By.xpath("//*[text()=' Products']"));
        productsLinkElementi.click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi= driver.findElement(By.xpath("//img[@id='sale_image']"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else{
            System.out.println("special offer testi FAILED");
        }

        //6- Sayfayi kapatin
        driver.close();
        // hocam bu sayfayla alakali orda reklam geliyor.o mu hata veriyor
        //aynen sonra goremiyor sonraki sayfayi tamam hocam çalıtırdı ya
        //  anladım yani hocam bu a alakali tr de reklam geliyor eu da gelmiyor
        // tmam hocam sıkıntı yok
        //teşekkür ederim:)
    }
}




