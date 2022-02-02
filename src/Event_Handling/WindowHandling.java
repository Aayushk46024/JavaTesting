package Event_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    String path;
    WebDriver driver;
    public void launch()
    {
        path = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.findElement(By.linkText("Click Here")).click();
        Set<String> id = driver.getWindowHandles();
        System.out.println("Id is :"+ id);
        Iterator<String> it = id.iterator();
        String parent_id = it.next();

        String child_id = it.next();
        System.out.println("Parent Window id is: "+ parent_id);
        System.out.println("Child Window id is: "+ child_id);

        driver.switchTo().window(child_id);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parent_id);
        System.out.println(driver.getTitle());

    }

    public static void main(String[] args) {
        WindowHandling oo = new WindowHandling();
        oo.launch();

    }
}
