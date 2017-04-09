package TestingUsingJava8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Pawl on 4/6/2017.
 */
public class First {
    public static final String firefox = "C:\\Users\\Pawl\\Desktop\\driver\\geckodriver.exe";
    public static final String geckodriver = "webdriver.gecko.driver";

    public static void main(String[] args) {
        System.setProperty(geckodriver,firefox);
                WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://toolsqa.wpengine.com/automation-practice-table");
                String sRow = "1";
                String sCol = "2";

                //Here we are locating the xpath by passing variables in the xpath
                String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
                System.out.println(sCellValue);
                String sRowValue = "Clock Tower Hotel";

                //First loop will find the 'ClOCK TWER HOTEL' in the first column
                for (int i=1;i<=5;i++){
                    String sValue = null;
                    sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
                    if(sValue.equalsIgnoreCase(sRowValue)){
                        // If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row
                        for (int j=1;j<=5;j++){
                            String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
                            System.out.println(sColumnValue);
                        }
                        break;
                    }
                }


            List<WebElement> list=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[1]/td"));
            List<WebElement> list2=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[1]/td"));
            List<String>currentOptions=new ArrayList<>();
        for (WebElement match : list2) {
            currentOptions.add(match.getText());
        }
        System.out.println("before 8");

        System.out.println(currentOptions);

        System.out.println("after");
        List<String>ss= list.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(ss);
       ss.sort(Comparator.naturalOrder());
//        list.stream().map(if(list.contains("sdd")) {

        }



            }



