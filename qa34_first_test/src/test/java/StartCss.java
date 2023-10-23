import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartCss {
    WebDriver wd;


    @Test
    public void startCssLocators() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement elem1 = wd.findElement(By.id("root"));
        WebElement elem2 = wd.findElement(By.tagName("a"));

        List<WebElement> list = wd.findElements(By.tagName("a")); //all elements by tagname a (sum 3)

        wd.findElement(By.className("container"));

        //I don't use it as it is a very old and slow strategy, but if needed...
        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("LOG"));
    }
}