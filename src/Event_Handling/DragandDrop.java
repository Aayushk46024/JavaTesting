package Event_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
    String path;
    WebDriver driver;
    public void launch()  {
        path = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);
        Actions act = new Actions(driver);
        act.clickAndHold(driver.findElement(By.id("draggable")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .release().build().perform();

        driver.close();
    }
    public static void main(String[] args) {
        DragandDrop oo = new DragandDrop();
        oo.launch();

    }
}
