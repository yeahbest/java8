package TestingUsingJava8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import javax.swing.JDialog;

/**
 * Created by Pawl on 4/20/2017.
 */
public class Second {
    public static final String firefox = "C:\\Users\\Pawl\\Desktop\\driver\\geckodriver.exe";
    public static final String geckodriver = "webdriver.gecko.driver";


    public static void main(String[] args) throws Exception{



        System.setProperty(geckodriver, firefox);
        WebDriver driver;
        driver = new FirefoxDriver();
        FluentWebDriver dd = new FluentWebDriver(driver);
        driver.manage().window().maximize();
        driver.get("http://etsy.com");


    //    Thread.sleep(5000);
        String ok = dd.element(By.className("sign-in-link")).element(By.xpath("//a[@id='sign-in']")).getText().toString();
        System.out.println(ok);
        dd.element(By.className("sign-in-link")).element(By.xpath("//a[@id='sign-in']")).click();
        System.out.println("clicked");

    }


    }

