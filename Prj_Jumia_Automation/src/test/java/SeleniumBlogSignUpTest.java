import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumBlogSignUpTest {

    private WebDriver driver;

    @Test

   public void  start() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");


        //Selenium Automation Project Using Chrome Driver//

        //OPen the Chrome Driver//
        driver= new ChromeDriver();

        //OPen Online Shopping Website//

        driver.get("https://www.jumia.com.ng");

//Maximize the browser//

        driver.manage().window().maximize();

//To get Jumia Online Shopping Page Title

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.get("https://www.jumia.com.ng/sp-marketplace-vendor/");

        //System.out.println("Jumia Shopping Page Title is :" + driver.getTitle());

       // Click on Sign In button

        driver.findElement(By.id("dpdw-login")).click();

driver.findElement(By.xpath("/customer/account/login/?return=%2F\" class=\"btn _prim -fw _md\">Sign In</a>\n")).click();

//Enter Emaail
driver.findElement(By.name("email")).sendKeys();

//Enter Password
driver.findElement(By.name("password")).sendKeys();














driver.close();


    }

}
